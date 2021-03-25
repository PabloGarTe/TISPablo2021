var mensaje
function ini(){
 mensaje = '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
'<Body>'+
    '<SumarRequest xmlns="http://www.example.org/calculadora">'+
        '<a>'+ document.getElementById('a') +'</a>'+
        '<b>'+ document.getElementById('b') +'</b>'+
    '</SumarRequest>'+
'</Body>'+
'</Envelope>'
function soap(){
    ini()
    axios.post('http://localhost:8082/ws/calculadora', mensaje,{
        headers : {
            'Content-Type' : 'text/xml',
            'SOAPAction' : ''
        }
    })
    .then(function(response){
        document.getElementById('r').value = result(response.data)
    })
    
    .catch(err =>console.log(err))
}
    function result(rXml){
        var parser = new DOMParser();
        var xmlDoc =parser.parseFromString(rXml, "text/xml");
        var resultado = xmlDoc.getElementsByClassName("ns2:resultado")[0].childNodes[0].nodeValue;
        return resultado;
    }
}