package com.example.SolutionService;

import org.springframework.beans.factory.annotation.Autowired;

//oinserting issues status to DB

public class ReviewAddIssuestoDB {

    @Autowired
    private SaveDataClientTest savedataclienttest;

    boolean AddIssuestoDb(HashMap<String,String> resolvedissues,Hashmap<String,String> unresolvedissues,savedataclienttesrt){


    try {

        savedataclienttest.createIssues(HahMap < String, String > resolvedissues);
        savedataclinettest.createUnresolvedIssues(HashMap < String, String > unresolvedissies);

    }
    catch(Exception e){
        e.printstacktrace();
        return false;
    }

    return true;



}
