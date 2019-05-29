package Class;

import Interface.IChef;

public class Chef extends BaseCharacter implements IChef 
{

	public Chef() 
	{		
		name = "Chef";
		canCook = true;		
	}
	
	@Override
	public void Cook() 
	{
		System.out.println(name + " Memasak");
	}

}
