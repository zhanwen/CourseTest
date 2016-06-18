package com.syhily;

import java.util.Arrays;

public class Student {
	
	private String id;	//学生id
		
	private String[] course;	//课程
		
	private double[] score;		//分数
	
	private boolean civil = false; //false 为不是班委，true是班委
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}
	
	public void setCivil(boolean civil) {
		this.civil = civil;
	}
	
	public boolean isCivil() {
		return civil;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", course=" + Arrays.toString(course) + ", score=" + Arrays.toString(score)
				+ ", civil=" + civil + "]";
	}
	
}
