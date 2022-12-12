public class Ex02_RefCompare {

	public static void main(String[] args) {
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";

		if(str1 == str2)
			System.out.println("str1과 str2는 동일 객체 참조");
		else
			System.out.println("str1과 str2는 다른 객체 참조"); //서로 다른 객체의 id값을 가지고 있으므로 이 줄이 출력됨
		
		if(str3 == str4)
			System.out.println("str1과 str4는 동일 객체 참조");
		else
			System.out.println("str3과 str4는 다른 객체 참조"); //같은 객체의 참조 id가 들어있다.
	}

} //*결론: 비교 연산자로는 문자열의 내용을 비교할 수 없다.
