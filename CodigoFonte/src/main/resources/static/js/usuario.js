$(document).ready(function(){
	
	$("form").submit(function(event){
		
		var objUsuario = { 
				"nome": $("#nome").val(), 
				"email": $("#email").val(), 
				"username": $("#username").val(),
				"password": $("#senha").val(),
				"tipoUsuario": $( "#tipo option:selected" ).val()
		};
		
		$.post('/usuarios', JSON.stringify(objUsuario)).done(function(response){
			var retorno = JSON.parse(response);
			console.log(retorno)
			if (retorno.success == "true") {
				alert("Dados gravados!");
				$("#btn-voltar").click();
			}
			else {
				alert("Erro ao gravar os dados!");
			}
		      
		});
		

		event.preventDefault();
	});
	
});

function listarUsuarios() {
	$.getJSON("/usuarios", function(data) {
		var qtd = data.length;
		for(i = 0; i < qtd; i++) {
			var linha = '<tr>' +
						'<td>'+ data[i].nome + '</td>' +
						'<td>'+ data[i].email + '</td>' +
						'<td>'+ data[i].username + '</td>' +
						'<td>'+ data[i].tipoUsuario + '</td>' 
						//'<td><a href="usuario.html?user='+ data[i].username + '">Editar</a></td>' +
					'</tr>';
			$("#tblUsuarios > tbody").append(linha);
		}
	});
}
