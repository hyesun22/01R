public class Ex03_ContentsCompare
{

	public static void main(String[] args)
	{
		String str  = new String("Apple");
		String str2 = new String("apple");
		String str3 = new String("Banana");
		int cmp;
		
		//내용이 단순히 같다를 비교할 때는 String클래스의 equals() 메서드를 사용
		//인스턴스 내용 비교
		if(str.equals(str3)) //문자열이 같은지 비교
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
		
		cmp = str.compareTo(str2); // A.compareTo(B) : 사전순 비교. 값이 0이면 서로 동일한 값이고 값이 음수면 A가 사전순으로 앞쪽에 있다는것
		                                             //반면에 양수면 A가 사전순으로 뒷쪽에 있다는것
		
		if(cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0) //cmp에 넣은건 소문자기에 음수인 -1이 나온다면 대문자인 Apple이 사전순으로 더 앞에 위치한다는 것이다.
			System.out.println("사전의 앞에 위치하는 문자:" +str);
		else
			System.out.println("사전의 앞에 위치하는 문자" + str2);
		
		if(str.compareToIgnoreCase(str2) == 0) //compareToIgnoreCase() 메서드: 모든 문자를 대소문자 구분없이 비교해줌
			System.out.println("두 문자열은 같습니다."); //결과적으로 이 문장이 출력됨.
		else
			System.out.println("두 문자열은 다릅니다.");
	}

}
