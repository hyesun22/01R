
public class Ex02_TypeChange1
{

	public static void main(String[] args)
	{
		int num = 1;
		byte num2 = 1;    //정수-int: 크기 4byte.
		byte num3 = 127; //정수-바이트: 크기 1byte. 자바에서의 값의 범위는 -128~127
		byte num4 = 128;
		
		short num5 = 1; //정수-short: 크기 2byte.
		
		num2 = num5;    //short값을 byte에 넣으려니 에러.
		num2 = (byte)num5; //명시적 형변환(=강제 형변환) <-> 컴파일러가 자동으로 해주는 '묵시적(=자동, 암묵적) 형변환'

	}

}
