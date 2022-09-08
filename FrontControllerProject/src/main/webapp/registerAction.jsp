<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="WEB-INF/CtRegisterAction.tld" prefix="cl" %>
    <%@ include file="register.jsp" %>
    
<cl:register stuname="<%=request.getParameter(\"stuname\")%>"
stuid="<%=request.getParameter(\"stuid\")%>"
stupass="<%=request.getParameter(\"stupass\")%>" 
stuclass="<%=request.getParameter(\"stuclass\")%>"/>