<!doctype html>
<html>
	<head>
		<meta name="layout" content="main2"/>
		<title>Welcome to Grails</title>
		
	</head>
	<body>
	
	<g:form controller="BusquedaDeCancion" >
	Busqueda:<g:field type="text" name="nombre" placeholder=""/>
	<g:submitButton name="submit" value="EnviarDatos"/>
	</g:form>

	</body>	
</html>
