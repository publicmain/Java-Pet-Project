package com.as.view;

import com.as.bean.Master;
import com.as.util.Tools;

/**
 * 主界面类
 * @author user
 *
 */
public class MainView {

	private PetShopView petShopView;
	private FoodShopView foodShopView;
	private Master master;
	
	public MainView() {}
	
	public MainView(Master master)
	{
		this.master=master;
		this.foodShopView=new FoodShopView(master);
		this.petShopView=new PetShopView(master);
		
	}
	/**
	 * 主菜单
	 */
	public void showMenu()
	{
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1-宠物商店 2-食品店 3--宠物打工 4-宠物医院 5-主人信息 6--放生宠物 7-返回上一级");
			System.out.println("请选择:");
			int choose=Tools.nextInt();
			switch (choose) {
			case 1:
				//System.out.println("1-宠物商店");
				this.petShopView.showMenu();
				break;
			case 2:
				//System.out.println(" 2-食品店 ");
				this.foodShopView.showMenu();
				break;
			case 3:
				System.out.println("  3--宠物打工 ");
				break;
			case 4:
				System.out.println(" 4-宠物医院 ");
				break;
			case 5:
				this.master.show();
				break;
			case 6:
				 if(this.master.getPets().size()>0)
				 {
					//显示主人的宠物列表
					this.master.showPets();
					System.out.println("请选择要放生的宠物编号");
					int index=Tools.nextInt();
					//调用宠物放生方法
					this.master.subPet(index-1);//编号与下标差1
				 }
				 else
				 {
					 System.out.println("主人没有宠物,不能放生!");
				 }
				
				
				break;
				
			case 7:
				flag=false;
				break;
			default:
				System.out.println("输入有误!");
				break;
			}
		}
	}
}
