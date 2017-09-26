package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay ();
	}
	
	public void start()
	{
	//	boolean finished = true;
	//	int count = 0;
	//	while(count < 50)
	//	{
	//		popup.displayText("I am so neat! " + count);
	//		count++;
	//	}
		
	//	for(int loop = 0; loop < 15; loop += 1)
	//	{
	//		popup.displayText("I am looping " + (loop + 1) + " times out of 15");
	//	}
		
		MarshmallowMonster sample = new MarshmallowMonster();
	//	System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Dudester", 3, 4, 2, true);
		
	//	System.out.println(realMonster);
		popup.displayText(realMonster.toString());
	//	System.out.println("Dudester is hungry, so he is going to eat a tentacle");
		popup.displayText("Dudester is hungry, so he is going to eat a tentacle");
		realMonster.setTentacleAmount(1);
	//	System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		interactWithTheMonster(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{	
	//	System.out.println(currentMonster.getName() + " wants to know what you want to eat");
		popup.displayText(currentMonster.getName() + " wants to know what you want to eat");
	//	System.out.println(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount());
	//	System.out.println("How many do you want to eat?");
		int specialAnswer = 0;
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		while(isValidInteger(unconverted) != true)
		//or (!isValidInteger(unconverted))
		{
			popup.displayText("Try again!");
			unconverted = popup.getResponse("How many arms?");
		}
		
	//	if(isValidInteger(unconverted))		//If
	//	{
	//		specialAnswer = Integer.parseInt(unconverted);		//Then
	//	}
		
		Scanner myScanner = new Scanner(System.in);
		int consumed = 0;
		consumed = specialAnswer;
		
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount, silly hooman");
			consumed = 0;
		}
		else if(consumed == 0)
		{
			System.out.println("Not that hungry, are you?");
		}
		else if(consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossible - I only have " + currentMonster.getArmCount() + " arms!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
		}
		
		popup.getResponse("How many eyes do you want to eat? (I currently have 3)");
		int eyesConsumed = myScanner.nextInt();
		
		while(!isValidInteger(unconverted))
		{
			popup.displayText("Try again ya weener!");
			unconverted = popup.getResponse("How many eyes?");
		}
		int validInteger = Integer.parseInt(unconverted);
		
		if(eyesConsumed == 0)
		{
			System.out.println("You can do better than that!");
		}
		else if(eyesConsumed < 0)
		{
			System.out.println("No negatives dum dum");	
		}
		else if(eyesConsumed > currentMonster.getArmCount())
		{
			System.out.println("I ain't got that many eyes, dude");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyesConsumed);
			System.out.println("Thank you for making me blind! Now I have " + currentMonster.getEyeCount() + " eyes");
		}
		
		popup.displayText("Hey, look at me!");		//Prompts message to pop up
		String answer = popup.getResponse("How many meals are you eating today");		//Asks question w/ answer field provided
		System.out.println(answer);
		popup.displayText("Your answer was " + answer + " meal(s)");
	
	}	
	//Helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
					
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)		//If an integer is not input...
		{
			popup.displayText("Only integer values are accepted: " + sample + " is not");		//Text is displayed to explain error
		}
			
			return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are accepted: " + sampleDouble + " is not");
		}
	
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only boolean values are accepted: " + sampleBoolean + " is not");
		}
		return valid;
	}
}
