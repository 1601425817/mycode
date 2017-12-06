package servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/delete")
public class deleteServlet extends HttpServlet {
	
	public Connection conn = null;         //声明Connection对象，用来连接数据库
	public PreparedStatement pstmt = null; //声明PreparedStatement对象
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/WEB-INF/views/delete.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String birth = req.getParameter("birth");
		// TODO Auto-generated method stub
		try{
			 //连接到数据库
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("创建驱动成功！");
			  //连接数据库
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weibo","root","123456");
			  System.out.println("连接数据库成功！");
			  String strSql="delete  from employee where birth=?";
			  pstmt=conn.prepareStatement(strSql);
			  pstmt.setString(1,birth);
			  int result = pstmt.executeUpdate();
			  if(result != 0)
			  {
				  resp.sendRedirect("welcome");
			  } else {
				  req.setAttribute("msg", "未找到待删除的用户");
				  req.getRequestDispatcher("/WEB-INF/views/delete.jsp").forward(req, resp);
			  }
  
		}catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	
	}

}
