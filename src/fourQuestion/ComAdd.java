package fourQuestion;

public class ComAdd {
	
	public static Complex add(Complex c1, Complex c2) {
		//两个负数相加
		return new Complex(c1.getReal()+c2.getReal(), c1.getImaginary()+c2.getImaginary());
	}
	
	public static Complex addN(Complex... complexs) {
		double r = 0;
		double imag = 0;
		for(int i = 0; i < complexs.length; i++) {
			 r += complexs[i].getReal();
			 imag += complexs[i].getImaginary();
		}
		return new Complex(r, imag);
	}
	
}
