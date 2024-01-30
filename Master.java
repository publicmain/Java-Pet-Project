package com.as.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 主人类(玩家类)
 * 
 * @author user
 * implements Serializable表示类能序列化,
 * 能序列化就是能实现持久化存储
 */
public class Master implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户名称
	 */
	private String	uname; 
	
	/**
	 * 用户密码
	 */
	private String	upwd; 
	
	/**
	 * 余额
	 */
	private int	balance; 
	/**
	 * 宠物的list集合,,每个用户宠物最多3个
	 */
	private List<Pet> pets;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public Master() {
		this.uname="小飞飞";
		this.balance=3500;
		this.pets=new ArrayList<Pet>();
	}
	public Master(String uname, String upwd, int balance) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.balance = balance;
		
		this.balance=balance;
		this.pets=new ArrayList<Pet>();
	}
	

	/**
	 * 显示主人信息
	 */
	public void show()
	{
		//
		System.out.println("主人名称\t余额\t宠物数量");
		System.out.println(this.uname+"\t"+this.balance+"\t"+this.pets.size());
		if(this.pets.size()>0)
		{
			//宠物信息列表
			this.showPets();
		}
	}
	
	@Override
	public String toString() {
		return "Master [uname=" + uname + ", upwd=" + upwd + ", balance=" + balance + ", pets=" + pets + "]";
	} 
	
	/**
	 * 领养宠物
	 * @param pet
	 */
	public void addPets(Pet pet)
	{
		
		//判断主人的宠物的数量>3
		if(this.pets.size()<3)
		{
			//判断金额
			if(this.balance>=pet.getPrice())
			{
				//消费金额的计算
				this.balance-=pet.getPrice();
				//添加宠物
				//pets的list集合添加一个单元的值
				this.pets.add(pet);
				//调用宠物聊天方法
				pet.chat();
				//
				System.out.println("主人不忘记喂食!");
			}
			else
			{
				System.out.println("友情提示:");
				System.out.println("主人金额不足,现在余额为"+this.balance);
			}
			System.out.println("宠物领养成功!");
		}
		else
		{
			//>=3
			System.out.println("宠物已达上限!");
		}
	}
	
	/**
	 * 宠物放生
	 * @param index 集合的对应的下标
	 */
	 
	public void subPet(int index)
	{
		//
		this.balance+=this.pets.get(index).getPrice();
		System.out.println("主人你不要我了");
		this.pets.get(index).chat();
		//
		//从集合中移出一个单元的值
		this.pets.remove(index);
		//
		System.out.println("你是好人,好人一生平安!!"); 
		
	}
	
	/**
	 * 主人的宠物列表
	 */
	public void showPets()
	{
		//显示主人的宠物列表
//		List<Pet> pets=this.master.getPets();
		System.out.println("主人的宠物列表");
		System.out.println("编号\t昵称\t价格\t饥饿\t体力\t力量\t智力\t健康");
		for(int i=0;i<this.pets.size();i++)
		{
			System.out.print((i+1)+".");
			this.pets.get(i).show();
		}
	}
	
	/**
	 * 喂养宠物
	 * @param index 对应宠物集合下标
	 * @param food 食品
	 */
	public void eat(int index,Food food)
	{
		//对应的宠物
		Pet pet=this.pets.get(index);
		
		//判断余额
		if(this.balance>=food.getPrice())
		{
			
			//主人余额=主人余额-食品价格
			this.balance-=food.getPrice();
		
			//改变宠物属性的值
			//99
			//10
			//109
			
			
			//400+30>=500
			if(pet.getSinew()+food.getSinew()>=500)
			{
				pet.setSinew(500);
			}
			else
			{
				pet.setSinew(pet.getSinew()+food.getSinew());
			}
			
			
			if(pet.getPower()<500)
			{
				pet.setPower(pet.getPower()+food.getPower());
			}
			else
			{
				pet.setPower(500);
			}
			
			
			if(pet.getHunger()<100)
			{
				
				pet.setHunger(pet.getHunger()+food.getHunger());
			}
			else
			{
				pet.setHunger(100);
				//
				System.out.println(pet.getNickName()+"宠物说:主人不能喂食品了....!!");
			}
			
			
			if(pet.getIntelligent()<100)
			{
				
				pet.setIntelligent(pet.getIntelligent()+food.getIntelligent());
			}
			else
			{
				pet.setIntelligent(100);
				//
				System.out.println(pet.getNickName()+"宠物说:主人不能喂食品了,智力满格了...");
			}
			
			//调用宠物聊天的方法
			pet.chat();
			
		}
		else
		{
			System.out.println("友情提示:");
			System.out.println("余额不足,不能喂养!!!");
			System.out.println(pet.getNickName()+"宠物说:主人真穷!!");
		}
	}
	
	
	
}
