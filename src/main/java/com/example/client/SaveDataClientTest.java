package com.example.client;

import com.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class SaveDataClientTest {


	//code to insert resolved isseus
	private static void createissues{

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getIssue());
			System.out.println("Issue is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}


	}

	
	private static ResolvedIssues getIssue (){
		Issues issues=new Issues();
		issues.setDescription("CPU is increased");
		issues.setIssuename("CPU");
		issues.setHostname("10.20.200.190");
		issues.setCount(0);
		return issues;
	}


   // codee to push unresolved issues
	private static void createunresolvedissues{

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getunresolvedIssue());
			System.out.println("Issue is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}


	}


	private static UnresolvedIssues getunresolvedIssue (){
		Issues issues=new Issues();
		issues.setDescription("CPU is increased");
		issues.setIssuename("CPU");
		issues.setHostname("10.20.200.190");
		issues.setCount(0);
		return issues;
	}
}
