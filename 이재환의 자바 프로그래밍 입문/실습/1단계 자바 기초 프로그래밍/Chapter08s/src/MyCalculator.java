import java.util.Scanner;

public class MyCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
	   { 
		showMenu(); //메뉴 출력
		//int num = sc.nextInt(); //기존 입력 코드
		char myChar = sc.next().charAt(0); //새로운 입력코드
        //*sc.nextLine() Vs. sc.next() : 전자는 정수값을 리턴하고 enter(\n)을 버퍼에 남겨둔다. 후자는 개행문자 무시.
		if(!checkNum(myChar)) { //(유효성검사)문자 말고 숫자 잘 입력한건지 확인
			System.out.println("메뉴를 잘못 선택했습니다");
			continue;
		}
		int num = myChar - '0'; //입력된 문자에서 '0'(문자)를 빼면 char형 데이터는 int형 데이터로 형변환된다.
		if(num == 0) // 반복문 종료
		{
			break;
		}
		else
		 {
			if(num > 4)
			{
			  System.out.println("메뉴를 잘못 선택하셨습니다");
			  continue; 
			}
			//더하기, 뺴기, 곱하기, 나누기 실행
			System.out.print("첫 번째 숫자:");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자:");
			int num2 = sc.nextInt();
			
			if(num == 1)
				addNum(num1, num2);
			else if (num == 2)
				minusNum(num1, num2);
			else if (num == 3)
				multiplyNum(num1, num2);
			else if (num == 4)
				divideNum(num1, num2);			
		 }
	   }
		System.out.println("계산기를 종료합니다.");
     }

	public static void showMenu()
	{
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 끝내기");
	}
	
	public static void addNum(int num1, int num2) //더하기
	{
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
	
	public static void minusNum(int num1, int num2) //빼기
	{
		int result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	public static void multiplyNum(int num1, int num2) //곱하기
	{
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
	public static void divideNum(int num1, int num2) //나누기
	{
		int result1 = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result1);
		
		int result2 = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result2);
	}
	
	public static boolean checkNum(char ch)
	{
		if (ch >= '0' && ch <= '9')
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
}
