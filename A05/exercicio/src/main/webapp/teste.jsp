<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="classes.models.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	Usuario users = new Usuario();

    ArrayList<Usuario>  listUsers = users.listUsuarios();
    
    for ( int  i=0; i < listUsers.size(); i++ ){
    	out.print(listUsers.get(i).toString());
    	out.print("<hr>");
    }

%>
</body>
</html>