
public class AttackWithSpell implements AttackBehavior
	{
	public int	amountOfDamage;
	
	public int attack()
		{
		int randomD10Roll = (int) ((Math.random() * 9) + 1);
		amountOfDamage = randomD10Roll;
		System.out.println("Feel the magic!");
		return amountOfDamage;
		}

	}
