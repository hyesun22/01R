abstract class Unit //추상메서드를 갖고 있는 클래스라고 'abstract'로 표시.
{
	abstract void doMove(); //기능이 구현되지 않고 호출방법만 있는 메서드에 마찬가지로 'abstract'라고 표시를 한다.
}

class Marine extends Unit //자식클래스
{
	void doMove() //추상클래스 구현
	{
		System.out.println("마린은 두 발로 이동합니다.");
	}
}

class Zergling extends Unit
{
	void doMove()
	{
		System.out.println("저글링은 네발로 구현합니다.");
	}
}

public class MyStacraft
{

	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		unit1.doMove();
		
		Zergling unit2 = new Zergling();
		unit2.doMove();
	}

}
