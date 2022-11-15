//건물의 기본 설계도
abstract class Building
{
	int health;
	abstract void doBuild();
}

//건물이 날 수 있는 기능 구현. 건물의 일반적인 기능은 아님
interface Fly
{
	void flyBuilding();
}

class Barracks extends Building implements Fly
{
	void doBuild()
	{
		System.out.println("인간형 유닛 생산 건물을 짓습니다.");
	} //모든 건물은 상위추상클래스 Building을 상속받아 doBuild() 메서드를 구현하고 있다.

	void doMakeMarine() //이것은 자체 메서드
	{
		System.out.println("총쏘는 유닛을 생산합니다.");
	}
	
	public void flyBuilding() //모든 건물이 날면 안되므로 인터페이스로 나는 기능 제공
	{
		System.out.println("건물이 날아서 이동하게 됩니다.");
	}
}

class Factory extends Building implements Fly
{

	void doBuild()
	{
		System.out.println();
	}
	
	void doMakeTank()
	{
		System.out.println("탱크 유닛을 생산합니다.");
	}
	
	public void flyBuilding()
	{
		System.out.println("건물이 날아서 이동하게 됩니다.");
		
	}
	
}

class Bunker extends Building
{

	void doBuild()
	{
		System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");	
	}
	
	void doDefense()
	{
		System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
	}

}


public class Ex02_Starcraft
{

	public static void main(String[] args)
	{
		Barracks barracks = new Barracks();
		barracks.doBuild();
		barracks.doMakeMarine();
		barracks.flyBuilding();
		
		Factory factory = new Factory();
		factory.doBuild();
		factory.doMakeTank();
		factory.flyBuilding();
		
		Bunker bunker = new Bunker();
		bunker.doBuild();
		bunker.doDefense();

	}

}
