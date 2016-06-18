package secondQuestion;

import java.text.DecimalFormat;

public class ChineseCourseTest {

	public static void main(String[] args) {
		
		ChineseCourse[] cc = new ChineseCourse[10];
		
		for(int i = 0; i < cc.length; i++) {
			
			
			
			cc[i] = new ChineseCourse(i+1+"", Math.round(Double.valueOf(new DecimalFormat("#.0").format(Math.random()*100))));
		}
		
		ChineseCourse test = new ChineseCourse();
		test.setCC(cc);
		test.ScoreSort();
	}
}
