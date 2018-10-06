function logar() {
	var usuario = $("#usuario").val();
	var senha = $("#senha").val();
	
	if (usuario === "" || senha === "") {
		alert("Informe o usuario e senha");
		return false;
	}
	
	//busca os dados do chamado recebido de parametro
	url = '/chamado/usuario/' + usuario;
	$.getJSON(url, function(data) {
		console.log(data);
		if(data.length == 0) {
			alert("Usuario nao encontrado");
			return false;
		}
		else
			window.location.href = "/index.html";
		
	});
	
}