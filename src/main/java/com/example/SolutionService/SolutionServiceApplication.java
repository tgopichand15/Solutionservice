package com.example.SolutionService;

import com.example.client.FetchDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
@EnableEurekaClient
public class SolutionServiceApplication {

	@Autowired
	public CheckUnresolvedIssue checkunresolvedissue;

	@Autowired
	public FetchDataClient fetchdataclient;

	@Autowired
	public CheckTriggerSolutionsUnix checktriggerunix;

	@Autowired
	public CheckTriggerSolutionsWindows checktriggerwindows;





	public static void main(String[] args) {

		SpringApplication.run(SolutionServiceApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringInjection.xml");
		CheckUnresolvedIssue c = (CheckUnresolvedIssue)context.getBean("CheckUnresolvedIssue");

		System.out.println("c is "+c);

		System.out.println("fetchdataclient object is  is "+c.getFetchdataclient());






	}

}
