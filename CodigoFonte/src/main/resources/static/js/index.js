$(document).ready(function(){
	url = '/chamados';
	listarChamados(url);
});

function listarChamados(url) {
	$.getJSON(url, function(data) {
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
}

$("#btnPesq").click(function() {
	alert("clicou")
});

function pesquisarChamado(){
	//var numPesq = $("#numPesquisa").val();
	//if (numPesq !== "") {
	//	$("#tblChamados > tbody > tr").remove();
		
	//	url = '/chamado/'+numPesq;
	//	listarChamados(url);
	//}
	//else{
		$("#tblChamados > tbody > tr").remove();
		url = '/chamados';
		listarChamados(url);
	//}
	
}