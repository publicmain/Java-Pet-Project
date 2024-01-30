package com.as.test;

import com.as.bean.Pet;

public class Demo3_pet {

	public static void main(String[] args) {
		
		Pet pet=new Pet("小白", 100, 50, 20, 150, 50, 56);
		
		//调用方法:
		pet.chat();
		pet.chat();
		pet.chat();
		pet.chat();
		pet.chat();
	}
}
