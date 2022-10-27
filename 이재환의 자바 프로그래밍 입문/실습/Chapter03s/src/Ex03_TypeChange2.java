
public class Ex03_TypeChange2
{

	public static void main(String[] args)
	{
		int  num  = 2147483647;  //여기까지가 int형에서 최대로 표현할 수 있는 값
		int  num2 = 2147483648;
		long num3 = 2147483648;  //에러(여전히 수들을 int형이라고 컴파일러가 인식하고 있다)
		long num4 = 2147483648L; //통과(소문자도 가능)
		
		float num5 = 1.0;  //에러
		float num6 = 1.0F; //통과
		
		double num7 = 30;       // int -> double 자동 형변환. 위의 실수는 계산식에 의해서 만들어지는 근사치이므로 자동 형변환이 안된다
		
	}

}
