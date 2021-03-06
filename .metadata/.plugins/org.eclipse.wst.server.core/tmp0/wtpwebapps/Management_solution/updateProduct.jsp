<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin page</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
    <link rel="stylesheet" href="./css/updateProduct.css">
</head>
<body>
	<%
	  if(session.getAttribute("id")==null){
		  %>
		    <script type="text/javascript">
		      if(!(alert("로그인을 먼저 해주세요!"))){
		         document.location = 'signIn.html';
		      }
		    </script>
		  <%
	  }
	%>
    <div class="container">
        <header>
            <div class="product-logo">
                <a href="inde
                x.html"><img class="logo-S" src="./img/logo.png" alt="logo"></a>
            </div>
            <h1 class="product-h1">update product.</h1>
            <div  class="member-wrap">
                <div>
                    <div>
                        <span class="input-label">STORE</span>
                        <span class="manager-info"><%= session.getAttribute("address") %></span>
                    </div>
                    <div>
                        <span class="input-label">MANAGER</span>
                        <span class="manager-info"><%= session.getAttribute("name") %></span>
                    </div>
                </div>
                <a href="logOut.jsp">
                    <button class="logout-button">LOGOUT</button>
                </a>
            </div>
        </header>
        <article>
            <form action="updateProductJsp.jsp" method="post" autocomplete="off">
                <div>
                    <div><span class="input-label">product name</span></div>
                    <input name="productName" type="text" placeholder="product name">
                </div>
                <div>
                    <div><span class="input-label">price</span></div>
                    <input name="productPrice" type="text" placeholder="price">
                </div>
                <div>
                    <div><span class="input-label">stock</span></div>
                    <input name="stockCount" type="text" placeholder="stock">
                </div>
                <a href="./productList.html">
                    <button type="submit" class="edit-button">update</button>
                </a>
                <div>
                    <div><span class="label">go to</span><a href="./productList.jsp">product list.</a></div>
                </div>
            </form>
        </article>
        <footer>
            <span>Copyright 2019 . Narciss . All rights reserved</span>
        </footer>
    </div>

</body>
</html>