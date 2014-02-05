package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.Statement;

import connection.ConnectionFactory;

import pojo.MyNews;

public class NewsDAOImpl implements NewsDAO {

	@Override
	public ArrayList<String> getNews(String newsType) {
		ArrayList<String> newsList = new ArrayList<>();
		try {

			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.getConnectionType4();

			String query = "SELECT * FROM NEWSDETAILS WHERE NEWS_TYPE=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setString(1, newsType);
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				newsList.add(resultset.getString("NEW_CONTENT"));
				/*
				 * newsList.add((resultset.getInt("NEWSID"),
				 * resultset.getString(
				 * "NEWSCONTENT"),resultset.getString("NEWSTYPE")));
				 */
			}
			resultset.close();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsList;
	}

	@Override
	public ArrayList<MyNews> getNewsList() {
		ConnectionFactory factory = new ConnectionFactory();
		ArrayList<MyNews> newsList = new ArrayList<>();

		try {

			Connection connection = factory.getConnectionType4();
			java.sql.Statement statement = connection.createStatement();
			String query = "SELECT * FROM NEWSDETAILS";

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				newsList.add(new MyNews(resultSet.getInt("NEWS_ID"), resultSet
						.getString("NEW_CONTENT"), resultSet
						.getString("NEWS_TYPE")));
			}
			resultSet.close();
			statement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return newsList;
	}

	@Override
	public int addNews(MyNews news) {
		int count = getNewID() + 1;
		int row = 0;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.getConnectionType4();
			String query = "INSERT INTO NEWSDETAILS VALUES(?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, count);
			preparedStatement.setString(2, news.getNewscontent());
			preparedStatement.setString(3, news.getNewstype());
			row = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int updateNews(int newsId, String updateNews) {
		int row = 0;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.getConnectionType4();
			PreparedStatement preparedStatement = connection
					.prepareStatement("UPDATE NEWSDETAILS SET NEW_CONTENT=? WHERE NEWS_ID=?");
			preparedStatement.setString(1, updateNews);
			preparedStatement.setInt(2, newsId);
			row = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public void deleteNews(int newsId) {
		try {
			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.getConnectionType4();
			PreparedStatement preparedStatement = connection
					.prepareStatement("DELETE FROM NEWSDETAILS WHERE NEWS_ID=?");
			preparedStatement.setInt(1, newsId);
			preparedStatement.executeUpdate();
			connection.close();
			preparedStatement.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int getNewID() {
		int newID = 0;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.getConnectionType4();
			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT MAX(NEWS_ID) FROM NEWSDETAILS");
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				newID = resultSet.getInt(1);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newID;
	}

	public static void main(String[] args) {
		System.out.println(new NewsDAOImpl().addNews(new MyNews(123, "onkar", "SPORTS")));
	}
}
