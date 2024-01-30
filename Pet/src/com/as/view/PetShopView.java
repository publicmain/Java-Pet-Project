package com.as.view;

import java.util.List;

import com.as.bean.Master;
import com.as.bean.Pet;
import com.as.bean.shop.PetShop;
import com.as.util.Tools;

/**
 * 宠物商店界面类
 * 菜单类
 * @author user
 *
 */
public class PetShopView {

	private PetShop petShop;
	private Master master;
	
	public PetShopView() {}
	
	public PetShopView(Master master)
	{
		this.petShop=new PetShop("阿龙宠物店");
		this.master=master;
	}
	
	
	public void showMenu()
	{
		
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1-宠物列表 2-领养宠物 3-返回上一级(退出)");
			System.out.println("请选择:");
			int choose=Tools.nextInt();
			switch (choose) {
			case 1:
				//System.out.println("1-宠物列表");
				this.petShop.show();
				break;
			case 2:
				//System.out.println("2-领养宠物");
				//宠物列表
				this.petShop.show();
				//提示:
				System.out.println("请选择要领养的宠物的编号:");
				int index=Tools.nextInt();
				//得到所有宠物
				List<Pet> pets=this.petShop.getPets();
				//得到选择的宠物,index与集全中的下标差1
				Pet pet=pets.get(index-1);
				//调用方法
				this.master.addPets(pet);
			
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
}
