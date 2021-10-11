package com.example.SolutionService;

import com.example.client.FetchDataClient;
import com.example.entities.UnresolvedIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class IssuestoBeforwarededtoActionservice {

    @Autowired
    private FetchDataClient fetchdataclienttest;

    @Controller
    @RequestMapping(value = "Issues_to_be_forwared_to_actionService")
    public List<UnresolvedIssue> fetchUnresolvedissues(){


        List<UnresolvedIssue> l=fetchdataclienttest.fetchUnresolvedIssue();

        return l;

    }





}
