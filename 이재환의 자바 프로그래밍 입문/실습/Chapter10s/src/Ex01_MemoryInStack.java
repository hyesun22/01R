public class Ex01_MemoryInStack
{

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		adder(num1, num2); //F5: 메서드가 잇으면 그 메서드 내부 코드로 진입
		System.out.println("----------------");
	}

	private static int adder(int n1, int n2) 
	{
		int result = n1 + n2;
		return result;
		
	}

}
