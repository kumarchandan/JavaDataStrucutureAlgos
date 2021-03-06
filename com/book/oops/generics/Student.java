package com.book.oops.generics;

public class Student implements Person {
	
	String id;
	String name;
	int age;
	
	public Student(String i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	protected int studyHours(){
		return age/2;
	}
	
	public String getId(){
		return id;
	}
	
	@Override
	public boolean equalTo(Person other) {
		Student otherStudent = (Student) other;
		return id.equals(otherStudent.getId());
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	public String toString(){
		return "Student Id: "+id+" Name: "+name+" Age: "+age;
	}

}
