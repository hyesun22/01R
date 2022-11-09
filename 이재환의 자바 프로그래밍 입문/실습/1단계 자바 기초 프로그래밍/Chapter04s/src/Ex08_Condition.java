
public class Ex08_Condition
{
// 조건 연산자는 주어진 조건식이 참인 경우와 거짓인 경우에 다른 결과값을 나타내주는 연산자이다. (그리고 조건 연산자는 삼항 연산자이다.)
	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 100;
		
		int big = (num1 > num2) ? num1 : num2;  // 조건식 ? 참일 때 실행(50) : 거짓일 때 실행(100); -> false 
		System.out.println("큰 수 : " + big);   // 큰 수 : 100 -> num2
		
		int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1); // -> faulse. (num2 - num1) 실행되어서 diff에 대입됨
		System.out.println("두 수의 차 : " + diff);  // 두 수의 차 : 50

	}

}
