package neha_1.neha_1;

import java.sql.SQLException;
import com.dao.MoviesDao;
import com.model.Movies;
public class App 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
	    //to insert a data in movies table
     	MoviesDao sd=new MoviesDao();
        Movies m=new Movies();
        m.setname("URI");
        m.setactor("kaushal");
        m.setActress("Alia");
        m.setDirector("abc");
        m.setyearofrelease(2019);
        if(sd.insertMovies(m)>0)
        {
        	System.out.print("record inserted.... successfully");
        }
    
      
  
   
	    //to display all rows from movies
             try {
		sd.displayAll().forEach(m->{System.out.println(m);});
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
	    
	    //to display by actor name
	 Movies m = sd.displayByACTName("Salman");
	 System.out.println(m);
}
