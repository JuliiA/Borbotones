<html xmlns="http://www.w3.org/1999/xhtml">
<head>		
	<script src="js/jquery-1.2.6.js" type="text/javascript"></script>
	<script src="js/jquery.scrollTo-1.3.3.js" type="text/javascript"></script>
	<script src="js/jquery.localscroll-1.2.5.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/jquery.serialScroll-1.2.1.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/coda-slider.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery.easing.1.3.js" type="text/javascript"
		charset="utf-8"></script>
	
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'templatemo_style.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'coda-slider.css')}" type="text/css">
	
	<%--link para ranking --%>
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'ranking.css')}" type="text/css">
	
	<%--Reproductor --%>
	<sm:inlinePlayer />

</head>
<Body>
	<div id="slider">		
		<div id="templatemo_header_wrapper">
			<div id="templatemo_header">
				<h1>Borbotones</h1>				
			</div>
		</div>
		
		<div id="templatemo_main">
			<div id="templatemo_content">
				<h2>Hola ${session.usuario.name} !</h2>
				<div class="col_370 float_l">
					<div id="contenedorDeMusica" align="center">
						<g:each in="${canciones}" var="cancion">
							<g:link url="${cancion.url}" controller="Canciones" action="ListarCanciones">${cancion.author + '-' + cancion.name}</g:link>
								<div class="ec-stars-wrapper">
									<g:link elementId="1" id="1" url="#" action="cantEstrellas" controller="Canciones">&#9733;</g:link>
									<g:link elementId="2" id="2" url="#" action="cantEstrellas" controller="Canciones">&#9733; </g:link>
									<g:link elementId="3" id="3" url="#" action="cantEstrellas" controller="Canciones">&#9733; </g:link>
									<g:link elementId="4" id="4" url="#" action="cantEstrellas" controller="Canciones">&#9733; </g:link>
									<g:link elementId="5" id="5" url="#" action="cantEstrellas" controller="Canciones">&#9733; </g:link>
								</div>	
						</g:each>
						<noscript>Necesitas tener habilitado javascript para poder votar</noscript>	
		       		</div>
				</div>
			</div>
			<g:link action="crearListaDeCanciones" controller="canciones">Crear Lista</g:link></br>
			<g:link action="index" controller="Login">Ver lista de reproduccion creada</g:link></br>
			<g:link action="logout" controller="Login">Salir</g:link></br>
		</div>
	
		<div id="templatemo_footer_wrapper">
			<div id="templatemo_footer">
				Pie de pagina
				<div class="cleaner">
				</div>
			</div>
		</div>
	</div>
	
</Body>
</html>
