package com.as.test;

import java.util.List;

import com.as.bean.Master;
import com.as.bean.Pet;
import com.as.view.FoodShopView;
import com.as.view.PetShopView;

public class Demo6_PetShopView {

	public static void main(String[] args) {
		
		Master master=new Master();
		PetShopView  petShopView=new PetShopView(master);
		
		petShopView.showMenu();
		
		//测试主人
		//得到主人所有宠物
		master.showPets();
		//
		FoodShopView foodShopView=new FoodShopView(master);
		foodShopView.showMenu();
		
		
		//测试主人
		//得到主人所有宠物
		master.showPets();
				
				
	}
}
