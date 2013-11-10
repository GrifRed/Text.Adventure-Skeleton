
import java.util.*;

public class GenerateHero
	{
	int setHitPointsOfHero;
	
	public static Hero generateHero()
		{
		int heroClass = getHeroClass();
		Hero hero = new Hero();
		initializeHero(hero, heroClass);
		return hero;
		}
	public static int getHeroClass()
		{		
		System.out.println("Type the number of the class you'd like to play.");
		System.out.println("(1)  fighter");
		System.out.println("(2)  thief");
		System.out.println("(3)  mage");
		System.out.println();
			
		Scanner scanner = new Scanner(System.in);
		int scannerValue = Integer.parseInt(scanner.nextLine());
		return scannerValue;
		}
		
	public static void initializeHero(Hero hero, int heroClass)
		{
		switch (heroClass)
			{
			case 1:
			int randomD10Roll = (int) ((Math.random() * 9) + 1);
			hero.setHitPointsOfHero (randomD10Roll);
			hero.setAttackBehavior(new AttackWithSword());
			break;
			case 2: 
			int randomD6Roll = (int) ((Math.random() * 5) + 1);
			hero.setHitPointsOfHero (randomD6Roll);
			hero.setAttackBehavior(new AttackWithFist());
			break;
			case 3: 
			int randomD4Roll = (int) ((Math.random() * 3) + 1);
			hero.setHitPointsOfHero (randomD4Roll);
			hero.setAttackBehavior(new AttackWithSpell());
			break;
			}
		}		
	}
	
