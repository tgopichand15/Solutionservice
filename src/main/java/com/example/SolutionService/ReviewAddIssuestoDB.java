package com.example.SolutionService;

import com.example.client.SaveDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

//oinserting issues status to DB
@Component
public class ReviewAddIssuestoDB {

    @Autowired
    private SaveDataClient savedataclienttest;

    boolean AddIssuestoDb(HashMap<String,String> resolvedissues, HashMap<String,String> unresolvedissues) {


        try {

            savedataclienttest.createIssues(List<ResolvedIssue> r) ;
            savedataclienttest.createUnresolvedIssues(List<UnresolvedIssue> u);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;


    }
}
