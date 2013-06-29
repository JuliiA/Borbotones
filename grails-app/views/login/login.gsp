<!doctype html>
<html>
	<head>
		<meta name="layout" content="main2"/>
		<title>Welcome to Grails</title>
		
	</head>
	<body>
	
	<h2>Entra a nuestro sitio!</h2>
					<div class="col_370 float_l">							
						<h3>Logearse
						  	<g:if test="${flash.message}">
					  			<div>
									${flash.message}
								</div>
						 	</g:if>
							<g:form action="authenticate" controller="Login">	  		
								<g:textField name="username" placeholder="usuario"/>
							  	<g:passwordField name="password" placeholder="password"/>
								</br>
							  	<g:submitButton name="Ingresar"/>	  	
							</g:form>
						</h3>
						<h3>Registrarse									
							<g:form action="crearUsuario" controller="Login">  		
						  		<g:textField name="username" placeholder="usuario"/>
						  		<g:passwordField name="password" placeholder="password"/>
						  		<g:submitButton name="Crear Usuario"/>
						 	</g:form>
						</h3>
					</div>
	

	</body>	
</html>
