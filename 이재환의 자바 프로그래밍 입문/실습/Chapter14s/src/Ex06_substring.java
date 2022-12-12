public class Ex06_substring
{

	public static void main(String[] args)
	{
		String str1 = "AppleBananaOrange";
		int num1 = str1.indexOf("Banana"); //"Banana" 시작 위치 반환(시작은 포함인데)
		int num2 = str1.indexOf("Orange"); //"Orange" 시작 위치 반환(끝은 +1이군아..)
		
		String str2 = str1.substring(num1, num2); 
		System.out.println(str2); //Banana
		
		String str3 = str1.substring(num2);
		System.out.println(str3); //Orange

	}

}
