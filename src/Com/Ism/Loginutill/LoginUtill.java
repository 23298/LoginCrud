package Com.Ism.Loginutill;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class LoginUtill
{
	static Connection con = null;
	private LoginUtill()
	{
		
	}
	
	public static Connection getConnObj()
	{
		if (con == null)
		{
			con = LoginUtill.getConn();
		}
		return con;
	}
	
	private static Connection getConn()
	{
		
		FileInputStream f = null;
		Properties p = new Properties();
		
		try
		{
			f = new FileInputStream("D:\\eclipss\\LoginCrud\\WebContent\\WEB-INF\\dbconfig.properties");
			p.load(f);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		String url = p.getProperty("URLNAME").trim();
		String driver = p.getProperty("DRIVERCLASS").trim();
		String uName = p.getProperty("USERNAME").trim();
		String pwd = p.getProperty("PASSWORD").trim();
		
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, uName, pwd);
			if (con != null)
			{
				System.out.println(con);
			}
			else
			{
				System.out.println(con);
			}
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}