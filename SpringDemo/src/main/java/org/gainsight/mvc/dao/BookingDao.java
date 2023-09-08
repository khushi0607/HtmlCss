package org.gainsight.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.gainsight.mvc.entity.Bookings;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDao {
	
	private static String url="jdbc:mysql://localhost:3306/gainsight";
	public boolean addBookingDetails(String bookingId,String flightId,String passengerId,String travelDate)
	{
		
	int count=0;
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","@Khushi00");
			pst=con.prepareStatement("insert into bookings values(?,?,?,?)");
			pst.setString(1, bookingId);
			pst.setString(2, flightId);
			pst.setString(3, passengerId);
			pst.setString(4, travelDate);
			count=pst.executeUpdate();
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count==1;
	}
	
	public Bookings display(String bookingId)
	{
		Bookings booking=null;
	
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","@Khushi00");
			pst=con.prepareStatement("select * from bookings where booking_id=?");
			pst.setString(1, bookingId);
			rs=pst.executeQuery();
			if(rs.next())
			{
				booking=new Bookings(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return booking;
	}
	
}









