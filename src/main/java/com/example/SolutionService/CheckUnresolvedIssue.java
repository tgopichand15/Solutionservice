package com.example.SolutionService;

import com.example.client.FetchDataClient;
import com.example.entities.UnresolvedIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.entities.UnresolvedIssue;

@Component
public class CheckUnresolvedIssue {


    FetchDataClient fetchdataclient;

    DownloadFilesfromGithub d;

    @Autowired
    public CheckUnresolvedIssue(FetchDataClient f,DownloadFilesfromGithub df){
        this.fetchdataclient=f;
        this.d=df;
    }

    public DownloadFilesfromGithub getD() {
        return d;
    }

    public void setD(DownloadFilesfromGithub d) {
        this.d = d;
    }

    public FetchDataClient getFetchdataclient() {
        return fetchdataclient;
    }

    public void setFetchdataclient(FetchDataClient fetchdataclient) {
        this.fetchdataclient = fetchdataclient;
    }


    public CheckUnresolvedIssue(){

    }


    //CheckUnresolvedIssue u=new CheckUnresolvedIssue();

    //System.out.println("checkresolvedIssue object is "+u);

    /*List<UnresolvedIssue> l=u.getFetchdataclient().fetchUnresolvedIssue();

    foreach(UnresolvedIssue u : l){
        String issue=u.getissuename();
        String url=u.getFetchdataclient().fetchUrl(issue);
        String filename="/Users/Test_"+"issue"+".zip";
        u.getD().downloadFileFromUrlWithJavaIO(filename,url);
    }*/








}
