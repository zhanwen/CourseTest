package com.syhily;

public class StudentTest {
	
	private final static int N = 3;
	
	public static void main(String[] args) {
		Student[] s = new Student[N];
		
		s[0] = new Student();
		s[0].setId("1");
		s[0].setCourse(new String[]{"Chinese", "Math", "Science", "Computer"});
		s[0].setScore(new double[] {90, 80, 50, 60});
		s[0].setCivil(false);
		
		s[1] = new Student();
		s[1].setId("2");
		s[1].setCourse(new String[]{"Chinese", "Math", "Science", "Computer"});
		s[1].setScore(new double[] {90, 40, 66, 60});
		s[1].setCivil(true);
		
		s[2] = new Student();
		s[2].setId("3");
		s[2].setCourse(new String[]{"Chinese", "Math", "Science", "Computer"});
		s[2].setScore(new double[] {90, 50, 70, 65});
		s[2].setCivil(false);
		
		
		for(Student stu : s) {
			double[] courseScore = stu.getScore();
			for(int i = 0; i < courseScore.length; i++) {
				if(courseScore[i] < 60) {
					System.out.println(stu.getId());
					for(int j = 0; j < courseScore.length; j++) {
						System.out.print(courseScore[j] + " ");
					}
					System.out.println();
				}
			}
		}
		
		
		
		
		
		
		
	}

}
