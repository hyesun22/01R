
public class Ex01_finalUse
{

	public static void main(String[] args)
	{
		final int MAX_NUM = 100;  //선언과 동시에 초기화(*권장)
		final int MIN_NUM;       // 일단 선언해두고,
		
		MIN_NUM = 60;           // 나중에 초기화. 딱 한번 가능('이 값이 최종이다'라는 의미의 final)

		// final 상수를 사용하는 이유
		int myScore = 40;
		if (myScore < MIN_NUM)    //가독성이 좋아짐
		{
			System.out.println("당신의 등급은 F입니다.");
		}
	}

}
