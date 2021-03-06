package net.kenvanhoeylandt.solutions.day21;

/**
 * An item for a player that carries stats.
 */
public class PlayerItem
{
	private final String mName;

	private final int mCost;

	private final int mDamage;

	private final int mArmor;

	public PlayerItem(String name, int cost, int damage, int armor)
	{
		mName = name;
		mCost = cost;
		mDamage = damage;
		mArmor = armor;
	}

	public int getCost()
	{
		return mCost;
	}

	public int getDamage()
	{
		return mDamage;
	}

	public int getArmor()
	{
		return mArmor;
	}

	@Override
	public String toString()
	{
		return "[" + mName + "]";
	}
}
