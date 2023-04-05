<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>채팅 예제</title>
</head>

<body>
	<div>
		<input type="text" id="msg" value="내용" /> 
		<input type="button"
			id="btn" value="전송" onclick='sendMessage()'/>
		<div id="output" style="border: 1px solid #cccccc"></div>
	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/mqtt/4.3.7/mqtt.min.js">
		</script>
	<script>
   const mqttOptions = {
         host :'1.234.5.158', // 서버주소
         port : 11884, // 포트주소
         options : { // 옵션사항들
            clear : true,
            reconnectPeriod : 2000, // 2초 간격으로 접속
            clientId : 'ds209_' + new Date().getTime(), // 접속하는 클라이언트 아이디 고유값
            username: 'ds606',
            password : 'ds606'
         }
      }
   
      // 서버접속 'ws://1.234.5.158:11884'
      const url = 'ws://'+mqttOptions.host+":"+mqttOptions.port;
      const client = mqtt.connect(url, mqttOptions.options);
      console.log(client);
      
      client.on('connect', () => { // 접속 성공했을때 호출됨
         console.log('success');
      });
      client.on('error', () => { // 접속 오류 발생시 호출됨
         console.log('error');
      });
      
      const output = document.getElementById('output');
      client.on('message', (topic, message) => { // 메세지 왔을때 호출됨
         // Unit8Array => String
         var msg1 = new TextDecoder().decode(message);
         console.log('message', topic, msg1);
         
         output.innerHTML = "["+topic+"]"+ msg1 + "<br />" + output.innerHTML
      });
      
      // 채널 열기 구독
      client.subscribe('/pknu/class302/#', {qos:0}, (error, res) =>{
         if(error){
            console.log('subscribe error'); // 구독실패
         }
         else {
            console.log('subscribe success'); // 구독성공
         }
      });
      
      function sendMessage(){
         const msg = document.getElementById("msg").value;
         client.publish('/pknu/class302/ds209', msg, 0, error => {
            if(!error) {
               console.log('send success');
            };
         });
      };
   </script>

</body>
</html>