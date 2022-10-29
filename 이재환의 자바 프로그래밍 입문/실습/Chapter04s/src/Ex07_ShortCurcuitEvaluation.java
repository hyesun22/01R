
public class Ex07_ShortCurcuitEvaluation
{

	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		boolean result;
		
		result = ((x = x + 1) < 0 && (y = y + 1) > 0);
		//*논리 연산자 주의사항* 논리곱(And)에서 앞쪽이 거짓이면 뒤쪽 계산을 수행하지 않는다...
		
		System.out.println("result = " + result); // false
		System.out.println("x = " + x);           // x = 1
		System.out.println("y = " + y + '\n');    // y = 0
		
		result = ((x = x + 1) > 0 || (y = y + 1) > 0);
		
		System.out.println("result =" + result); // true
		System.out.println("x =" + x);           // x = 2
		System.out.println("y =" + y);		     // y = 0
		// 그리고 논리합(or)에서 하나라도 참이 되면 참이 되는거니까 앞쪽이 참이면 역시나 뒤쪽 계산을 수행하지 않는다...

	}

}
