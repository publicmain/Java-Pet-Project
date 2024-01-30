package com.as.bean;

import java.io.Serializable;
import java.util.Random;

/**
 * 宠物类:一个类,只描述一个类的相关信息
 * 类能被序列化,才能实现持久化存储
 * 
 * @author user
 *
 */
public class Pet implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 昵称
	 */
	private String nickName;
	
	/**
	 *  价格
	 */
	private int price;
	
	/**
	 * 饥饿
	 */
	private int hunger; //100
	
	/**
	 * 体力
	 */
	private int sinew;//500
	
	/**
	 * 力量
	 */
	private int power; //500
	
	/**
	 * 智力
	 */
	private int intelligent;//100
	
	/**
	 * 健康
	 */
	private int health;//100
	
	/**
	 * 存储数组,聊天内容
	 */
	private String[] language;
	
	/*
	 * 产生随机数属性
	 */
	private Random random;
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	//无参构造函数
	public Pet() {
		//调用方法:初始化数组
		this.initLanguage();
		this.random=new Random();
	}
	
	//有参构造函数
	public Pet(String nickName, int price, int hunger, int sinew, int power, int intelligent, int health)
	{
		super();
		this.nickName = nickName;
		this.price = price;
		this.hunger = hunger;
		this.sinew = sinew;
		this.power = power;
		this.intelligent = intelligent;
		this.health = health;
		//调用方法:初始化数组
		this.initLanguage();
		this.random=new Random();
		

	
	
	}

//	@Override
//	public String toString() {
//		return "Pet [nickName=" + nickName + ", price=" + price + ", hunger=" + hunger + ", sinew=" + sinew + ", power="
//				+ power + ", intelligent=" + intelligent + ", health=" + health + "]";
//	}
	
	public void show()
	{
		//public Pet(String nickName, int price, int hunger, int sinew, int power, int intelligent, int health)
		System.out.println(this.nickName+"\t"+this.price+"\t"+this.hunger+"\t"+this.sinew+"\t"+this.power+"\t"+this.intelligent+"\t"+this.health);
	}
	/**
	 * 初始化数组
	 */
	public void initLanguage()
	{
		 	this.language=new String[20];
		 	language[0]="你好!!!!，大帅哥主人，我今天心情不错，所以你就叫帅哥，嘎嘎！";
			language[1]="亲爱的主人，可怜可怜我吧，我都好几天没吃到肉了，能给个火腿吗？如果你不给，我就再也不工作了！";
			language[2]="天天打工好累啊！";
			language[3]="我要去冒险，冒险，冒险！";
			language[4]="我是天生的冒险家！";
			language[5]="主人，主人，你爱我吗？";
			language[6]="主人，我有个秘密，你想知道吗？";
			language[7]="如果你爱我，你就抱抱我，如果你爱我，你就亲亲我！";
			language[8]="现在已经进入IPHONE5时代，能给我买一台吗？";
			language[9]="Happy birthday to me！Happy birthday to me！没人理我，只能自己庆祝了！";
			language[10]="主人，如果我不在了，你会想我吗？";
			language[11]="主人，我要休息了，你别来烦我，呵呵！";
			language[12]="主人，你生气了吗？多久没有来看我了";
			language[13]="主人，我好饿啊，喂我点吃的吧";
			language[14]="主人，你的电话多少，有时间给你电话";
			language[15]="你是帅哥还是美女";
			language[16]="今天的天气不错啊，带我去兜风吧";
			language[17]="主人，你今天吃的什么啊，这么高兴";
			language[18]="我今天不吃饭了，心情不好,烦着呢，不要理我";
			language[19]="主人，我没有钱了，给我点钱花花吧";
	}
	
	/**
	 * 宠物聊天
	 */
	public void chat()
	{
 		
		//随机聊天:
		//语言字符串数组下标:0-19
		int index=this.random.nextInt(20);//0-19
		String language=this.language[index];
		System.out.println(this.nickName+"说:");
		System.out.println(language);
	
	}
	
	
	
	
	
	
	
}
