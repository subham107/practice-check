<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="str"  value="Hello" scope="session"></c:set> 
<c:out value="${str }"></c:out>

<c:redirect></c:redirect>