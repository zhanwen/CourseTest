# CourseTest
1、有一个类
class Point 
{
	int x, y;
	Point(int a, int b) 
	{
		setPoint(a, b);
	}
	public void setPoint(int a, int b) 
	{
		x = a;
		y = b;
	}
}
编写一个这个类的子类circle,它的两个成员变量是Point的两个对象，一个作为圆心，另一个表示圆周上的一点，成员函数是CalErea，返回该圆的面积。在编写一个测试类，计算2个这样的圆的面积并输出。

2、定义了一个接口
interface ClassSort {
	int ScoreSort(); \\成绩排序并输出
	void ScoreLevel(); \\等级输出
}
现有两个类ChineseCourse和MathCourse，成员变量都是ID[](学生学号)和Score[](学生Score成绩),这两个类均实现ClassSort接口,ScoreSort()和
ScoreLevel(),其中，ChineseCourse类以成绩降序排序并输出，MathCourse中以成绩升序排序并输出，等级分别以A、B、C、D、E输出和以优、良、中、及格、不及格输出，完成这几个类的编码，并写出测试类。

3、按以下要求编写程序
(1)编写Animal接口，接口中声明run()方法
(2)定义Bird类和Fish类实现Animal接口，要求至少一个一个输出串的语句
(3)编写Bird类和Fish类的测试程序，并调用其中的run方法，并把Bird类和Fish类中的输出串保存到一个文本文件中

4、定义一个复数类Complex和一个类ComAdd，ComAdd类中有一个Add方法，可以返回两个复数相加的功能，在定义一个类ComThreeAdd实现继承ComAdd类，实现三个复数相加，写一个测试类，实现n个复数的相加，n个复数的实部和虚部由随机数产生


