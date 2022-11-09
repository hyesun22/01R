class Calc
{
	int add (int a, int b)
	{
		return a + b;
	}

	int add(int a)
	{
		return a + 1;
	}
	
	double add(double a, double b) 
	{
		return a + b;
	}
}
//오버로딩이란 위와 같이 하나의 클래스 내에 매개변수 개수나 자료형은 다르지만 메서드명은 같은 메서드를 여러 개 정의하는 것을 말한다.
//동일하거나 유사한 일을 수행하는 메서드가 전달받는 매개변수에 따라 각기 다른 연산을 하는 경우 유용하다.

public class OverloadingUse
{

	public static void main(String[] args)
	{
		Calc calc = new Calc();
		int nRtn1 = calc.add(3, 9);
		int nRtn2 = calc.add( 3 );
		double nRtn3 = calc.add(3.0, 9.0);
		
		System.out.println("Rtn1 = " + nRtn1);
		System.out.println("Rtn2 = " + nRtn2);
		System.out.println("Rtn3 = " + nRtn3);
	}

}
//C언어에서는 같은 이름 쓰기가 불가능하기에 add_int(), add_double()처럼 이름을 짓는다. 
//유사한 일을 수행하는 메서드마다 구분되는 메서드명을 각각 정의하는 것은 생각보다 쉽지 않다.
//자바에서는 메서드명과 매개변수까지 합쳐서 메서드를 구분해주기에 같은 이름의 메서드를 사용할 수 있다.
//  System.out.println(); System.out.println(1); System.out.println(홍길동); 이 메서드도 오버로딩이 적용된 메서드이다.*