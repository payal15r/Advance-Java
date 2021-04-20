<%-- 
    Document   : pr4_2
    Created on : Apr 12, 2021, 5:19:18 AM
    Author     : OWNER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%!
            String str = "wel-come";
        %>

        <%!
            public String MyFun(String str){
                return str;
            }
        %>
        <html>
            
            <body>
                <h1>
                <%= "MSG = " + str  %>
                </h1>
            </body>
        </html>