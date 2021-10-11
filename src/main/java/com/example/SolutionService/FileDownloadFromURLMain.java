package com.example.SolutionService;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;


@Component
public class FileDownloadFromURLMain {

    public  void main(String[] args) {

        String dirName = "/Users/Arpit/Desktop/Blog";

        try {

            System.out.println("---------------------------");
            System.out.println("Downloading file from github using java file IO");

            // Using java IO
            downloadFileFromUrlWithJavaIO(
                    dirName + "/sampleFile1.zip",
                    "https://github.com/arpitmandliya/SpringRestfulWebServicesWithJSONExample/archive/master.zip");

            System.out.println("Downloaded file from github using java file IO");
            System.out.println("---------------------------");
            System.out.println("Downloading file from github using apache common IO");

            // Using Apache common IO
            downloadFileFromUrlWithCommonsIO(
                    dirName + "/sampleFile2.zip",
                    "https://github.com/arpitmandliya/SpringSecurityHelloWorldExample/archive/master.zip");

            System.out.println("Downloaded file from github using apache common IO");
            System.out.println("---------------------------");
            System.out.println("Downloading file from github using NIO");

            // Using NIO
            downloadFileFromURLUsingNIO(
                    dirName + "/sampleFile3.zip",
                    "https://github.com/arpitmandliya/SpringMVCHelloWorldExample/archive/master.zip");

            System.out.println("Downloaded file from github using NIO");
            System.out.println("---------------------------");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Using Java IO
    public static void downloadFileFromUrlWithJavaIO(String fileName, String fileUrl)
            throws MalformedURLException, IOException {
        BufferedInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            URL fileUrlObj=new URL(fileUrl);
            inStream = new BufferedInputStream(fileUrlObj.openStream());
            outStream = new FileOutputStream(fileName);

            byte data[] = new byte[1024];
            int count;
            while ((count = inStream.read(data, 0, 1024)) != -1) {
                outStream.write(data, 0, count);
            }
        } finally {
            if (inStream != null)
                inStream.close();
            if (outStream != null)
                outStream.close();
        }
    }

    // Using common IO
    public static void downloadFileFromUrlWithCommonsIO(String fileName,
                                                        String fileUrl) throws MalformedURLException, IOException {
        FileUtils.copyURLToFile(new URL(fileUrl), new File(fileName));
    }

    // Using NIO
    private static void downloadFileFromURLUsingNIO(String fileName,String fileUrl) throws IOException {
        URL url = new URL(fileUrl);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fOutStream = new FileOutputStream(fileName);
        fOutStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fOutStream.close();
        rbc.close();
    }

}

