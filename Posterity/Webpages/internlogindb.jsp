<%@page import="dao.InternDao" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    InternDao ad = new InternDao();
    int i = ad.internLogin(email,password);
    if(i>0)
    {
        session.setAttribute("email", email);
%>
<script>alert("Intern Login Successfull")</script>
<jsp:include page="internhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Ooops..  Error occured...Try again")</script>
<jsp:include page="internlogin.jsp"></jsp:include>
<%}%>