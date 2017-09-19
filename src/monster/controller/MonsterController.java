package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Dudester", 3, 4, 2, true);
		
		System.out.println(realMonster);
		System.out.println("Dudester is hungry, so he is going to eat a tentacle");
		realMonster.setTentacleAmount(1);
		System.out.println(realMonster);
		
		interactWithTheMonster(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what you want to eat");
		System.out.println(currentMonster.getName() + " suggests arms. He has " + currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount, silly hooman");
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
		System.out.println("How many eyes do you want to eat? (I currently have 3)");
		int eyesConsumed = myScanner.nextInt();
		
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
	}
}
