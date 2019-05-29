package Class;

public class BaseCharacter 
{

	protected String name;
	protected String description;
	protected boolean canCook = false;  
	protected boolean canWork = false;
	protected boolean canDrive = false;
	protected boolean canPaint = false;
	
	public void getInfo() {
		
		int count = 0;
		if (canCook)
		{
			System.out.println(name + ", Seorang yang bisa memasak");
			count++;
		}
		
		if (canDrive)
		{
			System.out.println(name + ", Seorang yang bisa menyetir");
			count++;
		}
		
		if (canWork)
		{
			System.out.println(name + ", Seorang yang bisa bekerja");
			count++;
		}
		
		if (canPaint)
		{
			System.out.println(name + ", Seorang yang bisa melukis");
			count++;
		}	
		
		if (count == 0)
		{
			System.out.println(name + ", Seorang yang tidak bisa melakukan apa-apa");
		}
		
		
	}
	
	
	public void Work() 
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Drive() 
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Paint() 
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Cook() 
	{
		System.out.println("Karakter tidak bisa melakukan aksi");
		
	}

	public String getName()
	{
		return name;
	}
	
}
