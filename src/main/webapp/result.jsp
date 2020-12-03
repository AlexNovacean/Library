<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available books
</h1>

<%
    List<String> carti = (List<String>) request.getAttribute("books");
    Iterator<String> it = carti.iterator();

    out.println("<br> We have the following books: <br><br>");

    while(it.hasNext()){
        out.println(it.next() + "<br>");
    }
%>
</center>

</body>
</html>