
public class Ex01_MethodType
{
	//*특정 기능을 수행하는 일련의 코드 블록(뭉치): 메서드
	//*매개변수: 메서드에 전달되는 입력값
	public static void main(String[] args)
	{
		//매개변수 없고 반환 없는 메서드
		sayHello();
		
		//매개변수 있고 반환 없는 메서드
		addTwoNum1(5,2);
		
		//매개변수 있고 반환 있는 메서드
		int age = getAge();
		System.out.println(age);
		System.out.println( getAge() );
		
		//매개변수 있고 반환 있는 메서드
		int sum = addTwoNum2(1, 2);
		System.out.println("합은 " + sum);
	}
	
	private static void sayHello()
	{
		System.out.println("Hello");
		
	}
	
	private static void addTwoNum1(int num1, int num2)
	{
		int nResult = num1 + num2;
		System.out.println(nResult);
		
	}

	private static int getAge()
	{
		return 20;
	}
	
	private static int addTwoNum2(int num1, int num2)
	{
		return num1 + num2;
	}

}
