
public class Ex08_DoWhile
{
	//07번 while문을 do~while문으로 고침. 차이점은 while문은 조건식을 먼저 평가하기에, 조건식의 결과가 false면 while문 중괄호 안의
	//문장들이 한번도 실행되지 않을 수 있지만, do~while문은 조건식을 아래쪽에 쓰기에 최소 한 번은 중괄호 안의 문장들이 실행된다.
	public static void main(String[] args)
	{
		int num   = 0;
		int count = 0;
		
		do
		{
			num++;
			
			if((num % 5 ) != 0)
				continue;
			if((num % 7) != 0)
				continue;
			
			count++;
			System.out.println(num);
		} while(num < 100);  //*do~while문에서 while뒤의 세미콜론 잊지않기 주의!
		System.out.println("count: " + count);
	}

}
