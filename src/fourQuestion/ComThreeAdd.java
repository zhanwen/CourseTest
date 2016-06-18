package fourQuestion;

public class ComThreeAdd extends ComAdd {
	
	public static Complex add(Complex c1, Complex c2, Complex c3) {
		//三个负数相加
		return new Complex(c1.getReal()+c2.getReal()+c3.getReal(), c1.getImaginary()+c2.getImaginary()+c3.getImaginary());
	}
	
}
