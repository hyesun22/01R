
public class Ex03_UtilMethod
{

	public static void main(String[] args)
	{
		MyCalculator calc1 = new MyCalculator(); //객체 생성 후 사용
		int num1 = calc1.adder(1,2);
		System.out.println(num1);
		
		int num2 = MyCalculator.adder(2,3); //새로 객체 생성하지 않고 사용
		           //스태틱을 메서드에 붙여주면 이렇게 객체 생성 없이 클래스명.메서드명 형식으로 유틸 메서드를 사용할 수 있습니다.
		 //만약 MyCalculator 클래스가 다른 패키지, 즉 다른 폴더에 있었다면 import 기능을 사용해야 사용할 수 있지만
		//같은 패키지, 즉 같은 폴거에 있으면 이렇게 import를 사용하지 않아도 MyCalculator 클래스를 사용할 수 있다.
		System.out.println(num2);
	}
     //자, 여기서 System.out.println(...)의 비밀이 풀림.
	 //여태까지 배운 네이밍 룰에 따라, 첫글자가 대문자로 시작하므로 System이라는 클래스와 
	//out이란 멤버변수이자 클래스변수(괄호가 없으니까 메서드가 아님.)
	//그리고 println()이란 메서드를 호출하고 있다는 것을 알 수 있다.
	//또한 메서드를 호출하고 있으니, out은 일반자료형의 변수가 아니고 객체형의 변수(: 주소값을 저장하는 변수 == 참조형 변수)임을 알 수 있다.
}
