package com.oar.app.pojo;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrainDao {
	@Autowired
		SessionFactory sessionFactory;
	public Train saveTrain(Train  train) {
	
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(train);
		transaction.commit();
		session.close();
		return train;
		
	}

}
