package fourQuestion;

public class Test {

	private static final int N = 1000;

	public static void main(String[] args) {

		Complex c1 = new Complex(4, 5);
		Complex c2 = new Complex(5, 34);
		Complex c3 = new Complex(23, 43);

		System.out.println("两个复数相加");
		System.out.println("复数1: " + c1);
		System.out.println("复数2: " + c2);
		System.out.println("复数和:" + ComAdd.add(c1, c2));
		System.out.println("-------------------------");

		System.out.println("三个复数相加");
		System.out.println("复数1: " + c1);
		System.out.println("复数2: " + c2);
		System.out.println("复数3: " + c3);
		System.out.println("复数和:" + ComThreeAdd.add(c1, c2, c3));
		System.out.println("-------------------------");

		System.out.println("n个复数相加");
		Complex[] c = new Complex[N];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Complex(Math.random() * 10, Math.random() * 10);
		}
		System.out.println(ComAdd.addN(c));
		
	}
}
