public class Ex08_StringBuilder
{

	public static void main(String[] args)
	{
		//StringBuilder 클래스는 내부에 변경 가능한 변수를 갖고 있다.
		//이 클래스를 사용하여 문자열을 연결하면 기존에 사용하던 변수의 값을 계속 확장하므로 임시 객체를 만들지 않는다.
		//새로운 메모리를 확보하고 객체를 만드는 작업을 하지 않으므로 문자열 연결 속도가 빨라진다.
		StringBuilder buf = new StringBuilder("동해물과");
		
		buf.append("백두산이"); //값을 추가. 출력하려면 스트링형으로 변환해서 출력해야 한다.
		System.out.println(buf.toString()); //"동해물과백두산이"
		
		buf.append(12345); //추가
		System.out.println(buf.toString()); //"동해물과백두산이12345"
		
		buf.delete(0, 4); //*구간 삭제* //"백두산이12345"
		System.out.println(buf.toString());
		
		buf.replace(4, 8, "ABC"); //*값 변경* "백두산이ABC5"
		System.out.println(buf.toString());
		
		buf.reverse(); //순서 반전
		System.out.println(buf.toString()); //5CBA이산두백

	}

}
