<%@ tag body-content="scriptless" language="java" pageEncoding="UTF-8" description="item 출력태그"%>

<%@ attribute name="bgcolor"%>
<%@ attribute name="border"%>

<jsp:useBean id="product" class="odg.ch10.Product"></jsp:useBean>

<h2><jsp:doBody/></h2>
<table border="${border}" bgcolor="${bgcolor}" width="150">
<%
	for(String item: product.getProductList()) {
		out.println("<tr><td>" + item + "</td></tr>");
	}
%>
</table>