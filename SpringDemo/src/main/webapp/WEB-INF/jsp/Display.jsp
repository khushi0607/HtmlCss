<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
   <%@ taglib   prefix="c"     uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<table>
  <tr>
         <th>FlightId</th>
         <th>Source</th>
         <th>Destination</th>
         <th>Fare</th>
         <th>Seats</th>
     </tr>
     <c:forEach var="flg1"   items="${flg}">
         <tr>
           <td>${flg1.flight_id}</td>
           <td>${flg1.source}</td>
           <td>${flg1.destination}</td>
           <td>${flg1.fare}</td>
           <td>${flg1.seats_available}</td>
         </tr>
     </c:forEach>
   </table>
   <br>
   <br>
   
   
<form action="booking">
 <table bgcolor=lightblue width=50%>
  <tr>
  <th>Booking Id</th>
  <td><input type=text name="bookingId"></td>
  </tr>
   <tr>
  <th>FlightID</th>
  <td><input type=text name="flightId"></td>
  </tr>
  <tr>
  <th>PassengerId</th>
  <td><input type=text name="passengerId"></td>
  </tr>
  <tr>
  <th>First Name</th>
  <td><input type=text name="firstName"></td>
  </tr>
   <tr>
  <th>Last Name</th>
  <td><input type=text name="lastName"></td>
  </tr>
   <tr>
  <th>Mobile</th>
  <td><input type=number name="mobile"></td>
  </tr>
   <tr>
  <th>Email</th>
  <td><input type=text name="email"></td>
  </tr>
   <tr>
  <th>Travel Date</th>
  <td><input type=text name="travelDate"></td>
  </tr>
    <tr>
  <td><input type=submit value=Submit> </td>
    <td><input type=reset value=Cancel> </td>
  </tr>
  </table>
</form>
</body>
</html>







