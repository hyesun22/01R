
public class Ex07_while
{

	public static void main(String[] args)
	{
		int num   = 0;
		int count = 0;
		
		while((num++) < 100) 
		{
			if((num % 5) != 0)
				continue;
			if((num % 7) != 0)
				continue;
			
			count++;                 // 5의 배수 & 7의 배수. 두 조건을 충족하는 숫자가 떨어질 때마다 +1씩 카운트됨
			System.out.println(num); // 5의 배수 & 7의 배수. 두 조건을 충족할 때만 100 미만의 숫자가 출력된다(: 35, 70)
		}
		
		System.out.println("count: " + count); // count: 2 
	}

}
