
public class Ex03_PlusMinusSign
{

	public static void main(String[] args)
	{
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println(num1);
		
		short num2 = 7;
		short num3 = (short)(num2);
		short num4 = (short)(-num2); //형변환하지 않으면 오류 발생. +와 -도 연산자이기에 갖다붙히면 int가 되어서 short로 강제 형변환 재필요
		System.out.println(num3);
		System.out.println(num4);

	}

}
