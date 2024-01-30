package com.as.bean;

/**
 * 食品类
 * @author user
 *
 */
public class Food {


	/**
	 * 食品名称
	 */
	private String foodName;
	
	/**
	 * 价格
	 */
	private int price;
	
	/**
	 * 饥饿度
	 */
	private int hunger;
	
	/**
	 * 体力
	 */
	private int sinew;
	
	/**
	 * 力量
	 */
	private int power;
	
	/**
	 * 智力
	 */
	private int intelligent;
	
	/**
	 * 健康
	 */
	private int health;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getSinew() {
		return sinew;
	}

	public void setSinew(int sinew) {
		this.sinew = sinew;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getIntelligent() {
		return intelligent;
	}

	public void setIntelligent(int intelligent) {
		this.intelligent = intelligent;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public Food() {}
	
	public Food(String foodName, int price, int hunger, int sinew, int power, int intelligent, int health) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.hunger = hunger;
		this.sinew = sinew;
		this.power = power;
		this.intelligent = intelligent;
		this.health = health;
	}
	
	/**
	 * 显示食品信息
	 */
	public void show()
	{
		
		System.out.println(this.foodName+"\t"+this.price+"\t"+this.hunger+"\t"+this.sinew+"\t"+this.power+"\t"+this.intelligent+"\t"+this.health);
	}

	
	
  
	
}
