package com.example.client;

import com.example.entities.IssueUrlMapping;
import com.example.entities.UnresolvedIssue;
import com.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchDataClient {

    /*public static void main(String[] args) {
        Issues issues = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            issues = session.get(Issues.class, 1);
            System.out.println(issues);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }*/

        /*public static List<UnresolvedIssues> getCount () {
            Query query = session.createQuery("From UnresolvedIssue");
            List<UnresolvedIssues> l = query.list;
            return l;
        }


        private static void fetchUpdateIssueByHostname (Session session){
            Employee e = session.get(Employee.class, 1);

            if (e == null) {
                System.out.println("employee with provided id does not exist");
            } else {
                e.setSalary(50000);
                session.beginTransaction();

                session.update(e);

                session.getTransaction().commit();
                System.out.println(e);
            }
        }




    public static String fetchUrl(String issuename) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("Select URL from IssueURLMapping where issuename =:issuename");
            query.setParameter("issuename", issueame);
            session.beginTransaction();
            session.getTransaction().commit();
            IssueUrlMapping i = ((ExistingIssue) query.uniqueResult());
            return i.getURL();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return null;
    }*/


    public static List<UnresolvedIssue> fetchUnresolvedIssue(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("from UnresolvedIssue");
            session.beginTransaction();
            session.getTransaction().commit();
            List<UnresolvedIssue> u= ((List<UnresolvedIssue>) query.list());
            return u;
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return null;
    }



}

