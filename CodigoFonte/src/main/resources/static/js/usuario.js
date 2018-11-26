$(document).ready(function(){
	$("form").submit(function(event){
		
		var objUsuario = { 
				"nome": $("#nome").val(), 
				"email": $("#email").val(), 
				"username": $("#username").val(),
				"password": $("#senha").val(),
				"tipoUsuario": $( "#tipo option:selected" ).val()
		};

		console.log(objUsuario);
		
		var url = "/usuarios"
		$.post(url, objUsuario)
		  	.done(function( data ) {
		  		alert( "reposta: " + data );
		  	});

		event.preventDefault();
	});
});
