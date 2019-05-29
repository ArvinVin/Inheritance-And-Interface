package Class;

import Interface.IWorker;

public class Worker extends BaseCharacter implements IWorker
{

	public Worker() 
	{
		name = "Worker";
		canWork = true;
	}
	
	@Override
	public void Work() 
	{
		System.out.println(name + " Bekerja");
	}

}
