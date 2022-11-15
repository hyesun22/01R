//자식 클래스의 객체는 부모 클래스형의 변수에 대입할 수 있다.
abstract class Calc //추상 클래스 정의
{
	int a = 5;
	int b = 6;
	
	abstract void plus();
}


class MyCalc extends Calc //추살 클래스를 상속한 클래스 정의
{

	
	void plus() {System.out.println(a + b);}
	void minus() {System.out.println(a - b);}

}


public class Ex01_Polymorphism1
{

	public static void main(String[] args)
	{
		MyCalc myCalc1 = new MyCalc();
		myCalc1.plus();
		myCalc1.minus();
		
		//하위 클래스 객체를 상위 클래스 객체에 대입
		Calc myCalc2 = new MyCalc();
		myCalc2.plus();
		//myCalc2.minus();
		//이 메서드는 설계도에 없다. 사용할 수 없다. (상위 클래스의 설계도로는 하위 클래스의 모든 것을 알수 없기에 사용 불가능한 멤버가 생기게 됨)
	}

}
