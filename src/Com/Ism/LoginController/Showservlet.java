package Com.Ism.LoginController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Com.Ism.Logindao.LoginDao;
import Com.Ism.loginVO.LoginVo;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class Showservlet
 */
public class Showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Object loginVo = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
  
		
		LoginDao dao=new LoginDao();
	
		LoginVo loginVo=new LoginVo();
		
       ArrayList<LoginVo> list=dao.getAllRecords();
       HttpSession httpSession=request.getSession();
     
       
       out.print("<table border='1' width='50%'>");
       out.print("<tr><th>Id</th><th>Firstname</th><th>Lastname</th><th>Password</th><th>UPDATE</th><th>DELETE</th></tr>");
       for (LoginVo l :list)
       {
       out.println("<tr><td>"+l.getId()+"</td><td>"+l.getfName()+"</td><td>"+l.getfName()+"</td><td>"+l.getPwd()+"</td><th><a href=edit.jsp?id="+l.getId()+">EDIT</a></th><th><a href=deleteservlet?id="+l.getId()+" >DELETE</th></tr>");
       }
       
       
       
   httpSession.setAttribute("list", list);
   
    	
	}
    
     

     

    
    //response.sendRedirect("table.jsp");
    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
