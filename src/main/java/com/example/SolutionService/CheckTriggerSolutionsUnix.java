package com.example.SolutionService;
import com.jcraft.jsch.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class CheckTriggerSolutionsUnix {

        private static final String REMOTE_HOST = "1.1.1.1";
        private static final String USERNAME = "";
        private static final String PASSWORD = "";
        private static final int REMOTE_PORT = 22;
        private static final int SESSION_TIMEOUT = 10000;
        private static final int CHANNEL_TIMEOUT = 5000;

        public void executeShellScript(String hostname){

            String remoteShellScript = "/root/hello.sh";

            Session jschSession = null;

            try {

                JSch jsch = new JSch();
                jsch.setKnownHosts("/home/mkyong/.ssh/known_hosts");
                jschSession = jsch.getSession(USERNAME, REMOTE_HOST, REMOTE_PORT);

                // not recommend, uses jsch.setKnownHosts
                //jschSession.setConfig("StrictHostKeyChecking", "no");

                // authenticate using password
                jschSession.setPassword(PASSWORD);

                // 10 seconds timeout session
                jschSession.connect(SESSION_TIMEOUT);

                ChannelExec channelExec = (ChannelExec) jschSession.openChannel("exec");

                // run a shell script
                channelExec.setCommand("sh " + remoteShellScript + " mkyong");

                // display errors to System.err
                channelExec.setErrStream(System.err);

                InputStream in = channelExec.getInputStream();

                // 5 seconds timeout channel
                channelExec.connect(CHANNEL_TIMEOUT);

                // read the result from remote server
                byte[] tmp = new byte[1024];
                while (true) {
                    while (in.available() > 0) {
                        int i = in.read(tmp, 0, 1024);
                        if (i < 0) break;
                        System.out.print(new String(tmp, 0, i));
                    }
                    if (channelExec.isClosed()) {
                        if (in.available() > 0) continue;
                        System.out.println("exit-status: "
                                + channelExec.getExitStatus());
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ee) {
                    }
                }

                channelExec.disconnect();

            } catch (JSchException | IOException e) {

                e.printStackTrace();

            } finally {
                if (jschSession != null) {
                    jschSession.disconnect();
                }
            }

        }
    }

