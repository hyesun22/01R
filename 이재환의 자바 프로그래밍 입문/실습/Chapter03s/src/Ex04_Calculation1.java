
public class Ex04_Calculation1
{

	public static void main(String[] args)
	{
		byte num11 = 1;
		byte num12 = 2;
		byte result1 = num11 + num12;  //에러발생
		
		short num21 = 1;
		short num22 = 2;
		short result21 = short num21 + num22; //에러발생. 모두 연산을 하려면 각각 int로 형변환 후 더하기 연산을 해야한다.
		
		short result22 = (short)(num21 + num22); //강제 형변환. 결과가 short 타입으로 고정되었기에 오류 발생되지 않는다
		
		
	}

}
