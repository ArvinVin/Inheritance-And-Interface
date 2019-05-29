package Class;

import Interface.IArtist;
import Interface.IWorker;
import Interface.IChef;
import Interface.IDriver;

public class Assistant extends BaseCharacter implements IChef, IArtist, IDriver, IWorker{

	public Assistant() 
	{		
		name = "Assistant";
		canCook = true;
		canWork = true;
		canPaint = true;
		canDrive = true;
	}		
	
	
	@Override
	public void Work() 
	{
		System.out.println(name + " Bekerja");
	}

	@Override
	public void Drive()
	{
		System.out.println(name + " Menyetir");
	}

	@Override
	public void Paint() 
	{
		System.out.println(name + " Melukis");
	}

	@Override
	public void Cook() 
	{
		System.out.println(name + " Memasak");	
	}
}
