package com.bookmarket.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.bookmarket.bean.BookInfo;

public class TransformUtil {

	

	public static boolean JspToHtmlFile(String filePath, String HtmlFile,BookInfo book) {
		String str = "";
		try {
			String tempStr = "";
			
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8")); 
			//FileInputStream is = new FileInputStream(filePath);
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while ((tempStr = br.readLine()) != null)
				str = str + tempStr;
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		try {

			// 替换掉模块中相应的地方
			str = str.replaceAll("###bookimg###",book.getBookImg());
			str = str.replaceAll("###title###", book.getBookName());
			str = str.replaceAll("###author###", book.getAuthor());
			str = str.replaceAll("###prize###", ""+book.getPrize());
			
			str = str.replaceAll("###intro###",book.getBookIntro());
			str = str.replaceAll("###bookId###",""+book.getBookId());
			str = str.replaceAll("###pageSize###",""+book.getPageSize());

			FileOutputStream  f = new FileOutputStream (HtmlFile);
			OutputStreamWriter  o = new OutputStreamWriter(f,"UTF-8");
			o.write(str);
			o.flush();
			o.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	/**
	 * 测试main 函数
	 *
	 * @param arg
	 */
	public static void main(String[] arg) {
		BookInfo book=new BookInfo();
		book.setBookId(1);
		book.setBookName("bookname2");
		book.setBookIntro("book2intr");
		book.setAuthor("autho1");
		book.setPrize(100.00);
		book.setBookImg("aa.jpg");
		book.setPageSize(5);
		
		String url = "resource/book.html";// 模板文件地址
		String savepath = "e:\\workspace\\bookmarket\\WebContent\\gg.html";// 生成文件地址
		JspToHtmlFile(url, savepath,book);
		System.out.println("end");
	}
}