import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDBConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8.x
			System.out.println("Driver loaded successfully!");
				// Maven only; No manual download of jar file
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
