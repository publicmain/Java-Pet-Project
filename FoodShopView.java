package com.as.view;

import java.util.List;

import com.as.bean.Food;
import com.as.bean.Master;

//awt
//swing javase

import com.as.bean.shop.FoodShop;
import com.as.util.Tools;

/**
 * 食品店的界面类
 * @author user
 *
 */
public class FoodShopView {
	
	/**
	 * 食品店
	 */
	private FoodShop foodShop;
	
	/**
	 * 主人
	 */
	private Master master;
	
	
	public FoodShopView()
	{
		
	}
	
	public FoodShopView(Master master) {
		super();
		this.foodShop =new FoodShop("小川食品店");
		this.master = master;
	}



	/**
	 * 菜单
	 */
	public void showMenu()
	{
		boolean flag=true;
		while(flag)
		{
			System.out.println("1-食品列表 2-喂养宠物 3-返回上一级");
			System.out.println("请选择:");
			int choose=Tools.nextInt();
			switch (choose) {
			case 1:
				System.out.println("食品列表");
				this.foodShop.show();
				break;
			case 2:
				//System.out.println("喂养宠物");
				//显示主人的宠物列表
				this.master.showPets();
				//
				System.out.println("请选择要喂养宠物的编号");
				int index=Tools.nextInt();//编号与下标差1
				System.out.println("喂养宠物编号"+index);
				//食品列表
				this.foodShop.show();
				System.out.println("请选择食品编号");
				int i=Tools.nextInt();
				//得到选择的食品
				Food food=this.foodShop.getFoods().get(i-1);//编号与下标差1
				//调用喂养方法
				this.master.eat(index-1, food);
				break;
			case 3:
				flag=false;//结束while循环
				break;	
			default:
				System.out.println("输入有误!");
				break;
			}
		}
	}


	public FoodShop getFoodShop() {
		return foodShop;
	}



	public void setFoodShop(FoodShop foodShop) {
		this.foodShop = foodShop;
	}



	public Master getMaster() {
		return master;
	}



	public void setMaster(Master master) {
		this.master = master;
	}

}
