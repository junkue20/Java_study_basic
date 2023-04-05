<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>jQuery로 객체추가</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src="https://code.jquery.com/jquery-3.6.4.slim.js" 
            integrity="sha256-dWvV84T6BhzO4vG6gWhsWVKVoa4lVmLnpBOZh/CAHU4=" 
            crossorigin="anonymous"></script>
            
    <script>
        $(document).ready(function () { //"window.onload= fucntion" 와 "() => {" 도 같은 의미임!
            for (var i = 0; i < 10; i++) {  // body에 h1 객체를 10개 만드는 것과 같음.
                $('<h1>Create object for' + i + '</h1>').css({
                    'background-color': 'black',
                    'color': 'red'

                }).appendTo('body');
                /* });
                 * $('body').append(h1); 로도 쓸 수 있다. */
            }
            // $('body').append('<h1>Create object by jQuery</h1>'); // body 태그내에 추가
        }) 
    </script>
    
</head>
<body>
    
</body>
</html>