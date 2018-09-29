$(document).ready(function(){
	url = '/listachamados';
	$.getJSON(url, function(data) {
		console.log(data);
		var qtd = data.length;
		for(i = 0; i < qtd; i++) {
			var linha = '<tr>' +
						'<td>'+ data[i].numeroChamado + '</td>' +
						'<td>'+ data[i].assunto + '</td>' +
						'<td>'+ data[i].usuarioResponsavel + '</td>' +
						'<td>'+ data[i].status + '</td>' +
						'<td><a href="chamado.html?num='+ data[i].numeroChamado + '">Editar</a></td>' +
					'</tr>';
			$("#tblChamados > tbody").append(linha);
		}
		
		

	});
});