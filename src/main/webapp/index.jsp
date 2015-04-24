<html>
<head>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

  <title></title>
</head>
<body>
          <div class="col-lg-6">
            <form action = "/servlet/add"  method="post">
              <div class="input-group">
                <input type="text" class="form-control" name="newComment" placeholder="Add comment">
                <span class="input-group-btn">
                  <button class="btn btn-default" type="submit">Add</button>
                </span>
              </div>
            </form>
            <fmt:setLocale value="en_US" />
            <div class="list-group">
              <ul>
                <c:forEach var="c" items="${comments}">

                  <form action = "/servlet/delete" method="post">
                    <li>(<fmt:formatDate type="both"
                      dateStyle="medium" timeStyle="short"
                      value="${c.dateOfCreation}"/>) <c:out value="${c.text}"/>
                        <input type="hidden" name="commentId" value="<c:out value="${c.id}"/>">
                        <button class="btn btn-default" type="submit">X</button>
                    </li>
                   </form>

                </c:forEach>
              </ul>
            </div>
          </div>
        </div>


</body>
</html>
