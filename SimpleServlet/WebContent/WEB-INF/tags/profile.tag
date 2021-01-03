<%@ tag body-content="empty" %>
<%@ attribute name="user" required="true" type="com.sanushi.javaweb.basics.User"%>

<table>
	<tr> <th>Name</th><th>Email</th> </tr>
	<tr> <td>${user.name}</td><td>${user.email} }</td> </tr>	
</table>