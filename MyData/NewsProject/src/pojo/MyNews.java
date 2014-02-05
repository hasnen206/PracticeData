package pojo;

public class MyNews {
private int newsid;
private String newscontent;
private String newstype;
public MyNews(){
	
}
public MyNews(int newsid, String newscontent, String newstype) {
	super();
	this.newsid = newsid;
	this.newscontent = newscontent;
	this.newstype = newstype;
}
public int getNewsid() {
	return newsid;
}
public void setNewsid(int newsid) {
	this.newsid = newsid;
}
public String getNewscontent() {
	return newscontent;
}
public void setNewscontent(String newscontent) {
	this.newscontent = newscontent;
}
public String getNewstype() {
	return newstype;
}
public void setNewstype(String newstype) {
	this.newstype = newstype;
}
@Override
public String toString() {
	return "MyNews [newsid=" + newsid + ", newscontent=" + newscontent
			+ ", newstype=" + newstype + "]";
}


}
