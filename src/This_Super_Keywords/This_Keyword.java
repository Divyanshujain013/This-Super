package This_Super_Keywords;

public class This_Keyword 
{
	
	//This keyword is used to call the global variable within the class when both global 
	//and local variables having same  name
	
	int num;
	
	public This_Keyword() 
	{
		num=50;
		
		
		}
	
public void KK()
{
	int num=40;
	
	System.out.println(this.num);

	
	
}
	public static void main(String[] args) 
	{
		This_Keyword t=new This_Keyword();
		t.KK();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
