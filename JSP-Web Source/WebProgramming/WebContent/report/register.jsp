<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	request.setCharacterEncoding("UTF-8");

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://127.0.0.1/jsp_db";
	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, "root", "root");
		
		String qry = "insert into phone values (?, ?, ?)";
		
		pstmt = conn.prepareStatement(qry);
		pstmt.setString(1, request.getParameter("com"));
		pstmt.setString(2, request.getParameter("pdname"));
		pstmt.setString(3, request.getParameter("pc"));
		
		if(request.getParameter("pdname") != null 
				|| request.getParameter("pc") != null) {
			pstmt.executeUpdate();
		}
		
	} catch(Exception e) {
		out.println(e);
	}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력한 휴대폰의 정보</title>
</head>
<body>
	<h3>등록 목록</h3> <br>

	<%
		try {
			String qry="select * from phone";
			pstmt = conn.prepareStatement(qry);
			
			ResultSet rs = pstmt.executeQuery();
			
			out.print("<table>");
			out.print("	<tr>");
			out.print("		<th>회사</th>");
			out.print("		<th>제품 이름</th>");
			out.print("		<th>가격</th>");
			out.print("	</tr>");
			
			while(rs.next()) {
				out.print("	<tr>");
				out.print("		<td>" + rs.getString("company") + "</td>");
				out.print("		<td>" + rs.getString("product") + "</td>");
				out.print("		<td>" + rs.getString("price") + "</td>");
				out.print("	</tr>");
			}
			
			out.print("</table>");
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch(Exception e) {
			out.println(e);
		}
	%>
</body>
</html>