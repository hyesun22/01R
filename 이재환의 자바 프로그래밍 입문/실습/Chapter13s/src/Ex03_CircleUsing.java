public class Ex03_CircleUsing {

	public static void main(String[] args) {
		com.company.area.Circle c1 = new com.company.area.Circle(3.5); //r이 3.5 (반지름)
		System.out.println("반지름 3.5 원 넓이:" + c1.getArea());
		
		//처음에는 클래스명이 Circle로 같아, 같은 폴더에서는 에러가 발생하겠지만 이렇게 패키지를 이용하여 물리적인 폴더를 구분하여
		//저장하고 사용하면 서로 충돌이 발생하지 않게 된다. 대신 패키지명.클래스명으로 코드가 길어지는 사소한 단점이 있다.
		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("반지름 3.5 원 둘레:" + c2.getCircumference());
	}

}
