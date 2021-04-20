<%-- 
    Document   : pr4_1
    Created on : Apr 12, 2021, 4:47:08 AM
    Author     : OWNER
--%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Multification</title>
    </head>
    <body>
        
        
    <% int n=3;
       int i;
       for(i=1;i<=10;i++)
       { %>
          <%= n + "*" + i + " = " + i*n %>
          
          <br>
<br>          
     <%        out.println();
     }
      
    %>
    </body>
    </html>