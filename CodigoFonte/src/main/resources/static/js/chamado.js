$(document).ready(function(){
	
	$(".datepicker").datepicker();
	
	
	$("#form-principal").submit(function(event){
		
		var objForm = { 
				"numero": "0",
				"usuarioAbertura": $("#usuario-abertura").val(), 
				"usuarioResponsavel": $("#analista").val(), 
				"dataAbertura" : $("#data").val(), 
				"dataFechamento": $("#data-limite").val(), 
				"assunto" : $("#assunto").val(), 
				"descricao" : $("#descricao").val(), 
				"status" : $("#status").val(), 
				"prioridade": $( "#prioridade option:selected" ).val()
		};
		
		var numeroChamado = queryString("num");
		
		if (numeroChamado) { //Alteração
			
		} 
		else { //Inclusao
			console.log(objForm);
			
			$.post('/chamados', JSON.stringify(objForm)).done(function(response){
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
		}
		
		
		
		

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
