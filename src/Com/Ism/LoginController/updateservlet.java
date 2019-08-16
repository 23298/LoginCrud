package Com.Ism.LoginController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.Ism.Logindao.LoginDao;
import Com.Ism.loginVO.LoginVo;

/**
 * Servlet implementation class updateservlet
 */
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		PrintWriter out=response.getWriter();
		String id=request.getParameter("uid");
		
		int ide=Integer.parseInt(id);
		
		LoginVo lv=LoginDao.getEmployeeById(ide);
		out.print("<form action='editservlet' method='get'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden'name='id' value='"+lv.getId()+"'></td></tr>");
		out.print("<tr><td></td><td><input type='text' name='fn' value='"+lv.getfName()+"'></td></tr>");
		out.print("<tr><td></td><td><input type='text' name='ln' value='"+lv.getlName()+"'></td></tr>");
		out.print("<tr><td></td><td><input type='text' name='pwd' value='"+lv.getPwd()+"'></td></tr>");
	       out.print("</td></tr");
	       out.print("<input type'submit' value='edit'/></td></tr>");
	       out.print("</table>");
	       out.print("/form");
	       
	   
	
	}
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
