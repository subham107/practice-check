package com.cognizant.productDao;
import com.cognizant.productBean.*;

import java.sql.*;
import java.util.*;
public class ProductDao {

private 
 Product p;


public ProductDao(Product p)
{
	this.p=p;
}


public ProductDao() {
	// TODO Auto-generated constructor stub
}

public Product getP() {
	return p;
}

public void setP(Product p) {
	this.p = p;
}
	public boolean addProduct()
	{try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/INFINITY","root","root");
	    PreparedStatement ps=con.prepareStatement("Insert into product(prod_id,category,name,description,price,brand) value(?,?,?,?,?,?)");
	    ps.setInt(1,p.getProd_id());
	    ps.setString(2,p.getCategory());
	    ps.setString(3, p.getName() );
        ps.setString(4, p.getDesc());
        ps.setString(5, p.getPrice());
        ps.setString(6,p.getBrand());
        if(ps.executeUpdate()>0)
        	return true;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return false;
	
	
}
	
	public List<Product> getProduct()
	{List<Product> list=new ArrayList<Product>();
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/INFINITY","root","root");
    PreparedStatement ps=con.prepareStatement("select * from product");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    	Product p=new Product();
    	p.setProd_id(rs.getInt("prod_id"));
    	p.setCategory(rs.getString("category"));
    	p.setDesc(rs.getString("description"));
    	p.setName(rs.getString("name"));
    	p.setBrand(rs.getString("brand"));
    	p.setPrice(rs.getString("price"));
    	list.add(p);
    }
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
	}
}
