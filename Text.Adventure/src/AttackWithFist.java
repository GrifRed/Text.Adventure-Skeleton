
public class AttackWithFist implements AttackBehavior
	{
	public int	amountOfDamage;

	public int attack()
		{
		int randomD3Roll = (int) ((Math.random() * 2) + 1);
		amountOfDamage = randomD3Roll;
		System.out.println("Enjoy this knuckle sandwich.");
		return amountOfDamage;
		}
	}

