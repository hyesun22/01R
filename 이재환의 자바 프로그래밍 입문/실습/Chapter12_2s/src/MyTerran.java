class Unit
{
	String name;
	int    hp;
	
	void doMove()
	{
		System.out.println("이동속도 10으로 이동");
	}
}

class Marine extends Unit
{
	int attack;
	
	void doMove() //부모 메서드와 같은 이름의 자식 메서드
	{
		super.doMove(); //부모 메서드 호출(super을 붙여서 부모에게서 상속받은 메서드를 구분짓게 해줌)
		System.out.println(attack + "공격");
	}
}

class Medic extends Unit
{
	int heal;
	
	void doMove() //위와같이 super을 안했기에 같은 이름의 메서드는 자식 메서드로 대체되게 된다. 
	              //'이동속도 10으로 이동'이 unit2.doMove();에서는 나오지 않음
	{ 
		System.out.println("이동속도 8으로 이동");
		System.out.println(heal + "치유");
	}
}

public class MyTerran
{
	

	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;
		
		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;
		
		unit1.doMove();
		System.out.println();
		unit2.doMove();

	}

}

