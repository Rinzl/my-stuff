package com.jsoup.test;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DemoTachDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc = Jsoup.connect("http://vietcomic.net/chapter/suicide_squad_/45/1614").get();
			Element e = doc.getElementsByTag("Script").get(11);
			System.out.println("---");
			System.out.println(e.toString());
			System.out.println("-----------------------------");
			String demo = e.toString();
			String data = demo.substring(demo.indexOf("'")+1, demo.indexOf(";")-1);
			System.out.println(data);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			for(String url : data.split("\\|")) {
				System.out.println(url);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
