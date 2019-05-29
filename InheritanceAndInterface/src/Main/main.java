package Main;

import java.util.Scanner;
import java.util.Vector;

import Class.Assistant;
import Class.Fisher;
import Class.Painter;
import Class.Worker;
import Class.Chef;
import Class.Driver;
import Class.BaseCharacter;

public class main 
{

	Scanner scan = new Scanner(System.in);
	
	public main()
	{
		
		Vector<BaseCharacter> characters = new Vector<>();
	
		BaseCharacter character = new Assistant();
		characters.add(character);
		
		character = new Chef();
		characters.add(character);
		
		character = new Worker();
		characters.add(character);
		
		character = new Driver();
		characters.add(character);
		
		character = new Fisher();
		characters.add(character);
		
		character = new Painter();
		characters.add(character);
		
		while(true)
		{			
			for (int i = 0; i < 27; i++) 
			{
					System.out.println();
			}
			
			System.out.println("Simulasi kelompok kemampuan");
			
			for (int i = 0 ; i < characters.size(); i++)
			{
				System.out.println(i + ":" + characters.get(i).getName());
			}
			System.out.println(6 + ":Exit");
			
			System.out.print("Input : ");
			
			String action = scan.next();
			String target = scan.nextLine();		
					
			Vector<Integer> targets = new Vector<>();
			for (int i = 1; i < target.length(); i += 2)
			{				
				int index = (int)(target.charAt(i)-'0');
				
				if (index >= 0 && index <= 5) 
				{
					targets.add(index);
				}
				else 
				{
					System.out.println("index (" + index + ") Out of bound");
				}
			}
			
			for (int i = 0; i < targets.size(); i++)
			{
				switch(action.toLowerCase()) 
				{
					case "info":
						characters.get(targets.get(i)).getInfo();
						break;
					case "cook":
						characters.get(targets.get(i)).Cook();
						break;
					case "drive":
						characters.get(targets.get(i)).Drive();
						break;
					case "work":
						characters.get(targets.get(i)).Work();
						break;
					case "paint":
						characters.get(targets.get(i)).Paint();
						break;
				}
			}						
			
			if (action.equalsIgnoreCase("exit")) 
			{
					break;
			}
			
			System.out.println("\n\nPress any key to continue...");
			scan.nextLine();						
		}
		
		System.out.println("\nThankyou");
	}
	
	public static void main(String[] args) 
	{
		new main();	
	}

}
