'use strict';


var app = angular.module('fileUpload', ['ngFileUpload']);
var version = '11.1.3';

app.controller('MyCtrl', ['$scope', '$http', '$timeout', '$compile', 'Upload', function ($scope, $http, $timeout, $compile, Upload) {
  $scope.usingFlash = FileAPI && FileAPI.upload != null;
  //Upload.setDefaults({ngfKeep: true, ngfPattern:'image/*'});
  $scope.changeAngularVersion = function () {
    window.location.hash = $scope.angularVersion;
    window.location.reload(true);
  };
  $scope.angularVersion = window.location.hash.length > 1 ? (window.location.hash.indexOf('/') === 1 ?
    window.location.hash.substring(2) : window.location.hash.substring(1)) : '1.2.24';

  $scope.invalidFiles = [];

  // make invalidFiles array for not multiple to be able to be used in ng-repeat in the ui
  $scope.$watch('invalidFiles', function (invalidFiles) {
    if (invalidFiles != null && !angular.isArray(invalidFiles)) {
      $timeout(function () {$scope.invalidFiles = [invalidFiles];});
    }
  });

  $scope.$watch('files', function (files) {
    $scope.formUpload = false;
    if (files != null) {
      // make files array for not multiple to be able to be used in ng-repeat in the ui
      if (!angular.isArray(files)) {
        $timeout(function () {
          $scope.files = files = [files];
        });
        return;
      }
      for (var i = 0; i < files.length; i++) {
        $scope.errorMsg = null;
        (function (f) {
          $scope.upload(f, true);
        })(files[i]);
      }
    }
  });

  $scope.uploadPic = function (file) {
    $scope.formUpload = true;
    if (file != null) {
      $scope.upload(file);
    }
  };

  $scope.upload = function (file, resumable) {
    $scope.errorMsg = null;
    uploadUsingUpload(file, resumable);
    
  };

  $scope.isResumeSupported = Upload.isResumeSupported();

  $scope.chunkSize = 100000;
  function uploadUsingUpload(file, resumable) {
	  
	var e = document.getElementById("pname");
  	var projectId = e.options[e.selectedIndex].value;
  	
  	var b = document.getElementById("bname");
  	var artifactType = b.options[b.selectedIndex].value;
	  
    file.upload = Upload.upload({
      url: 'http://localhost:8080/rebelviz/upload?project='+projectId+'&artifactType='+artifactType,
      resumeSizeUrl: resumable ? 'http://localhost:8080/rebelviz/upload?project='+projectId+'&artifactType='+artifactType+'&name=' + encodeURIComponent(file.name) : null,
      resumeChunkSize: resumable ? $scope.chunkSize : null,
      headers: {
        'optional-header': 'header-value'
      },
      data: {username: $scope.username, file: file}
    });

    file.upload.then(function (response) {
      $timeout(function () {
        file.result = response.data;
        document.getElementById("file").value = "";
      });
    }, function (response) {
    	console.log(response.data);
      if (response.status > 0)
        $scope.errorMsg = response.status + ': ' + response.data;
    }, function (evt) {
      // Math.min is to fix IE which reports 200% sometimes
      file.progress = Math.min(100, parseInt(100.0 * evt.loaded / evt.total));
    });

    file.upload.xhr(function (xhr) {
      // xhr.upload.addEventListener('abort', function(){console.log('abort complete')}, false);
    });
  }

  $scope.listProjects = function(){
	    
	$scope.ruta = 'http://localhost:8080/rebelapi/rest/rebel/listprojects';
  	console.log('ruta: ' + this.ruta);
  	
	$http.get($scope.ruta).then(function(response) {
		console.log(response)
    	$scope.projects = response.data;
    });
  	
  };




}]);
