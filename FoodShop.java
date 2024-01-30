package com.as.bean.shop;

import java.util.ArrayList;
import java.util.List;

import com.as.bean.Food;

/**
 * 食品店
 * @author user
 *
 */
public class FoodShop {
	
	private String foodShopName;
	
	private List<Food> foods;
	
	
	
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	public String getFoodShopName() {
		return foodShopName;
	}
	public void setFoodShopName(String foodShopName) {
		this.foodShopName = foodShopName;
	}

	public FoodShop()
	{
		this.foodShopName = "明川食品店";
		this.foods=new ArrayList<Food>();
		//调用方法:食品初始化
		this.initFoods();
	}
	public FoodShop(String foodShopName) {
		super();
		this.foodShopName = foodShopName;
		this.foods=new ArrayList<Food>();
		//调用方法:食品初始化
		this.initFoods();
	}
	
	
	/**
	 * 食品初始化
	 */
	public void initFoods()
	{
		//public Food(String foodName, int price, int hunger, int sinew, int power, int intelligent, int health) {
		this.foods.add(new Food("水虻", 50, 25, 30, 20, 5, 3));
		this.foods.add(new Food("苍蝇", 10, 20, 20, 24, 5, 2));
		this.foods.add(new Food("大蚊", 15, 15, 40, 28, 5, 5));
		this.foods.add(new Food("蚊子", 5, 25, 10, 15, 5, 3));
		this.foods.add(new Food("食虫虻", 30, 35, 20, 19, 5, 5));
		this.foods.add(new Food("灰蝶", 50, 15, 15, 25, 5, 5));
		this.foods.add(new Food("生菜", 2, 15, 30, 10, 5, 1));
		this.foods.add(new Food("冬瓜", 3, 5, 5, 20, 50, 1));
		this.foods.add(new Food("苦瓜", 4, 5, 10, 20, 10, 2));
		this.foods.add(new Food("竹笋", 5, 10, 15, 20, 15, 10));
	
	}
	
	
	//显示食品列表
	public void show()
	{
		System.out.println(this.foodShopName+"食品列表:");
		//public Pet(String nickName, int price, int hunger, int sinew, int power, int intelligent, int health)
		System.out.println("食品名称\t价格\t饥饿\t体力\t力量\t智力\t健康");
		for(int i=0;i<this.foods.size();i++)
		{
			//编号和下标差1
			System.out.print((i+1)+".");
			this.foods.get(i).show();
		}
	}
	

}
