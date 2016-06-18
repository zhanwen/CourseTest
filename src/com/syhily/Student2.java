package com.syhily;

public class Student2 {
	private String id;
	private String course;
	private double score;
	
	private static double sum = 0.0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void EntireScore(double n) {
		sum += n;
	}
	
	public static double getAverage(int n) {
		return sum / n;
	}
	
	
}
