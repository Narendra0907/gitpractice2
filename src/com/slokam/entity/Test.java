package com.slokam.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import SessionObject.SessionObject;

public class Test {

	public static void insertData() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		Person p=new Person();
		p.setPersonName("narendra");
		p.setPersonSal(1000.00);
		Passport passport=new Passport("123qwe","2345new",p);
		s.save(passport);
		t.commit();
		s.close();
	}
	public static void insertData1() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		Person p=new Person();
		p.setPersonName("narendra");
		p.setPersonSal(1000.00);
		
		Passport passport=new Passport("123qwe","2345new");
		p.setPassport(passport);
		s.save(p);
		t.commit();
		s.close();
	}
	public static void insertDataAll() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		
		
		Person p=new Person();
		p.setPersonName("narendra");
		p.setPersonSal(1000.00);
		
		Passport passport=new Passport("123qwe","2345new");
		passport.setPer(p);
		
		Mobiles m=new Mobiles("redmi","jio",p);
		Mobiles m1=new Mobiles("realme","bsnl",p);
		
		ArrayList<Mobiles> mm=new ArrayList<>();
		mm.add(m);
		mm.add(m1);
		
		
	
		
		Courses courses=new Courses("java",34);
		Courses courses1=new Courses("java",34);
		HashSet<Courses> cc=new HashSet <>();
		cc.add(courses);
		cc.add(courses1);
		
		ArrayList<Person> al=new ArrayList<>();		
		al.add(p);
		
		p.setPassport(passport);
		p.setCourses(cc);
		p.setMobiles(mm);
		
		s.save(p);
		t.commit();
		s.close();
	}
	public static void insertData2() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		Person p=new Person();
		p.setPersonName("narendra");
		p.setPersonSal(1000.00);
		
		Mobiles m=new Mobiles("redmi","jio",p);
		Mobiles m1=new Mobiles("redmi","jio",p);
		ArrayList<Mobiles> mm=new ArrayList<>();
		mm.add(m);
		mm.add(m1);
		
		p.setMobiles(mm);
		s.save(p);
		t.commit();
		s.close();
	}
	public static  void deleteData() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		Courses courses = (Courses) s.get(Courses.class, 1);
		System.out.println(courses);
	}
	public static  void updateData1() {
		Session s = SessionObject.sessionObject();
		Transaction t = s.beginTransaction();
		Courses courses = (Courses) s.get(Courses.class, 1);
		List<Person> po = courses.getPo();
		for(Person aa:po) {
			System.out.println(aa);
		}
		System.out.println(courses);
	}
	public static void main(String[] args) {
		String name="sachin";
		System.out.println(name.hashCode());
	}
}
