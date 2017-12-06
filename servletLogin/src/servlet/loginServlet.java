package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	
	public Connection conn = null;         //声明Connection对象，用来连接数据库
	public PreparedStatement pstmt = null; //声明PreparedStatement对象
	ResultSet rs = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		// TODO Auto-generated method stub
		try{
			 //连接到数据库
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("创建驱动成功！");
			  //连接数据库
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weibo","root","123456");
			  System.out.println("连接数据库成功！");
			  pstmt = conn.prepareStatement("select * from account");
			  rs = pstmt.executeQuery();
		      
			  while( rs.next() ){
				  if (email.equals(rs.getString(2)) && password.equals(rs.getString(4))) {
						HttpSession session = req.getSession();
						session.setAttribute("account", email);
						session.setAttribute("password", password);
						resp.sendRedirect("welcome");
				  } else {
						req.setAttribute("msg", "用户名或密码错误");
						req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
				  }
			  }
			 
			  
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();	
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	
	}

}
