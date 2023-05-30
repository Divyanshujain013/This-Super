package This_Super_Keywords;

public class Super_Keyword1 extends Super_Keyword
{
	int num;
	
	public Super_Keyword1() 
	{
		num=10;
		
		
		}
	
	public void Q()
	{                   
		System.out.println(super.num+num);
	
	System.out.println(num);
	System.out.println(super.num);
	
	
	}
	
	public static void main(String[] args) 
	{
		
		Super_Keyword1 s=new Super_Keyword1();
		s.Q();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
