package com.as.test;

import com.as.bean.Master;
import com.as.util.Tools;

public class Demo2_读取文件_转成Master {

	public static void main(String[] args) {
		
		//读取存档文件
		Master master=(Master)Tools.load();
		//
		System.out.println(master.toString());
	}
}
