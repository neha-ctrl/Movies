package com.dao;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.Movies;
import com.model.Movies;


public class MoviesDao {

	public int insertMovies(Movies m){
		int check=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			String sql="insert into Movies(name,actor,actress,yearofrelease,director)values('"+m.getname() + "','"+m.getactor() +"','"+m.getActress()+"','"+m.getyearofrelease()+"','"+m.getDirector()+"')";
			Statement st= con.createStatement();
			check = st.executeUpdate(sql);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return check;	
	}
	
	
	
	
	
	public List<Movies> displayAll() throws ClassNotFoundException,SQLException
	{
		List<Movies> list=new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		String sql="Select * from Movies";
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next())
		{
			Movies m=new Movies();
			m=new Movies();
			m.setname(rs.getString(1));
			m.setactor(rs.getString(2));
			m.setActress(rs.getString(3));
			m.setDirector(rs.getString(4));
			m.setyearofrelease(rs.getInt(5));
			
			list.add(m);
		}
		return list;
	}
	
	
	
	

	public Movies displayByACTName(String actor)throws ClassNotFoundException , SQLException
	{
		Movies m=null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		String sql="Select * from Movies where actor="+actor;
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next());
		{
			m=new Movies();
			m.setname(rs.getString(1));
			m.setactor(rs.getString(2));
			m.setActress(rs.getString(3));
			m.setDirector(rs.getString(4));
			m.setyearofrelease(rs.getInt(5));


		}
		return m;
	
}
	
}



	
	
	
	
	
	
	
	
	
	

	

	

		

	
