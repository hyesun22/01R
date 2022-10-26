
public class Ex02_char
{

	public static void main(String[] args)
	{
		char ch1 = 'A';                 //자바가 인코딩을 합니다. (문자코드표를 보고 자바가 알아서 이진수로 바꿈)
		char ch2 = 65;                  //10진수로 직접 문자(아스키코드)의 값을 넣어주었다.
		char ch3 = 0x41;                //16진수로 직접 문자의 값을 넣어주었다. (*2진수는 너무 복잡해서 보통 아스키코드표에서 생략된다)
		char ch4 = 0b0000000001000001;  //2진수로 직접 문자의 값을 넣어주었다.
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

	}

}
