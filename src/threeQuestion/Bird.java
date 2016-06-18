package threeQuestion;

public class Bird implements Animal{

	public Bird() {
	}
	
	@Override
	public String run() {
		System.out.println("我是鸟类");
		return "我是鸟类";
	}
}
