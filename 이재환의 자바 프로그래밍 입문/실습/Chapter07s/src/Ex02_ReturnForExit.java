
public class Ex02_ReturnForExit
{

	public static void main(String[] args)
	{
		divide(4, 2);
		divide(6, 2);
		divide(8, 0);	
	}

	private static void divide(int num1, int num2)
	{
		if (num2 == 0)
		{
			System.out.println("0으로 나눌 수 없습니다");
			return;  //return은 어떤 값을 반환하는데 사용하는 예약어이기도 하지만 메서드 기능을 중간에 종료하는데도 사용합니다.
			        //여기서는 메서드를 해당 지점에서 종료시키는 용도로 사용되었다.
		}
		 System.out.println("나눗셈 결과:" + (num1 / num2));
	}

}
