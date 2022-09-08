<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="WEB-INF/CtLogoutAction.tld" prefix="cl" %>
     <%@ include file="welcome.jsp" %>
     
     <h1><cl:reSetFlag stuname="<%=request.getParameter(\"stuname\")%>"
stupass="<%=request.getParameter(\"stupass\")%>"/></h1>
