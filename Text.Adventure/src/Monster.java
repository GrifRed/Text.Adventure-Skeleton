
public class Monster
	{
	private String nameOfMonster;
	private int hitPointsOfMonster;
	AttackBehavior myAttackBehavior;
	
	public String getNameOfMonster()
		{
		return nameOfMonster;
		}
	public void setNameOfMonster(String n)
		{
		nameOfMonster = n;
		}
	public int getHitPointsOfMonster()
		{
		return hitPointsOfMonster;
		}
	public void setHitPointsOfMonster(int hp)
		{
		hitPointsOfMonster = hp; 
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
