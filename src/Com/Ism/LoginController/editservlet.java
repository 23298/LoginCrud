package Com.Ism.LoginController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Ism.Logindao.LoginDao;
import Com.Ism.loginVO.LoginVo;

/**
 * Servlet implementation class editservlet
 */
public class editservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	 PrintWriter out=response.getWriter();
    	 int id=Integer.parseInt(request.getParameter("id"));
    	 String fn=request.getParameter("fn");
    	 String ln=request.getParameter("ln");
    	 String pw=request.getParameter("pwd");
    	 
    	 LoginVo loginVo= new LoginVo();
    	
    	 //loginVo.setId(id);
    	 loginVo.setfName(fn);
    	 loginVo.setfName(ln);
    	 loginVo.setfName(pw);
    	 
    	 LoginDao dao=new  LoginDao();
    	 boolean result=dao.update(id);
    	 
    	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
