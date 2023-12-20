<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Display</title>
</head>
<body>
<h2>Reservation Details</h2>
Passenger Name:${reservation.getPassenger().firstName }</br>
Passenger Email:${reservation.getPassenger().email }</br>
Passenger Phone:${reservation.getPassenger().phone }</br>
Operating Airlines:${reservation.getFlight().operatingAirlines }</br>
Arrival City:${reservation.getFlight().arrivalCity }</br>
Departure City:${reservation.getFlight().departureCity }</br>
Flight Number:${reservation.getFlight().flightNumber }</br>
Date Of Departure:${reservation.getFlight().dateOfDeparture }</br>
<h2>Update no of Bags & Status</h2>
<form action="proceedToCheckIn" method="post">
<pre>
Reservation Id<input type="text" name="id" value="${reservation.id }"readOnly/>
Number of Bags:<input type="text" name="numberOfBags"/>

<input type="submit" value="confirm"/>
</pre>
</form>

</body>
</html>