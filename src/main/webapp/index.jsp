<%@ page contentType="text/html;charset=UTF-8" language="java" import="ua.shramko.simpleservlet.model.Comment"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

  <title></title>
</head>
<body>
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
              <c:out value="${comment}"/>
          </div>



</body>
</html>
