public class Ex05_indexOf
{

	public static void main(String[] args)
	{
		String str = "AppleBananaOrange";
		int num1 = str.indexOf("a"); //str 변수 속 "a" 위치 반환
		int num2 = str.indexOf("a", num1 + 1); //첫 "a" 그 다음 "a" 위치 반환
		
		System.out.println(num1); //6
		System.out.println(num2); //8

	}

}
