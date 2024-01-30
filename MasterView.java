package com.as.view;

import com.as.bean.Master;
import com.as.util.Tools;

/**
 * 主人菜单
 * @author user
 *
 */
public class MasterView {

	/**
	 * 主人
	 */
	private Master master;
	
	/**
	 * 主界面
	 */
	private MainView mainView;
	
	public MasterView()
	{
		this.master=new Master();
		this.mainView=new MainView(master);
	}
	
	/**
	 * 注册
	 */
	public void reg()
	{
		System.out.println("输入注册的用户名称");
		String uname=Tools.next();
		
		System.out.println("输入注册的用户密码");
		
		String upwd=Tools.next();
		
		this.master.setUname(uname);
		this.master.setUpwd(upwd);
		System.out.println("注册成功!");
		
	}
	
	/**
	 * 登录
	 * @return true成功,false失败
	 */
	public boolean login()
	{
		System.out.println("输入登录的用户名称");
		String uname=Tools.next();
		
		System.out.println("输入登录的用户密码");
		String upwd=Tools.next();
		
		boolean f=false;
		if(uname.equals(this.master.getUname()) && upwd.equals(this.master.getUpwd()))
		{
			f=true;
		}
		return f;
	}
	
	/**
	 * 主人菜单
	 */
	public void showMenu()
	{
		
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1-注册 2-登录 3-退出");
			System.out.println("请选择:");
			int choose=Tools.nextInt();
			switch (choose) {
			case 1:
				this.reg();
				break;
			case 2:
				boolean f=this.login();
				//判断
				if(f)
				{
					//显示主菜单
					this.mainView.showMenu();
				}
				else
				{
					System.out.println("用户登录失败!");
				}
				break;
			case 3:
				flag=false;
				System.out.println("下次再玩!!");
				break;
			default:
				System.out.println("输入有误!");
				break;
			}
		}
	}
}
