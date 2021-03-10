'use strict';

var app = angular.module('rebel', []);
var version = '11.1.3';

app.filter('html', function($sce) {
    return function(val) {
        return $sce.trustAsHtml(val);
    };
});

app.controller('RebelController', function($http, $scope, $sce, $location){
	
	$scope.adranswers = {};
	
	$scope.content = "This text is <em>html capable</em> meaning you can have <a href=\"#\">all</a> sorts <b>of</b> html in here.";
    $scope.getHtml = function(html){
        return $sce.trustAsHtml(html);
    };
    
    $scope.getHtml2 = function(){
    	
    	
    	$scope.ruta = 'http://localhost:8080/rebelapi/rest/rebel/loadhtml/'+$scope.projectboi+'&'+$scope.boi;
    	console.log($scope.ruta);
    	$http.get($scope.ruta).then(function(response) {
//    		console.log(response.data)
    		$scope.htmlBind = $sce.trustAsHtml(response.data);
	    });
    	
        
    };
	
	this.removeProject = function(item){ 
		var ctrler = this;
		
		// Enviar a persistir el project.
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/deleteproject/'+item;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.projects = response.data;
	    });
    }
	
	this.deleteBOI = function(item){ 
		var ctrler = this;
		console.log("item = "+item);
		// Enviar a persistir el project.
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/deleteboi/'+item;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.bois = response.data;
	    });
    }
	
	this.removeArtifact = function(item){ 
		var ctrler = this;
		
		// El id del artefacto es unico.
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/deleteartifact/'+item;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.facts = response.data;
	    });
    }
	
	this.removeADRtoFact = function(item1,item2){ 
		var ctrler = this;
		
		var params = $scope.projectboi+'&'+$scope.boi+'&'+item1+'&'+item2;
		
		// Enviar a persistir el project.
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/removeadrtofact/'+params;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.facts = response.data;
	    });
    }
	
	this.showTimeline = function(){
		var ctrler = this;
		
//		console.log("Timeline called");
		
		// projectname&bioname
		this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/getTimeline/'+$scope.projectboi+'&'+$scope.boi;
		
		$http.get(ctrler.ruta).then(function(response) {
			
//			console.log(response.data);
			
			$('#myTimeline').albeTimeline(response.data, {
				effect: 'bounceInDown',
				showGroup: false,
				formatDate: 'yyyy-MMMM-dd'
			});
			
		});
	};
	
	this.saveLinks = function(){
		
		var ctrler = this;
		
		// Se debería enviar el fact id, junto con el adr id
		
		var params = $scope.projectboi+'@'+$scope.boi
		
		angular.forEach(this.facts, function (value, key) {
			params += '&'+value.id+'@'+$scope.adranswers[value.id];
			$scope.adranswers[value.id] = "";
        }); 
		
		this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/setlinkfacttoadr/'+params;
		
		$http.get(ctrler.ruta).then(function(response) {
			ctrler.facts = response.data;
			
		});
		
	}
	
	this.loadADs = function(){
		var ctrler = this;
		
		console.log("pname = "+document.getElementById("pname").value);
		
		var projectName = document.getElementById("pname").value;
		this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listads/'+projectName;
//    	console.log('ruta: ' + this.ruta);
    	
		$http.get(ctrler.ruta).then(function(response) {
//			console.log(response.data);
			ctrler.ads = response.data;
	    });
    };
    
    this.createProject = function(){
    	var ctrler = this;
    	var projectName = document.getElementById("pname").value;
//    	console.log(projectName);
    	
    	// Enviar a persistir el project.
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/createproject/'+projectName;
//    	console.log('ruta: ' + this.ruta);
    	
    	if(projectName == ''){
    		alert("Project name can't be empty")
    	}else{
			$http.get(ctrler.ruta).then(function(response) {
//				console.log(response)
		    	ctrler.projects = response.data;
				document.getElementById('pname').value = '';
		    });
    	}
    };

    this.findelement = function(){
        
    	console.log("Entrando")
    	
    	var ctrler = this;
    	
    	var e = document.getElementById("pname");
    	var projectId = e.options[e.selectedIndex].value;
    	
    	console.log("projectId = "+projectId)
    	
    	var elementName = document.getElementById("ename").value;
    	
    	if(projectId=='' || projectId.indexOf("?")>=0){
    		alert("Project name can't be empty")
    	}else if(elementName==''){
    		alert("Element name can't be empty")
    	}else{
    	
	    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listboiswithelement/'+projectId+'&'+elementName;
	    	
			$http.get(ctrler.ruta).then(function(response) {
		    	ctrler.bois = response.data;
		    });
			
    	}
    	
    };
    
    this.listbois = function(){
    
    	var ctrler = this;
    	
    	var e = document.getElementById("pname");
    	var projectId = e.options[e.selectedIndex].value;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listbois/'+projectId;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.bois = response.data;
	    });
    	
    };
    
    this.listArtifactsProject = function(){
        
    	var ctrler = this;
    	
    	var e = document.getElementById("pname");
    	var projectName = e.options[e.selectedIndex].value;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listartifactsproject/'+projectName;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.projectartifacts = response.data;
	    });
    	
    };
	
    this.listProjects = function(){
    
    	var ctrler = this;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listprojects';
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.projects = response.data;
	    });
    	
    };
	
	this.listModels = function(){
    	// Se debe crear esta variable porque
		// dentro de la funcion de response se pierde la 
		// referencia a this.
    	var ctrler = this;
    	
    	var e = document.getElementById("pname");
    	var projectId = e.options[e.selectedIndex].value;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listmodels/'+projectId;
    	
		$http.get(ctrler.ruta).then(function(response) {
			ctrler.chooseModel = response.data;
	    });
    };
	
    
    this.showModel = function () {
    	loadModel()    	
    };
    
    this.showAndListModel = function () {
    	loadModel();
    	
    	var ctrler = this;
    	
    	var projectName = 'p='+document.getElementById('pname').value
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listelements/'+projectName;
    	
		$http.get(ctrler.ruta).then(function(response) {
			console.log(response.data);
			ctrler.elements = response.data;
			
	    });
    };
    
    this.update = function () {
    	var ctrler = this;
    	var myElements = graph.getElements();
    	var param = '';
    	
    	var e = document.getElementById("mname");
    	var modelName = e.options[e.selectedIndex].value;
    	
    	param = modelName+"+";
    	
		myElements.forEach(elem => {
		    var textVal = elem.attributes.attrs.label.text;
		    var center = elem.getBBox().topLeft();
		    var label = center.toString();
//		    
//		    console.log(textVal + " - " + label);
		    
		    var elementName = '';
		    var type = '';
		    
		    var n = textVal.includes("<<Component>>");
		    if(n){
		    	let tag = textVal.match(/\<\<([\w]+)\>\>\s([\w|\d]+)/);
		    	elementName = tag[2];
		    	type = "com";
		    }else{
		    	let tag = textVal.match(/\<\<([\w]+)\>\>\s(?:Type: ([\w]*))?\s([\w|\d]+)/);
		    	elementName = tag[3];
		    	type = "con";
		    }
		    
		    param += elementName+"&"+label+"+";
		    
		});	
	    	
	    this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/updateposition/'+param;
	    
//	    console.log(this.ruta);
	    
    	$http.get(ctrler.ruta).then(function(response) {
//			console.log(response)
	    	//ctrler.chooseModel = response.data;
	    });
		    
		
    };
    
    var graph = new joint.dia.Graph;
    var paper = new joint.dia.Paper({
        el: document.getElementById('myholder'),
        model: graph,
        gridSize: 1
    });
    
    var graph_boi = new joint.dia.Graph;
    var paper_boi = new joint.dia.Paper({
        el: document.getElementById('myholder_boi'),
        model: graph_boi,
        width: 500,
        height: 300,
        gridSize: 1
    });
    
    
    
    function loadModel() {
    	var e = document.getElementById("mname");
    	var modelName = e.options[e.selectedIndex].value;
    	
    	var g = document.getElementById("pname");
    	var projectName = g.options[g.selectedIndex].value;
    	
    	if(modelName==''){
    		alert("Model input can't be empty")
    	}else{
    		
    		
    		
			$.getJSON("http://localhost:8080/rebelapi/rest/rebel/getmodel/"+projectName+"&"+modelName, function(data) {            	
				graph.fromJSON(data);
			});
    	}
    }
        
    
    this.fun = function (fvname) {
    	console.log('Getting some fun');
    	
    	var ctrler = this;
    	
    	this.url = "http://localhost:8080/rebelapi/rest/rebel/getmodelboi/"+$scope.projectboi+'&'+$scope.boi+'&'+fvname;
    	console.log(this.url);    	
    	
    	$.getJSON(this.url, function(data) {            	
			graph_boi.fromJSON(data);
		});
    }
    
    this.loadURLParameters = function () {
    	
    	$scope.adranswers = {};
    	
    	console.log("Entrando");
    	var ctrler = this;
    	
    	// Se obtienen los valores pasados como parametros en la url
    	var pp = getUrlParameter('p');
    	var boip = getUrlParameter('boi');
    	
    	// Se reemplaza el simbolo de espacio en la url, por un espacio real 
    	// para asignarlo a la variable.
    	// Esta variable se mapea con sus campos en la seeboi.html
    	$scope.projectboi = pp.replace('\%20', ' ');
    	$scope.boi = boip.replace('\%20', ' ');
    	
    }
    
    this.listFacts = function(){
    	var ctrler = this;
    	
    	console.log("Before calling loadADs")
    	this.loadADs()
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listfacts/'+$scope.projectboi+'&'+$scope.boi;
    	
		$http.get(ctrler.ruta).then(function(response) {
			console.log(response.data)
			ctrler.facts = response.data;
	    });
    	
    }
    
    this.loadModelBOI = function () {
    	var ctrler = this;
    	
    	this.loadURLParameters();
    	    	
		$.getJSON("http://localhost:8080/rebelapi/rest/rebel/getmodelboi/"+$scope.projectboi+'&'+$scope.boi, function(data) {            	
			graph_boi.fromJSON(data);
		});
		
		this.showTimeline();
		$scope.getHtml2();
    	
    }
    
    function getUrlParameter(param, dummyPath) {
        var sPageURL = dummyPath || window.location.search.substring(1),
            sURLVariables = sPageURL.split(/[&||?]/),
            res;

        for (var i = 0; i < sURLVariables.length; i += 1) {
            var paramName = sURLVariables[i],
                sParameterName = (paramName || '').split('=');

            if (sParameterName[0] === param) {
                res = sParameterName[1];
            }
        }

        return res;
    }
    
    this.createboi = function () {
    	
    	var ctrler = this;
    	
    	this.parametros = 'p='+document.getElementById('pname').value+'&boi='+document.getElementById('bname').value;
    	
    	// Se recorre toda la lista, donde cada entrada corresponde a los datos de un elemento
    	angular.forEach(this.elements, function(value, key){
    		// Se recorren todos los campos del elemento
    		
    		if(value.selected==true){
    			if(value.type=='Connector')
    				ctrler.parametros = ctrler.parametros + '&nn='+value.name;
    			if(value.type=='Component')
    				ctrler.parametros = ctrler.parametros + '&nm='+value.name;
    		}
    			
        });
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/createboi/'+this.parametros
    	
    	$http.get(ctrler.ruta).then(function(response) {
			console.log(response.data);
			if(response.data=='OK')
				window.alert('BoI has been successfully saved');
			else 
				window.alert('An error occurred: '+response.data);
	    });
    }
    
    this.showArchiModel = function () {
    	console.log("Entrando")
    	var ctrler = this;
    	const model_name = 'Archimate.xml'
    	document.getElementById('viz').setAttribute('data-diagram-url', model_name);
//    	document.getElementById("viz").setAttribute('data-diagram-url', 'Archimate.xml');
//    	$('.viz').attr('data-diagram-url','http://localhost:8080/rebelviz/Archimate.xml');
    	$( "#viz" ).load(window.location.href + " #viz" );
    	$('#viz').load(document.URL +  ' #viz');
    	console.log("Nuevo 4")
    	console.log("Asignado")
    }
    
    
    
});

