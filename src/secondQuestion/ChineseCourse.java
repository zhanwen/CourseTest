package secondQuestion;

import java.util.Arrays;

public class ChineseCourse implements ClassSort {

	private String id;
	private double score;
	
	public ChineseCourse(String id, double score) {
		this.id = id;
		this.score = score;
	}
	
	public ChineseCourse() {
		
	}
	
	
	private ChineseCourse[] c; 
	
	public void setCC(ChineseCourse[] cc) {
		c = cc;  
	}
	
	@Override
	public int ScoreSort() {
		double temp;
		for(int i = 0; i < c.length-1; i++) {
			for(int j = i+1; j < c.length; j++) {

				if(c[i].score < c[j].score) {
					temp = c[i].score; 
					c[i].score = c[j].score;
					c[j].score = temp;
				}
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].id + "=====" + c[i].score);
		}
		
		return 0;
	}

	@Override
	public void ScoreLevel() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "ChineseCourse [id=" + id + ", score=" + score + "]";
	}
	

}
