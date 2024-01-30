package com.as.bean.shop;


import java.util.ArrayList;
import java.util.List;

import com.as.bean.Pet;

/**
 * 宠物商店
 * @author user
 *
 */
public class PetShop {

	/**
	 *  商店名称
	 */
	private String shopName;
	

	/**
	 * 宠物列表
	 */
	private List<Pet> pets; 
	
	
	
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public PetShop() {}
	
	public PetShop(String shopName) {
		
		this.shopName=shopName;
		this.initPets();
		
		
	}
	
	public void initPets()
	{
		this.pets=new ArrayList<Pet>();
		//添加集合的单元的值
		
		//public Pet(String nickName, int price, int hunger, int sinew, int power, int intelligent, int health)
		this.pets.add(new Pet("小白", 100, 50, 80, 150, 80, 50));
		this.pets.add(new Pet("小黑", 200, 30, 90, 150, 70, 40));
		this.pets.add(new Pet("大黄", 150, 40, 80, 150, 50, 30));
		this.pets.add(new Pet("阿龙", 200, 50, 100, 150, 150, 20));
		this.pets.add(new Pet("小龙", 180, 60, 150, 150, 150, 60));
		this.pets.add(new Pet("小白龙", 600, 30, 200, 150, 250, 75));
		this.pets.add(new Pet("小青", 700, 30, 20, 150, 120, 90));
		this.pets.add(new Pet("日丽", 20, 40, 20, 150, 20, 25));
		this.pets.add(new Pet("旺财", 900, 50, 20, 40, 50, 45));
		this.pets.add(new Pet("点点", 1000, 70, 20, 10, 150, 60));
	}
	//显示宠物商店宠物信息
	public void show()
	{
		System.out.println(this.shopName+"宠物列表:");
		//public Pet(String nickName, int price, int hunger, int sinew, int power, int intelligent, int health)
		System.out.println("昵称\t价格\t饥饿\t体力\t力量\t智力\t健康");
		for(int i=0;i<this.pets.size();i++)
		{
			//System.out.println(pet.toString());
			System.out.print((i+1)+".");
			this.pets.get(i).show();
		}
	}
	

	
}
