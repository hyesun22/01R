class Unit 
{
	String name;
	int hp;
	
	void printUnit()
	{
		System.out.println("이름 : " + name);
		System.out.println("HP :" + hp);
	}
}

class Marine extends Unit //Unit 클래스를 상속함. 그래서 콘솔에서 Unit의 printUnit()메서드가 이 안의 printMarine()메서드보다 먼저 실행되는것.
{
	int attack;
	
	void printMarine()
	{
		printUnit();
		System.out.println("공격력 : " + attack);
	}
}

class Medic extends Unit
{
	int heal;
	
	void printMedic()
	{
		printUnit();
		System.out.println("치유량 : " +heal);
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
		
		unit1.printMarine(); //Marine
		System.out.println();
		unit2.printMedic();  //Medic

	}
	//C++은 다중상속을 지원하며 문법적으로 구분해서 사용하지만 자바는 모호함 자체를 없애기 위해 다중 상속 대신 단계별 상속을 사용한다.
}
