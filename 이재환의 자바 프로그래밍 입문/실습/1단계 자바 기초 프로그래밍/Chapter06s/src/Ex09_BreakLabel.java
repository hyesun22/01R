
public class Ex09_BreakLabel
{

	//몇까지 더하면 2000보다 커지는지 알아보는 코드
	public static void main(String[] args)
	{
		int sum = 0;
		
myExit: while(true)
         {
			for(int i=0; i<100; i++)
			{
				sum = sum + i;
				if (sum > 2000)
				{
					System.out.printf("%d : %d\n", i, sum);
					break myExit; //레이블을 이용한 중첩된 반목문의 일괄 중지
				}
			}	
         }
	}

}
