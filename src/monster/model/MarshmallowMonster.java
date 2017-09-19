package monster.model;

public class MarshmallowMonster
{
	//Declaration section for data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless values are specified, all data members
		//are a zero, false, or null
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tenacleAmount)
	{
		this.tentacleAmount = tentacleAmount; //Has no effect supposedly
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
		
	}
	
	public String toString()
	{
		String description = "Hi, I am a scary monster! My name is " + name + ", and I have " + eyeCount;
		description += " eyes, " + armCount + " arms, " + tentacleAmount + " tentacles";
		description += " and my bloop existence is " + hasBloop;
		
		return description;
	}
}