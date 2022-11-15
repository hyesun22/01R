abstract class Human //추상클래스
{
	abstract void print(); //추상메서드
}

class Man extends Human //상위클래스의 추상메서드 받아서 구현1
{
	void print()
	{
		System.out.println("남자 생성");
	}
}

class Woman extends Human //상위클래스의 추상메서드 받아서 구현2
{
	void print()
	{
		System.out.println("여자 생성");
	}
}

public class Ex02_Polymorphism2
{

	public static Human humanCreate(int kind) //humanCreate는 매개변수에 따라 두 가지 타입의 객체를 만드는데 메서드 반환값은 하나밖에 지정 못함.
	{
		if(kind == 1) {
			//Human m = new Man();  그럴때는 이렇게 객체를 만들고 상위 클래스형의 변수에 넣어서 
			//return m;             반환해줄 수 있다.
			return new Man();   //이렇게 쓰면 자동 형변환된것 (이렇게 클래스도 자동 형변환이 이루어짐)
		}else {
			//Human w = new Woman();
			//return w;
			return new Woman();
		}
	
	}
	
	public static void main(String[] args)
	{
		Human h1 = humanCreate(1);
		h1.print();
		
		Human h2 = humanCreate(2);
		h2.print();

	}

}
