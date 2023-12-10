package com.obj.creation.in.five.ways;

public class Student {
	private String name="ramesh";
	private String college="vidya vikas";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}
	public static void main(String[] args) {
		try {
			  String className = "com.obj.creation.in.five.ways";
	            Class clasz = Class.forName(className);
	            Student student = (Student) clasz.newInstance ();
	            System.out.println(student.getName());
	            System.out.println(student.getCollege());			
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
