package com.bookmarket.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bookmarket.bean.BookInfo;
import com.bookmarket.bean.Buy;
import com.bookmarket.bean.UserInfo;
import com.bookmarket.dao.BookDao;

@Controller
public class BookController {

	@Autowired(required = true)
	private BookDao bookDao;

	// 书本初始化，初始化几本书
	@RequestMapping(value = "test.json")
	@ResponseBody
	public Object test(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		String htmlpath = request.getSession().getServletContext().getRealPath("/");
		BookInfo book = new BookInfo();
		book.setBookId(1);
		book.setBookName("星际战争");
		book.setBookIntro(
				"麦肯锡21年，飞船掠过太阳，这是人类第一次到达系外恒星系统！飞船在黄白色的双星构成的火焰峡谷中缓缓穿过，宇宙在峡谷两头蜷缩成狭小的一线天，壮观的场景令每个人都为之窒息！ 　　我，一名宇航员，带着地球人的希望与寄托，前往伊甸园星球。 　　在传说中，它环绕一颗主序星运行，和地球同样大小，天然适合人类居住，从未染过黑烟的天空下荡漾着蓝色的海洋，没有战争与杀戮。 　　在星际航行的过程中，我历经困难，生离死别，穿越多个星系，终于抵达目的地，却发现，贪婪与自私，是整个宇宙的本能，伊甸园星球也未能幸免。由于我的贸然造访，引发一场毁灭性的灾难向人类凶猛扑来……");
		book.setAuthor("刘慈欣");
		book.setPrize(30.40);
		book.setBookType(0);
		book.setBookImg("1.jpg");
		book.setBookURL("1.html");
		book.setPageSize(5);
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);

		book.setBookId(2);
		book.setBookName("代号");
		book.setBookIntro(
				"太平洋战争爆发前夕，十几万日军环伺天津英法租界，中共地下工作者、国民政府特工和日本特务之间陷入残酷、复杂的缠斗之中。时髦的冯九思在英租界警务处任职，接到中共上级指示，侦破针对抗日分子的连环杀人案，不幸的是，派给他的领导却是对他误会甚深，贫穷至极的工人党员杨炳新。于是，两个脾气秉性迥异，生活品质天渊地别，相互之间又有深深成见的同志，不得不携手行动。他们不断发现新线索，却又不断遭受挫折。他们的对手太强大，隐藏得似浅实深，智力和实力远超他们二人。然而，对国家民族的忠诚之心和对革命理想的坚定信仰，让冯九思与杨炳新在腥风血雨和重重迷雾中艰难摸索，几经挫折，几经磨难，历尽生死，终于揭开“吉田事件”的真相，挫败了敌人污蔑中共抗日行动的阴谋。");
		book.setAuthor("龙一 ");
		book.setPrize(22.80);
		book.setBookType(1);
		book.setBookImg("2.jpg");
		book.setBookURL("2.html");
		book.setPageSize(3);
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);

		book.setBookId(3);
		book.setBookName("Java核心技术");
		book.setBookIntro(
				"Java领域最有影响力和价值的著作之一，由拥有20多年教学与研究经验的资深Java技术专家撰写（获Jolt大奖），与《Java编程思想》齐名，10余年全球畅销不衰，广受好评。第9版根据Java SE 7全面更新，同时修正了第8版中的不足，系统全面讲解Java语言的核心概念、语法、重要特性和开发方法。本书全面覆盖Java技术的高级主题，包括流与文件、XML、网络、数据库编程、国际化等，详细描述了图形与GUI编程，还涉及安全、远程方法、注解处理、本地方法等。本书对Java技术的阐述精确到位，叙述方式深入浅出，并包含大量示例代码，能够帮助读者充分理解Java语言并灵活应用。");
		book.setAuthor("Cay S. Horstmann ");
		book.setPrize(115.40);
		book.setBookType(2);
		book.setBookImg("3.jpg");
		book.setBookURL("3.html");
		book.setPageSize(2);
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);

		book.setBookId(4);
		book.setBookName("三毛全集:撒哈拉的故事");
		book.setBookIntro(
				"三毛作品中脍炙人口当属《撒哈拉的故事》，《撒哈拉的故事》由十几篇精彩动人的散文结合而成，其中《沙漠中的饭店》，是三毛适应荒凉单调的沙漠生活后，重新拾笔的第一篇文章，从此之后，三毛便写出一系列以沙漠为背景的故事，倾倒了全世界的华文读者。");
		book.setAuthor("三毛"); 
		book.setPrize(14.90);
		book.setBookType(1);  
		book.setBookImg("4.jpg");
		book.setBookURL("4.html");
		book.setPageSize(3);
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);

		book.setBookId(5);
		book.setBookName("浮生梦 [My Cousin Rachel]");
		book.setBookIntro(
				"抚养菲利普长大的堂兄突然去世了，他的妻子也从意大利来到了英国。菲利普宁静的乡间生活就是在初见到她时被毁掉的。瑞秋俘获了他的心。他不知道的是，对瑞秋的迷恋，很快就会将他推入自我毁灭的边缘。在他为这份感情奋不顾身的同时，他也将所有人的命运推向了一个无法逆转的方向。");
		book.setAuthor(" 达芙妮·杜穆里埃");
		book.setPrize(24.40);
		book.setBookType(1);
		book.setBookImg("5.jpg");
		book.setBookURL("5.html");
		book.setPageSize(3);
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);

		return result;
	}

	@RequestMapping(value = "regist.json")
	public Object regist(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file)
			throws Exception {
		UserInfo user = new UserInfo();

		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		user.setPhone(request.getParameter("phone"));
		user.setSex(Integer.parseInt(request.getParameter("sex")));
		user.setAddress(request.getParameter("address"));

		String phone = request.getParameter("phone");
		// userIcon处理
		if (file != null) {
			// 图标统一放置位置
			String realPath = request.getSession().getServletContext().getRealPath("/images/userIcon");
			File path = new File(realPath);
			if (!path.exists()) {
				path.mkdirs();
			}
			String fileName = file.getOriginalFilename();
			if (fileName.toUpperCase().contains(".JPG") || fileName.toUpperCase().contains(".PNG")) {
				if (fileName.toUpperCase().contains(".JPB")) {
					fileName = phone + System.currentTimeMillis() + ".jpg";
				} else {
					fileName = phone + System.currentTimeMillis() + ".png";
				}
				File destFile = new File(realPath, fileName);
				if (!destFile.exists()) {
					destFile.mkdirs();
				}
				file.transferTo(destFile);
				String imgURL = fileName;
				user.setUserIcon(imgURL);
			}

		}

		bookDao.addUser(user);
		return "index";
	}

	@RequestMapping(value = "login.json")
	@ResponseBody
	public Object login(HttpServletRequest request) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		UserInfo user = bookDao.getUserByName(request.getParameter("name"));
		if (user != null && user.getPassword().equals(request.getParameter("password"))) {
			result.put("userIcon", user.getUserIcon());
			if (user.getUserType() == 0) {
				result.put("code", 0);
			} else {
				result.put("code", 1);
			}
			result.put("buys", bookDao.getBuyByUserName(request.getParameter("name")));
			result.put("favorite", bookDao.getFavoriteByUserName(request.getParameter("name")));
		} else {
			result.put("code", 2);// 密码错误
		}

		return result;
	}

	@RequestMapping(value = "loginInfo.json")
	@ResponseBody
	public Object loginInfo(HttpServletRequest request) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("buys", bookDao.getBuyByUserName(request.getParameter("name")));
		result.put("favorite", bookDao.getFavoriteByUserName(request.getParameter("name")));

		return result;
	}

	@RequestMapping(value = "publishBook.json")
	public Object publishBook(HttpServletRequest request,
			@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "files", required = false) MultipartFile[] files) throws Exception {
		// 生成网页，用当前时间作为网页名
		BookInfo book = new BookInfo();

		long timestamp = System.currentTimeMillis();
		book.setBookId(timestamp);
		book.setBookName(request.getParameter("bookName"));
		book.setBookIntro(request.getParameter("bookIntro"));
		book.setAuthor(request.getParameter("author"));
		book.setPrize(Double.parseDouble(request.getParameter("prize")));
		book.setBookType(Integer.parseInt(request.getParameter("bookType")));
		// bookImage处理
		if (file != null) {
			// 图标统一放置位置
			String realPath = request.getSession().getServletContext().getRealPath("/images/bookImages");
			File path = new File(realPath);
			if (!path.exists()) {
				path.mkdirs();
			}
			String fileName = file.getOriginalFilename();
			if (fileName.toUpperCase().contains(".JPG") || fileName.toUpperCase().contains(".PNG")) {
				if (fileName.toUpperCase().contains(".JPB")) {
					fileName = timestamp + ".jpg";
				} else {
					fileName = timestamp + ".png";
				}
				File destFile = new File(realPath, fileName);
				if (!destFile.exists()) {
					destFile.mkdirs();
				}
				file.transferTo(destFile);
				String imgURL = fileName;
				book.setBookImg(imgURL);
				book.setBookURL(timestamp + ".html");
			}

		}
		if (files != null) {
			int pageSize=0;
			String dirPath = request.getSession().getServletContext().getRealPath("/books");
			dirPath+="/"+book.getBookId();
			File dir=new File(dirPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			for (MultipartFile myfile : files) {
				if (!myfile.isEmpty()) {
					pageSize++;
					File destFile=new File(dirPath,myfile.getOriginalFilename());
					myfile.transferTo(destFile);
				}else{
					System.out.println("myfile is null");
				}
			}
			book.setPageSize(pageSize);
		}else{
		}
		String htmlpath = request.getSession().getServletContext().getRealPath("/");
		TransformUtil.JspToHtmlFile(htmlpath + "book.html", htmlpath + book.getBookURL(), book);
		bookDao.addBook(book);
		return book.getBookURL().substring(0, book.getBookURL().length() - 5);
	}

	@RequestMapping(value = "getUsers.json")
	@ResponseBody
	public Object getUsers(HttpServletRequest request) {
		return bookDao.getUsers();
	}

	@RequestMapping(value = "getBuys.json")
	@ResponseBody
	public Object getBuys(HttpServletRequest request) {
		return bookDao.getBuys();
	}

	@RequestMapping(value = "getBooks.json")
	@ResponseBody
	public Object getBooks(HttpServletRequest request) {
		return bookDao.getBooks();
	}

	@RequestMapping(value = "sousuo.json")
	@ResponseBody
	public Object sousuo(HttpServletRequest request) {
		String bookName = request.getParameter("bookName");
		return bookDao.sousuo(bookName);
	}

	@RequestMapping(value = "buybook.json")
	@ResponseBody
	public Object buybook(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		String bookId = request.getParameter("bookId");
		String name = request.getParameter("name");
		Buy buy = new Buy();
		buy.setName(name);
		buy.setBookId(Long.parseLong(bookId));
		buy.setType(Integer.parseInt(request.getParameter("type")));
		bookDao.addBuy(buy);
		System.out.println(name + "  11111=============================" + bookId + "============="
				+ request.getParameter("type"));
		return result;
	}

	@RequestMapping(value = "fenlei.json")
	@ResponseBody
	public Object fenlei(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("type0", bookDao.getBooksByType(0));
		result.put("type1", bookDao.getBooksByType(1));
		result.put("type2", bookDao.getBooksByType(2));
		return result;
	}
	
	@RequestMapping(value = "abc.json")
	public String abc(HttpServletRequest request) {
		return "test2";
	}
	

}
