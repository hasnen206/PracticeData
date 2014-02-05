package dao;

import java.util.ArrayList;

import pojo.MyNews;

public interface NewsDAO {

	public ArrayList<String> getNews(String newsType);
	public ArrayList<MyNews> getNewsList();
	public int addNews(MyNews news);
	public int updateNews(int newsId,String updateNews);
	public void deleteNews(int newsId);
}
