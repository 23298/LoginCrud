package Com.Ism.LoginController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Com.Ism.Logindao.LoginDao;
import Com.Ism.loginVO.LoginVo;




public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String pwd = request.getParameter("pwd");
		
		LoginVo vo=new LoginVo();
		
		vo.setfName(fn);
		vo.setlName(ln);
		vo.setPwd(pwd);
		
	      LoginDao dao=new LoginDao();
	  	boolean result =false;	
		HttpSession httpSession=request.getSession(); 
	  boolean flag = false;
	
		if(fn !=null && fn.length()>0)
		{
		  request.setAttribute("abc", fn);
		  vo.setfName(fn);
	
		}
		else
		{
			flag= true;
			String error="ENTER A FIELD";
			httpSession.setAttribute("error","FIELD A FIRST NAME" );
				
		}
		if(fn !=null && fn.length()>0)
		{
		  request.setAttribute("aaa", ln);
		  vo.setlName(ln);
		
		}
		else
		{
			flag= true;
			String error="ENTER A FIELD";
			httpSession.setAttribute("error1","FIELD A LAST NAME" );
				
		}
	
		if(fn !=null && fn.length()>0)
		{
		  request.setAttribute("ppp",pwd);
		  vo.setPwd(pwd);
		
		}
		else
		{
			flag= true;
			String error="ENTER A FIELD";
			httpSession.setAttribute("error2","FIELD A PASSWORD" );
				
		}
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
