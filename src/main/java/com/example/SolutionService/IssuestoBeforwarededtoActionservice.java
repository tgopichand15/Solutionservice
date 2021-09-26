package com.example.SolutionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.Util.*;

@RestController
public class IssuestoBeforwarededtoActionservice {

    @Controller
    @RequestMapping(value = "Issues_to_be_forwared_to_actionService")

    public void List<UnresolvedIssues> fetchUnresolvedissues(){

        @Autowired
         private FetchDataClientTest fetchdataclienttest;

        List<UnresolvedIssues> l=fetchdataclienttest.getUnresolvedIssues();

        return l;

    }





}
