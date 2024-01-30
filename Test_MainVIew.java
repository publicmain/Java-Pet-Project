package com.as.test;

import com.as.bean.Master;
import com.as.view.MainView;

public class Test_MainVIew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Master master=new Master();
//		Master master=new Master("小强", "123", 5000);
//		MainView mainView=new MainView(master);
//		mainView.showMenu();
		
		//new MainView(new Master()).showMenu();
		
		new MainView(new Master("小强", "123", 5000)).showMenu();
		
	}

}
