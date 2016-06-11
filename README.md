# CourseTest
**1、有一个类**
```  
class Point {  
	int x, y; 
	Point (int a, int b) {
		setPoint(a, b);
	}
	public void setPoint (int a, int b) {
		x = a;
		y = b;
	}
}
```
编写一个这个类的子类`circle`,它的两个成员变量是`Point`的两个对象，一个作为圆心，另一个表示圆周上的一点，成员函数是`CalErea`，返回该圆的面积。在编写一个测试类，计算2个这样的圆的面积并输出。

**2、定义了一个接口**
```
interface ClassSort {
	int ScoreSort(); \\成绩排序并输出
	void ScoreLevel(); \\等级输出
}
```
现有两个类`ChineseCourse`和`MathCourse`，成员变量都是ID[](学生学号)和Score[](学生Score成绩),这两个类均实现`ClassSort`接口,`ScoreSort()`和
`ScoreLevel()`,其中，`ChineseCourse`类以成绩降序排序并输出，`MathCourse`中以成绩升序排序并输出，等级分别以A、B、C、D、E输出和以优、良、中、及格、不及格输出，完成这几个类的编码，并写出测试类。

**3、按以下要求编写程序**
(1)编写`Animal`接口，接口中声明`run()`方法
(2)定义`Bird`类和`Fish`类实现`Animal`接口，要求至少一个一个输出串的语句
(3)编写`Bird`类和`Fish`类的测试程序，并调用其中的`run`方法，并把`Bird`类和`Fish`类中的输出串保存到一个文本文件中

**4、复数计算**
定义一个复数类`Complex`和一个类`ComAdd`，`ComAdd`类中有一个`Add`方法，可以返回两个复数相加的功能，在定义一个类`ComThreeAdd`实现继承`ComAdd`类，实现三个复数相加，写一个测试类，实现n个复数的相加，n个复数的实部和虚部由随机数产生
