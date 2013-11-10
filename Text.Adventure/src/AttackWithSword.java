
public class AttackWithSword implements AttackBehavior
		{
		public int	amountOfDamage;

		public int attack()
			{
			int randomD6Roll = (int) ((Math.random() * 5) + 1);
			amountOfDamage = randomD6Roll;
			System.out.println("Eat steel, Foe!");
			return amountOfDamage;
			}
		}
	
