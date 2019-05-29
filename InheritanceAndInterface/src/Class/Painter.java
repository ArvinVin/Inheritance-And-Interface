package Class;

import Interface.IArtist;
import Interface.IDriver;

public class Painter extends BaseCharacter implements IArtist,IDriver
{

	public Painter() 
	{		
		name = "Painter";
		canPaint = true;
		canDrive = true;				
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

}
