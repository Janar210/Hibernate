package HibernateProject1;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import HibernateConn.TaskManagement;

public class Hibernate {

	public static void main(String[] args) throws Exception{
		TaskManagement t = new TaskManagement();
		t.setTaskName("Task No 1");
		t.setTaskName("Task No 2");
		t.setTaskName("Task No 3");
		t.setTaskName("Task No 4");
		t.setTaskName("Task No 5");
		t.setTaskName("Task No 6");
		t.setTaskName("Task No 7");
		
		t.setTaskId(1);
		t.setTaskId(2);
		t.setTaskId(3);
		t.setTaskId(4);
		t.setTaskId(5);
		t.setTaskId(6);
		t.setTaskId(7);
		
		t.setDueDate(Date.valueOf("2013-05-05"));
		t.setDueDate(Date.valueOf("2019-05-03"));
		t.setDueDate(Date.valueOf("2014-06-02"));
		t.setDueDate(Date.valueOf("2019-05-10"));
		t.setDueDate(Date.valueOf("2019-06-07"));
		t.setDueDate(Date.valueOf("2013-05-04"));
		t.setDueDate(Date.valueOf("2022-05-05"));
		
		t.setStartDate(Date.valueOf("2007-04-02"));
		t.setStartDate(Date.valueOf("2018-03-05"));
		t.setStartDate(Date.valueOf("2010-06-10"));
		t.setStartDate(Date.valueOf("2018-05-04"));
		t.setStartDate(Date.valueOf("2017-06-02"));
		t.setStartDate(Date.valueOf("2008-06-05"));
		t.setStartDate(Date.valueOf("2022-05-05"));
		
		t.setPriority("Low");
		t.setPriority("High");
		t.setPriority("Medium");
		t.setPriority("High");
		t.setPriority("Medium");
		t.setPriority("Low");
		t.setPriority("Low");
		
		t.setStatus("Closed");
		t.setStatus("Open");
		t.setStatus("Closed");
		t.setStatus("Open");
		t.setStatus("Open");
		t.setStatus("Closed");
		t.setStatus("Open");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

}