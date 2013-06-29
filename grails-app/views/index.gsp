
<!doctype html>
<html>
	<head>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'templatemo_style.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'coda-slider.css')}" type="text/css">	
	</head>
	
	<body>
	<div id="slider">
		<div id="templatemo_header_wrapper">
			<div id="templatemo_header">
				<h1>Borbotones</h1>				
			</div>
		</div>

		<div id="templatemo_main">
			<div id="templatemo_content">
				<div class="panel" id="home">
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
					<div class="col_220 float_r">
						<g:link action="crearListaDeCanciones" controller="canciones">Crear Lista</g:link>
						<g:link action="index" controller="Login">Ver lista de reproduccion creada</g:link>
					</div>
				</div>
			</div>
			<div id="templatemo_footer_wrapper">
				<div id="templatemo_footer">
					Pie de pagina
					<div class="cleaner">
					</div>
				</div>
			</div>
		</div>
	</div>
	</Body>
</html>		<li>Domains: ${grailsApplication.domainClasses.size()}</li>
				<li>Services: ${grailsApplication.serviceClasses.size()}</li>
				<li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>
			</ul>
			<h1>Installed Plugins</h1>
			<ul>
				<g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
					<li>${plugin.name} - ${plugin.version}</li>
				</g:each>
			</ul>
		</div>
		<div id="page-body" role="main">
			<h1>Welcome to Grails</h1>
			<p>Congratulations, you have successfully started your first Grails application! At the moment
			   this is the default page, feel free to modify it to either redirect to a controller or display whatever
			   content you may choose. Below is a list of controllers that are currently deployed in this application,
			   click on each to execute its default action:</p>

			<div id="controller-list" role="navigation">
				<h2>Available Controllers:</h2>
				<ul>
					<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
						<li class"grails-app/views/index.gsp"="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
					</g:each>
				</ul>
			</div>
		</div>
	</body>
</html>