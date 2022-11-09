
public class Ex09_Order
{

	public static void main(String[] args)
	{
		System.out.println();            //내용x 줄바꿈만 해줌
		System.out.println("\n");        //특수문자를 통한 줄바꿈
		System.out.println("----------------------");
		
		int num = 5;
		
		System.out.println(num + '\n');  //작은 따옴표로 n을 감싸면 문자형 데이터. 
		                                 //즉, 2바이트 크기를 가질거고 결과적으로 이진수 + 이진수 산술 연산이 일어남 -> 15
		System.out.println("----------------------"); 
		System.out.println(num + "\n");  //큰 따옴표로 n을 감싸면 스트링 객체(=글자들)
		System.out.println("3 >= 2 : " + (3>=2)); // -> true

	}

}
