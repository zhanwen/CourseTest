package com.syhily;

public class Student2Test {

	private final static int N = 100;
	
	public static void main(String[] args) {
		
		Student2[] s = new Student2[N];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student2();
			s[i].setId(i + 1 + "");
			s[i].setCourse("Chinese");
			double temp = Math.round(Math.random()*100);
			s[i].setScore(temp);
			s[i].EntireScore(temp);
		}
		
		for(Student2 stu : s) {
			if(stu.getScore() < 60) {
				System.out.println(stu.getId() + " " + stu.getCourse() + " " + stu.getScore());
			}
		}
		
		System.out.println(Student2.getAverage(N));
		
		
		
	}
	
}
