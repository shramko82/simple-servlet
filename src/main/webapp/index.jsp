<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

  <title></title>
</head>
<body>
<h1> Comment list </h1>


          <div class="col-lg-6">
            <form action = "#"  method="put">
              <div class="input-group">
                <input type="text" class="form-control" name="newComment" placeholder="Add comment">
                <span class="input-group-btn">
                  <button class="btn btn-default" type="submit">Add</button>
                </span>
              </div>
            </form>
            <form action = "#" method="get">
               <button class="btn btn-default" type="submit">Show all</button>
            </form>
              <div class="list-group">
                <ul>
                   <c:forEach var="c" items="${comments}">
                      <li>
                        <c:out value="${c.text}"/>
                      </li>
                   </c:forEach>
                </ul>
              </div>
          </div>



</body>
</html>
