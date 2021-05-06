import java.util.Scanner;
class String_1
{
	public void count_Vowels(String str)
	{
		int count_Vowels = 0;
		for(int i = 0;i<str.length();i++)
		{
			if( str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'||str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U')
			{
				count_Vowels++;
			}
		}
		System.out.println("Vowels Count is :"+count_Vowels);
	}
	public void count_Characters(String str)
	{
		int count_Characters = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count_Characters++;
			}
		}
		System.out.println("Characters count is:"+count_Characters);
	}
	public void count_Words(String str)
	{
		int count_Words = 0;
		char ch[] = new char[str.length()];
		for(int i = 0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))
			{
				count_Words++;
			}
		}
		System.out.println("Number woeds in a Sring:"+count_Words);
	}
				
		
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(str);
		String_1 s1 = new String_1();
		s1.count_Vowels(str);
		s1.count_Characters(str);
		s1.count_Words(str);
	}
}