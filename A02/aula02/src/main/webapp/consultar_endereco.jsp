<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Aula 02</title>

	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/jquery.min.js"></script>
	
	<script type = "text/javascript">
		
		$(document).ready(function(){
			
			$("#txtCep").blur(function(){
				
				var url = "https://viacep.com.br/ws/" + $("#txtCep").val() + "/json/"; 
				
				$.get( url, function( response ){
				//alert( response.cep);
					console.log(response.complemento);
					$("#txtCep").val(response.cep);
					$("#txtLogradouro").val(response.logradouro);
					$("#txtComplemento").val(response.complemento);
					if(response.complemento == ""){
						$("#txtComplemento").val("(Sem complemento)");						
					}
					$("#txtBairro").val(response.bairro);
					$("#txtCidade").val(response.localidade);
					$("#txtUf").val(response.uf);
					
				}, "json");
				
			});
			
		});
	
	</script>
</head>
<body>


	<div class = "container-fluid bg-warning py-2 text-center text-white shadow">
		
		<h1>Aula 02</h1>
		<p>sla</p>
		
	</div>
	
	<div class = "container w-75 pt-5">
	
		<form id="frmEndereco">
		
			<div class = "my-3">
		      <label for = "txtCep" class = "form-label"> Cep </label> 
		      <input class = "form-control shadow-sm" type = "text" name = "txtCep" id = "txtCep"> <br>
			</div>
			
			<div class = "my-3">
		      <label for = "txtLogradouro" class = "form-label"> Logradouro </label> 
		      <input class = "form-control shadow-sm" type = "text" name = "txtLogradouro" id = "txtLogradouro"> <br>
			</div>
	      
				<div class = "my-3">
				<label for = "txtComplemento" class = "form-label"> Complemento </label> 
				<input  class = "form-control shadow-sm" type = "text" name = "txtComplemento" id = "txtComplemento"> <br>
				</div>
				
	      	<div class = "my-3">
		      <label for = "txtBairro" class = "form-label"> Bairro </label> 
		      <input  class = "form-control shadow-sm" type = "text" name = "txtBairro" id = "txtBairro"> <br>
			</div>
	      
			<div class = "my-3">
		      <label for = "txtCidade" class = "form-label"> Cidade </label> 
		      <input  class = "form-control shadow-sm" type = "text" name = "txtCidade" id = "txtCidade"> <br>
			</div>
	      
			<div class = "my-3">
		      <label for = "txtUf" class = "form-label"> UF </label> 
		      <input  class = "form-control shadow-sm" type = "text" name = "txtUf" id = "txtUf"> <br>
			</div>
			
		</form>
		
	</div>	

	<div class = "container-fluid bg-warning py-3 text-center text-white shadow">
		
		<p>footer</p>
		
	</div>


</body>
</html>