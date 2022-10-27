
public class Ex05_DoubleError2
{

	public static void main(String[] args)
	{
		double dNum = 0.0;
		
		for (int i = 0; i < 1000; i++)
		{
			dNum = dNum + 0.1;
		}

		System.out.println(dNum); //이처럼 실수는(float, double) 정확한 값이 아니고 수식에 의해 저장되는 근사치. (각각 4바이트 / 8바이트)
	}

}
