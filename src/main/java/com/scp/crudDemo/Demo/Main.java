package com.scp.crudDemo.Demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student student=new Student(1, "ABC", "XYZ", 77);
		Student student1=new Student(2, "DEF", "SER", 78);
		Student student2=new Student(3, "HIJ", "LKJ", 79);
		Student student3=new Student(4, "KLM", "SGF", 80);
		Student student4=new Student(5, "NOP", "SSF", 81);
		
		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		@SuppressWarnings("unchecked")
		Query<Student> query=session.createQuery("from Student");
		@SuppressWarnings("deprecation")
		List<Student> l=query.list();
		for(Student s:l) {
			System.out.println(s.getRoll_number()+"\t"+s.getStud_Name()+"\t"+s.getStud_Address()+"\t"+s.getStud_Marks());
		}
		
		
		transaction.commit();
		session.close();
	}

	
}
