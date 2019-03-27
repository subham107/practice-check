

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.cognizant.productBean.*;
import com.cognizant.productDao.ProductDao;
/**
 * Servlet implementation class Myservlet1
 */
@WebServlet("/Myservlet1")
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void disp()
    {   
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("pname");
		int pid=Integer.parseInt(request.getParameter("pid"));
		String category=request.getParameter("cat");
		String desc=request.getParameter("desc");
		String brand=request.getParameter("brand");
		String price=request.getParameter("price");
		Product p=new Product(pid,category,name,desc,
		price,brand);
		
		ProductDao pd=new ProductDao(p);
		if(pd.addProduct()) 
		{
			out.println("Succesfully added");
			response.sendRedirect("view.jsp");
		}
			
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
