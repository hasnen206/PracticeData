package test;

import java.util.ArrayList;

import dao.NewsDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import pojo.MyNews;
import pojo.MyUser;

public class Tester {

	public static void main(String[] args) {

		UserDAOImpl impl = new UserDAOImpl();
		String type = impl.getUserType("HASNEN", "DAWOOD");
		//System.out.println(type);
		NewsDAOImpl newsimpl = new NewsDAOImpl();

	//	for (MyNews news : newsimpl.getNewsList()) {
			//System.out.println(news.getNewscontent());
	//	}
		//for (String news : newsimpl.getNews("SPORTS")) {
		//	System.out.println(news);
		//}

		// MyNews news=new MyNews(4,"LONG TRAVELLING ALLOWED","OTHERS");
		// newsimpl.addNews(news);
		
		//newsimpl.updateNews(1,"INDIA LOST");
		//newsimpl.deleteNews(0);
		
	}

}