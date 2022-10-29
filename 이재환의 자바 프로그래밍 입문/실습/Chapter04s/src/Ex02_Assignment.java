
public class Ex02_Assignment
{

	public static void main(String[] args)
	{
		short num = 10;
		num += 77L;
		System.out.println(num); //복합 대입 연산자의 장점) 1. 코드 간결해짐 2. 사람의 강제 형변환 필요하지 않음
		
		num = (short)(num + 77L);
		System.out.println(num); // 형변환 필요

	}

}
