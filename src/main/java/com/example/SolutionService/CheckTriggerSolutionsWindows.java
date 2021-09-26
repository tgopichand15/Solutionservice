package com.example.SolutionService;

public class CheckTriggerSolutionsWindows {



    //add loggint to this
    //basic script execution functionality
    public void executeScript(String hostname,String path){
        try {

            Process p = new ProcessBuilder()
                    .inheritIO()
                    .command("invoke-command", "-computername", "Server1",
                            "-filepath", "C:\\scripts\\script.ps1").start();
            p.waitFor();
        }
        catch(Exception e){
            e.printStackSpace();
        }

    }
}
