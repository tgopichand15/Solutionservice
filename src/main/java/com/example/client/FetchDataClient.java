/*package com.example.client;

import com.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class FetchDataClient {

	public static void main(String[] args) {
		Issues issues = null;
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	issues = session.get(Issues.class, 1);
	    	System.out.println(issues);
		} catch (HibernateException e) {
			e.printStackTrace();
		}

       public static List<UnresolvedIssues> getCount(){
            Query query = session.createQuery("From UnreolsvedIssues");
            List<UnresolvedIssues> l=query.list;
            return l;
	    }






        /*private static void fetchUpdateIssueByHostname(Session session){
			Employee e=session.get(Employee.class,1);

			if(e==null){
				System.out.println("employed with provided id does not exist");
			}
			else{
				e.setSalary(50000);
				session.beginTransaction();

				session.update(e);

				session.getTransaction().commit();
				System.out.println(e);
			}
		}
	    
	  }
}*/
