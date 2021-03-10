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
    		$scope.htmlBind = $sce.trustAsHtml(response.data);
	    });
    };
    
	
	this.removeProject = function(item, amount){ 
		var ctrler = this;
		
		if(amount==0){
		
			// Enviar a persistir el project.
	    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/deleteproject/'+item;
	    	
			$http.get(ctrler.ruta).then(function(response) {
		    	ctrler.projects = response.data;
		    });
			
		}else{
			window.alert("Projects with artifacts can not be deleted. First delete all artifacts.");
		}
    }
	
	this.deleteBOI = function(item){ 
		var ctrler = this;
		
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
	    	ctrler.projectartifacts = response.data;
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
		
		// projectname&bioname
		this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/getTimeline/'+$scope.projectboi+'&'+$scope.boi;
		
		$http.get(ctrler.ruta).then(function(response) {
			
			
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
        
    	
    	var ctrler = this;
    	
    	var e = document.getElementById("pname");
    	var projectId = e.options[e.selectedIndex].value;
    	
    	
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
    
    this.listFactsFromCnC = function(){
        
    	var ctrler = this;
    	
    	var boiName = document.getElementById("boiname").value;
    	
    	var projectName = document.getElementById("projname").value;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listcncfacts/p='+projectName+'&b='+boiName;
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.facts = response.data;
	    });
		
		this.listQAs();
		
    	
    };
    
    this.listQAs = function(){
        
    	var ctrler = this;    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listcompromisedqas';
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.compromisedqas = response.data;
	    });    	
		
		this.listCauseTypes();
    };
    
    this.listCauseTypes = function(){
        
    	var ctrler = this;    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listcausetypes';
    	
		$http.get(ctrler.ruta).then(function(response) {
	    	ctrler.causetypes = response.data;
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
    	// Este loadModel es para los diagramas de C&C
    	// Igual se debe ajustar la manera de visualizar el modelo, porque
    	// ahora se colocó un iframe.
    	// loadModel();
    	loadIFrameModel();
    	
    	var ctrler = this;
    	
    	var projectName = document.getElementById('pname').value
    	// Esto s debe cambiar de acuerdo al tipo de modelo
    	var modelType = 'arc';
    	var e = document.getElementById("mname");
    	var modelName = e.options[e.selectedIndex].value;
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listelements/'+projectName+"&"+modelType+"&"+modelName;
    	
		$http.get(ctrler.ruta).then(function(response) {
			
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
    
    function loadBOIModelIFrame() {
    	
    	// Obtiene el nombre del boi de la url
    	var boip = getUrlParameter('boi');
    	var pp = getUrlParameter('p');
    	var mn = getUrlParameter('mn');
    	
    	var site = "localstorage.html?mn="+pp+"/core/"+boip+"/"+mn+".xml";
        document.getElementsByName('myFrame')[0].src = site;
    }
    
    
    function loadIFrameModel() {
    	// Preguntar si ya tiene el .xml al final. En caso de que no, se agrega 
    	
    	var g = document.getElementById("pname");
        var projectName = g.options[g.selectedIndex].value;
    	
        var site = "localstorage.html?mn="+projectName+"/"+document.getElementById('mname').value+".xml";
        document.getElementsByName('myFrame')[0].src = site;
        console.log(document.getElementById('mname').value)
    }
    
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
    	
    	this.loadADs()
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listfacts/'+$scope.projectboi+'&'+$scope.boi;
    	
		$http.get(ctrler.ruta).then(function(response) {
			ctrler.facts = response.data;
	    });
    	
    }
    
    this.loadModelBOI = function () {
    	var ctrler = this;
    	
    	// *****************************
    	// LOAD URL PARAMETERS
    	// *****************************
    	this.loadURLParameters();
    	
    	// *****************************
    	// LOAD COMBOS INFO
    	// *****************************
    	this.loadBOIViews();
    	this.loadBOIElements();
    	
    	// *****************************
    	// LOAD VISUAL ELEMENTS
    	// *****************************
		this.showTimeline();
		$scope.getHtml2();		
		loadBOIModelIFrame();
    }
    
    // ==============================
    // LOAD VIEWS OF A BOI
    // ==============================
    this.loadBOIViews = function(){
    	
    	var ctrler = this;
    	
    	var proj = $scope.projectboi;
    	var boi = $scope.boi; 
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listboiviews/'+proj+'&'+boi;
    	
    	$http.get(ctrler.ruta).then(function(response) {
			ctrler.boiviews = response.data;
	    });
    }
    
    this.loadBOIElements = function(){
    	
    	var ctrler = this;
    	
    	var proj = $scope.projectboi;
    	var boi = $scope.boi; 
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listboielements/'+proj+'&'+boi;
    	
    	$http.get(ctrler.ruta).then(function(response) {
			ctrler.boielements = response.data;
	    });
    }
    
    this.goTraining = function(){
    	
    	var ctrler = this;
    	
    	var proj = $scope.projectboi;
    	var boi = $scope.boi; 
    	
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/gotraining/'+proj+'&'+boi;
    	
    	$http.get(ctrler.ruta).then(function(response) {
			if(response.data=='NOK')
				window.alert('An error occurred: '+response.data);
			else
				window.alert(response.data);
	    });
    	
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
    	
    	var e = document.getElementById("mname");
    	var modelName = e.options[e.selectedIndex].value;
    	
    	this.parametros = 'p='+document.getElementById('pname').value+'&bm='+modelName+'&boi='+document.getElementById('bname').value;
    	
    	// Se recorre toda la lista, donde cada entrada corresponde a los datos de un elemento
    	angular.forEach(this.elements, function(value, key){
    		// Se recorren todos los campos del elemento
    		
    		// Para C&C
    		// if(value.selected==true){
    		//	if(value.type=='Connector')
    		//		ctrler.parametros = ctrler.parametros + '&nn='+value.name;
    		//	if(value.type=='Component')
    		//		ctrler.parametros = ctrler.parametros + '&nm='+value.name;
    		//}
    		
    		// Para Archimate
    		if(value.selected==true){
    			
    			var elementName = value.name;
    			elementName = elementName.replace(/[&]/g,'_AMP_');
    			elementName = elementName.replace(/[#]/g,'_CHA_');
    			elementName = elementName.replace(/[$]/g,'_MON_');
    			elementName = elementName.replace(/[%]/g,'_PER_');
    			
    			ctrler.parametros = ctrler.parametros + '&' + elementName;
    		}
    			
        });
    	
    	// this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/createboi/'+this.parametros
    	this.ruta = 'http://localhost:8080/rebelapi/rest/rebel/createboiarchi/'+this.parametros
    	
    	$http.get(ctrler.ruta).then(function(response) {
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

