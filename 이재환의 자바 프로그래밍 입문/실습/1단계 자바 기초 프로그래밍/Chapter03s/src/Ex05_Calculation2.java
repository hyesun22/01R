
public class Ex05_Calculation2
{

	public static void main(String[] args)
	{
		int num31 = 1;
		int num32 = 2;
		int result3 = num31 + num32;
		
		long num41 = 1;
		long num42 = 2;
		long result4 = num41 + num42;  //OK
		
		long result5 = num31 + num41;  // int형 변수의 값 + long형 변수의 값이므로 계산 후 나옴 long형 결과를 long형 변수 result5에 대입한다
		
		float num61   = 1.0f; //float형의 상수(변하지 않는 값.)임을 알려주기 위해 f접미사를 붙여주었다
		float num62   = 2.0f;
		float result6 = num61 + num62;
		
		double num71   = 1.0;
		double num72   = 2.0;
		double result7 = num71 + num72;
		
		double result8 = num61 + num71;

		//*결론: 변수에 데이터를 대입할 때와 데이터끼리의 산술연산을 할 때 형변환이 일어납니다.
	}

}
