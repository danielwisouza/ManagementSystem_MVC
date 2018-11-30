// função pra ler querystring
function queryString(parameter) {  
      var loc = location.search.substring(1, location.search.length);   
      var param_value = false;   
      var params = loc.split("&");   
      for (i=0; i<params.length;i++) {   
          param_name = params[i].substring(0,params[i].indexOf('='));   
          if (param_name == parameter) {                                          
              param_value = params[i].substring(params[i].indexOf('=')+1)   
          }   
      }   
      if (param_value) {   
          return param_value;   
      }   
      else {   
          return undefined;   
      }   
}


$(document).ready(function(){
	
	var numeroChamado = queryString("num");
	
	if (numeroChamado != undefined) {
		//busca os dados do chamado recebido de parametro
		url = '/chamados/' + numeroChamado;
		$.getJSON(url, function(data) {
			console.log(data);
			
			$("#numero").val(data.numeroChamado);
			$("#data").val(data.dataAbertura);
			$("#data-limite").val(data.dataFechamento);
			$("#usuario-abertura").val(data.usuarioAbertura);
			$("#analista").val(data.usuarioResponsavel);
			$("#status").val(data.status);
			$("#assunto").val(data.assunto);
			$("#descricao").val(data.descricao);
		});
	}
	
});

function formataData(dia, mes, ano) {
	return dia + '/' + mes + '/' + ano;
}