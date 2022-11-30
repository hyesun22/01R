public class Ex02_PackageUse {

	public static void main(String[] args) {
		Apple apple = new Apple(); //사과 클래스는 같은 폴더에 있으므로 이전과 동일한 방법으로 사용하면 된다.
		apple.showName();
		
		//Banana banana = new Banana();  바나나 클래스는 다른 폴더에 있으므로 클래스명만 사용하면 찾을 수 없기에 에러 발생
		com.study.Banana banana = new com.study.Banana();
		banana.showname(); //객체가(banana)가 정상적으로 만들어지기 때문에 메서드를 호출할 수 있다.
	}

}
