<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>jQuery/JS 연동</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    
    <script>
        window.onload = function() {
            var membernum1 = document.getElementById('membernum1'); // 각 input 객체의 id값을 받아옴. 
            var membernum2 = document.getElementById('membernum2');

            membernum1.onkeydown = function () { // 첫번째 입력창 키보드 입력
                console.log(membernum1.value.length);
                if (6 <= membernum1.value.length) { // 첫번째 칸의 입력된 수 길이가 6 이상이면
                    membernum2.focus(); // 두번째 칸으로 포커싱 이동.
                }
            }
            membernum2.onkeydown = function (e) {// 두번째 입력창 키보드 입력
                var event = e || window.event; // 1. membernum2에서 백스페이스 (keyCode  8번)이고, membernum2값을 다 지웠으면, 
                // (window.event를 or로 지정해주는 이유는 )
                if(event.keyCode == 8 && membernum2.value.length == 0) {
                    membernum1.focus(); // 2. 앞자리 입력창으로 포커스 이동.
                }
            }
            membernum1.focus();
        };
    </script>
    
</head>
<body>
    <form action="">
        <input type="text" maxlength="6" id="membernum1">
        <span>-</span>
        <input type="password" maxlength="7" id="membernum2">
    </form>
</body>
</html>