import java.util.StringTokenizer;

public class Ex09_StringTokenizer
{

	public static void main(String[] args)
	{
		//문자열을 분할하는 클래스: StringTokenizer
		StringTokenizer st1 = new StringTokenizer("a b c"); //공백 기준 분할

		           //hasMoreTokens : 토큰이 있으면 true를 반환
		while (st1.hasMoreTokens()) //토큰 유무 확인
		{
			System.out.println(st1.nextToken());
		}
	}

}
