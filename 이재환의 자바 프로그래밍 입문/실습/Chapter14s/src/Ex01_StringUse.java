public class Ex01_StringUse {

	//디버그 모드) 1. 우클릭. Debug As - Java Application 2. F6 //Variables 띄워놓기.
	//F5 [STEP INTO]: 메서드가 있으면 그 메서드 내부코드로 진입한다.
	//F6 [STEP OVER]: 메서드를 만나면 메서드 내부 코드로 진입하지 않고 결과만 반환. 다음줄로 이동
	public static void main(String[] args) {
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
