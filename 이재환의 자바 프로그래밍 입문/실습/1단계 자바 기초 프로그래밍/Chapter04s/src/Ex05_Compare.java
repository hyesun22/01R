
public class Ex05_Compare
{

	public static void main(String[] args)
	{
		System.out.println("2 >= 1 : " + (2 >= 1));
		System.out.println("2 <= 1 : " + (2 <= 1));
		
		//비교 연산 시에도 형변환이 일어남(1.0과 1은 각각 실수와 정수인데 결과 잘 나옴. 실수형으로 자동 형변환이 이뤄진 다음 비교 연산을 수행하였다)
		System.out.println("1.0 == 1 : " + (1.0 == 1));
		System.out.println("1.0 != 1 : " + (1.0 != 1));

	}

}
