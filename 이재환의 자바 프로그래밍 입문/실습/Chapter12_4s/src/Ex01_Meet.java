interface Greet //인터페이스
{
	void greet();
}

interface Talk //인터페이스
{
	void talk();
}

class Morning implements Greet, Talk  //인터페이스 구현
{
	public void greet()
	{
		System.out.println("안녕하세요~");
	}

	public void talk()
	{
		System.out.println("날씨 좋네요.");
	}
}

public class Ex01_Meet
{

	public static void main(String[] args)
	{
		Morning morning = new Morning();
		morning.greet();
		morning.talk();
	}

}
