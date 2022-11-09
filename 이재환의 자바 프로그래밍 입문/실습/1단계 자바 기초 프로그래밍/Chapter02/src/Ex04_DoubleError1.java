
public class Ex04_DoubleError1
{

	public static void main(String[] args)
	{
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result = num1 + num2;
		System.out.println(result); //근사값이 도출(실수범위는 늘어나는 대신 10진수를 정확하게 표현할 수 없는 부동 소수점 방식 <-> 고정 소수점 방식)

	}

}
