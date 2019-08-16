package Com.Ism.Logindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Com.Ism.Loginutill.LoginUtill;
import Com.Ism.loginVO.LoginVo;
import sun.security.pkcs11.Secmod.DbMode;


public class LoginDao
{

	static Connection con = null;
	public boolean insert(LoginVo vo)
	{
		boolean flag = false;
		con = LoginUtill.getConnObj();
		String insertQ = "INSERT INTO bhautik2 VALUES(?,?,?)";
		PreparedStatement ps = null;
		int rowsEffect = 0;
		if(con != null)
		{
			try
			{
				ps = con.prepareStatement(insertQ);
				ps.setString(1, vo.getfName());
				ps.setString(2, vo.getlName());
				ps.setString(3, vo.getPwd());
				rowsEffect = ps.executeUpdate();
				if (rowsEffect > 0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			} 	
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("DB Connected:- "+con);
		}
		return flag;
	}
	
	public boolean update(int id)
	{
		
		boolean flag = false;
		con = LoginUtill.getConnObj();
		String updateQ = "UPDATE Demo2 SET NAME = ? WHERE ID = ?";
		PreparedStatement ps = null;
		int rowsEffect = 0;
		if(con != null)
		{
			try
			{
				ps = con.prepareStatement(updateQ);
				ps.setString(1, "Shiv");
				ps.setInt(2, id);
				rowsEffect = ps.executeUpdate();
				if (rowsEffect > 0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("DB Connected:- "+con);
		}
		return flag;
	}
	
	public boolean delete(int id)
	{
		boolean flag = false;
		con = LoginUtill.getConnObj();
		String deleteQ = "DELETE FROM bhautik2 WHERE ID= ?";
		PreparedStatement ps = null;
		int rowsEffect = 0;
		if(con != null)
		{
			try
			{
				ps = con.prepareStatement(deleteQ);
				ps.setInt(1,id );
				rowsEffect = ps.executeUpdate();
				if (rowsEffect > 0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("DB Connected:- "+con);
		}
		return flag;
	}
	public static LoginVo getEmployeeById(int uid)
	{

		LoginVo lv=new LoginVo();

try
{
	con = LoginUtill.getConnObj();
	PreparedStatement ps=con.prepareStatement("SELECT * FROM WHERE ID=?");
	ps.setInt(1, uid);
	ResultSet rs=ps.executeQuery();
	
	if(rs.next())
	{
		lv.setId(rs.getInt(1));
		lv.setfName(rs.getString(2));
		lv.setfName(rs.getString(3));
		lv.setPwd(rs.getString(4));
		
	}
}
catch(Exception e)
{
	e.printStackTrace();
}
		return lv;
	}
	public ArrayList<LoginVo> getAllRecords()
	{
		String selectQ = "SELECT * FROM bhautik2";
		con = LoginUtill.getConnObj();
		ResultSet rs = null;
		ArrayList<LoginVo> list = new ArrayList<LoginVo>();
		PreparedStatement pstmt = null;
		LoginVo l = null;
		if (con !=null) 
		{
		
			try 
			{
				pstmt = con.prepareStatement(selectQ);
				rs = pstmt.executeQuery();
				while (rs.next()) 
				{
					LoginVo loginVo=new LoginVo();
					loginVo.setId(rs.getInt(1));
					loginVo.setfName(rs.getString(2));
					loginVo.setlName(rs.getString(3));
					loginVo.setPwd(rs.getString(4));
					list.add(loginVo);
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return list;
	}
}