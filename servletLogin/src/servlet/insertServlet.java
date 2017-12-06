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

@WebServlet("/insert")
public class insertServlet extends HttpServlet {
	public Connection conn = null;         //声明Connection对象，用来连接数据库
	public PreparedStatement pstmt = null; //声明PreparedStatement对象

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		int eid = Integer.valueOf(req.getParameter("eid"));
		String name = req.getParameter("name");
		int age = Integer.valueOf(req.getParameter("age"));
		String birth = req.getParameter("birth");
		int did = Integer.valueOf(req.getParameter("did"));
		 try{
			  //连接到数据库
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("创建驱动成功！");
			  //连接数据库
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weibo","root","123456");
			  System.out.println("连接数据库成功！");
			  pstmt = conn.prepareStatement("insert into employee (eid,name,age,birth,did) values(?,?,?,?,?)");
			  pstmt.setInt(1,eid );
			  pstmt.setString(2, name);
			  pstmt.setInt(3, age);
			  pstmt.setString(4, birth);
			  pstmt.setInt(5, did);
			  int result = pstmt.executeUpdate();
			  if(result != 0)
			  {
				  resp.sendRedirect("insert");
			  } else {
				  req.setAttribute("msg", "插入失败");
				  req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
			  }	
		     
			  
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 finally {
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
