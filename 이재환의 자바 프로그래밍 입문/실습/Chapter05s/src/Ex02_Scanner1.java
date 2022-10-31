import java.util.Scanner;

public class Ex02_Scanner1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Scanner 클래스는 콘솔(키보드) 입력 기능 제공
		
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt(); //여러 데이터를 한꺼번에 입력받으면 입력된 내용은 공백이나 탭으로 구분을 하게 된다. (탭)
		
		System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
		int num4 = sc.nextInt();
		System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
		int num5 = sc.nextInt();
		System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
		int num6 = sc.nextInt();  //(엔터)
		
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);

	}

}
