package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VerifyUser {
	
	public static boolean verify(String name, String password) {

        Transaction transaction = null;
        UserProfile user = null;
        try (Session session = HibUtil.getSessionFactory().openSession()) {
            
        	  transaction = session.beginTransaction();
           
            user = (UserProfile) session.createQuery("FROM UserProfile X WHERE X.name = :name").setParameter("name", name)
                .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
           
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                //transaction.rollback();
            }
            e.printStackTrace();
       
        }
        return false;
    }
		
}

