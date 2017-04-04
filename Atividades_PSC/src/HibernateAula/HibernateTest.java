package HibernateAula;


import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class HibernateTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatetest");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transation = em.getTransaction();
		transation.begin();
		
		BasicClassHibernate newObject = new BasicClassHibernate();
						
		newObject.setId(1); 
		newObject.setName("any");
		newObject.setPrice(12.50000);
		newObject.setBirthday(new Date(Calendar.getInstance().getTimeInMillis()));				
		
		em.persist(newObject);
		transation.commit();

		emf.close();
		em.close();	
	}

}
