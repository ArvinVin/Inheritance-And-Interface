package Class;

import Interface.IDriver;

public class Driver extends BaseCharacter implements IDriver 
{

	public Driver() 
	{
		name = "Driver";
		canDrive = true;
	}
	
	@Override
	public void Drive() 
	{
		System.out.println(name + " Menyetir");
	}

}
