<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>Bootstrap Example</title>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type = "image/x-icon" href = "img/vendor/favicon.ico">
  	<link href="style/bootstrap.min.css" rel="stylesheet">
  	<link href="style/style.css" rel="stylesheet">
  	
  	<script src="scripts/bootstrap.bundle.min.js"></script>
	<script src="scripts/jquery.min.js"></script>
	<script src="scripts/styling.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#frmLogin").on("submit", function(event){
				event.preventDefault();
				var url = "respondedor.jsp";
				var dataForm = $("#frmLogin").serialize();
				alert(dataForm);
				
				$.post( url, dataForm, function(data, status) {
						alert( "email:"+ data.email + "  \n senha:  " + data.senha);
				}, "json");
				$("#test").html(data.email); 
			});
		});
	</script>
</head>
<body>
<div class="container mt-3">
  <h2>Login</h2>
  <form id="frmLogin">
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="mb-3">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Enviar</button>
  </form>
  <div id = "test"></div>
</div>
</body>
</html>
