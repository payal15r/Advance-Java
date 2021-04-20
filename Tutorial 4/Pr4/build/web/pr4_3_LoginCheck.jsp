<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
       
        if((username.equals("dhruvisha") && password.equals("vara")))
            {
            session.setAttribute("username",username);
            response.sendRedirect("Home.jsp");
            }
        else
            response.sendRedirect("Error.jsp");
        %>
    </body>
</html>


