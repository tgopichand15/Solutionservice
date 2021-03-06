package com.example.client;

import com.example.entities.ResolvedIssue;
import com.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.example.entities.IssueUrlMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaveDataClient {


	//code to insert resolved isseus
	/*private static void createissues(){

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getIssue());
			System.out.println("Issue is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}


	}*/

	
	/*private static ResolvedIssues getIssue(){
		Issues issues=new Issues();
		issues.setDescription("CPU is increased");
		issues.setIssuename("CPU");
		issues.setHostname("10.20.200.190");
		issues.setCount(0);
		return issues;
	}*/


   // codee to push unresolved issues
	/*private static void createunresolvedissues(){

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getunresolvedIssue());
			System.out.println("Issue is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}


	}*/


	/*private static UnresolvedIssues getunresolvedIssue (){
		Issues issues=new Issues();
		issues.setDescription("CPU is increased");
		issues.setIssuename("CPU");
		issues.setHostname("10.20.200.190");
		issues.setCount(0);
		return issues;
	}*/


	public static void createIssues(List<ResolvedIssue> issues){

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
				foreach(ResolvedIssue r:issues){
					session.beginTransaction();
					Integer id = (Integer) session.save(r);
					System.out.println("ResolvedIssue updated in DB with ID::" + id);
					session.getTransaction().commit();
				}
		}
		catch (HibernateException e) {
				e.printStackTrace();
			}

		}

	public static void createUnresolvedIssues(List<UnresolvedIssue> issues){

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			foreach(UnresolvedIssue u : issues){
				session.beginTransaction();
				Integer id = (Integer) session.save(u);
				System.out.println("ResolvedIssue updated in DB with ID::" + id);
				session.getTransaction().commit();
			}
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}

	}


	private static IssueUrlMapping getIssueMapping (){
		IssueUrlMapping issueMapping=new IssueUrlMapping();
		issueMapping.setIssuename("CPUWindows");
		issueMapping.setURL("ttps://github.com/tgopichand15/Hibernatenew/blob/main/.gitignore");
		return issueMapping;
	}





	private static void createIssueUrlMapping(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getIssueMapping());
			System.out.println("IssueMapping is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	/*public static void main(String[] args){
		SaveDataClient s=new SaveDataClient();
		s.createIssueUrlMapping();
	}*/

}
