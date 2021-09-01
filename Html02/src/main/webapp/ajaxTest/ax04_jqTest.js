
$(function() {
	$('#jqTest').click(function(){
		// JQuery Ajax
		// => 메서드형태로 지원
		// => 메서드의 매개변수를 통해 필요한 속성 설정
		// => 설정 : method(Type:Get/Post), url, data(parameter) , result  
		$.ajax({
			type:'Get',
			url:'ax03_ParameterResult.jsp?',
			data: {
				id:$('#id').val(),
				password:$('#password').val(),
				name:$('#name').val()
			},
			success:function(result) {
				alert("~~ JQuery Ajax Test get 성공 ~~") ;
				$('#resultArea').html('** JQuery Test Response => <br>'+result);
			},
			error:function() {
				alert("~~ JQuery Ajax Test 실패 ~~") ;
				/*없는 url 로 Test*/ 
			$('#resultArea').html('** JQuery Test Response => <br> ~~ Error ~~');
			}
		}); //ajax
	}); //click
}); // ready

/*
$(function() {
	$('#jqTest').click(function(){
		// JQuery Ajax
		// => 메서드형태로 지원
		// => 메서드의 매개변수를 통해 필요한 속성 설정
		// => 설정 : method(Type:Get/Post), url, data(parameter) , result  
		$.ajax({
			type:'Post',
			url:'ax03_ParameterResult.jsp',
			data: {
				id:$('#id').val(),
				password:$('#password').val(),
				name:$('#name').val()
			},
			success:function(result) {
				alert("~~ JQuery Ajax Test 성공 ~~") ;
				$('#resultArea').html('** JQuery Test Response => <br>'+result);
			},
			error:function() {
				alert("~~ JQuery Ajax Test 실패 ~~") ;
				/*없는 url 로 Test*/ 
/*			$('#resultArea').html('** JQuery Test Response => <br> ~~ Error ~~');
			}
		}); //ajax
	}); //click
}); // ready
*/




/* 1. 기본형식
 * $.ajax({옵션속성:값}); 
 * 2. 옵션속성
 * url:문자열 - 요청url 설정

=> type:문자열 - GET/POST설정
   data:객체,문자열 - 요청 매개변수 설정 
   dataType: return Data Type - xml, html, json, jsonp, text, script
   success:함수
       => 성공시 호출할 함수 설정
       => 매개변수가 응답 결과를 받아줌 
   error:함수 - 실패시 호출할 함수 설정
   async:불리언 - 동기/비동기 설정 (True/False)
   beforeSend:HTTP 요청전에 발생하는 이벤트 핸들러
*/