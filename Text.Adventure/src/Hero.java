
	public class Hero
	{
	protected String nameOfHero;
	AttackBehavior myAttackBehavior;
	private int	hitPointsOfHero;
	
	public String getNameOfHero()
		{
		return nameOfHero;
		}
	public void setNameOfHero(String n)
		{
		nameOfHero = n;
		}
	public int getHitPointsOfHero()
		{
		return hitPointsOfHero;
		}
	public void setHitPointsOfHero(int h)
		{
		hitPointsOfHero = h;
		}
	public int performAttack()
		{
		return myAttackBehavior.attack();
		}
	public void setAttackBehavior(AttackBehavior ab)
		{
		myAttackBehavior = ab;
		}
	public AttackBehavior getAttackBehavior()
		{
		return myAttackBehavior;
		}
	}

	
