
public class Ex05_for
{

	public static void main(String[] args)
	{
		for (int i=2; i<10; i++) 
		{
			System.out.print((2 * i) + " ");
		}
		System.out.println();
		
		//한 줄만 실행할거면 중괄호 생략 가능
		for (int i=2; i<10; i++)
			System.out.print((3 * i) + " "); //구구단 3단 6부터 27까지 출력
		System.out.println();
				
		//의도치 않은 결과
		for (int i=2; i<10; i++)
			//System.out.println(i);  <- 이거 주석 풀어주면 밑의 라인에서 i변수가 선언되지 않았다고 에러가 발생. 왜냐면 이 i변수는 for문 안에서만 사용 가능
			System.out.print((5 * i) + " ");
		System.out.println();

	}

}
