<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>게시판 글쓰기</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!-- Include stylesheet -->
<link href="https://cdn.quilljs.com/1.3.6/quill.snow.css"
	rel="stylesheet">
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">


</head>
<body style="color: rgba(123, 123, 102, 0.5);">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-lg-">
							<div class="card shadow-lg border-0 rounded-lg mt-5">
								<div class="card-header">
									<h3 class="text-left font-weight-light my-4">게시글 등록하기</h3>
								</div>
								<div class="card-body">
									<form>
										<div class="form-floating mb-3">
											<input type="text" class="form-control" id="title"> <label
												for="floatingInput">제목</label>
										</div>
										<div id="editor" style="height: 400px">
											<p>Hello World!</p>
											<p>
												Some initial <strong>bold</strong> text
											</p>
											<p>
												<br>
											</p>
										</div>
										<div class="form-floating mt-3 mb-3">
											<input type="text" class="form-control" id="writer"
												for="floatingInput"> <label>작성자</label>
										</div>
										<a class="btn btn-primary btn-right" href="#"
											onclick="getEditorContent()">글쓰기</a>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>
	</div>


	<script src="https://cdn.quilljs.com/1.3.6/quill.js"></script>

	<script>
		var toolbarOptions = [ [ 'bold', 'italic', 'underline', 'strike' ], // toggled buttons
		[ 'blockquote', 'code-block' ],

		[ {
			'header' : 1
		}, {
			'header' : 2
		} ], // custom button values
		[ {
			'list' : 'ordered'
		}, {
			'list' : 'bullet'
		} ], [ {
			'script' : 'sub'
		}, {
			'script' : 'super'
		} ], // superscript/subscript
		[ {
			'indent' : '-1'
		}, {
			'indent' : '+1'
		} ], // outdent/indent
		[ {
			'direction' : 'rtl'
		} ], // text direction

		[ {
			'size' : [ 'small', false, 'large', 'huge' ]
		} ], // custom dropdown
		[ {
			'header' : [ 1, 2, 3, 4, 5, 6, false ]
		} ],

		[ {
			'color' : []
		}, {
			'background' : []
		} ], // dropdown with defaults fromF theme
		[ {
			'font' : []
		} ], [ {
			'align' : []
		} ],

		[ 'clean' ] // remove formatting button
		];

		// 위쪽에 있는 태그중에 id가 editor인것을 찾아서 toolbar는 toolbarOptions의 값으로 대체하고 테마를 snow로 해서 변경.
		const quill = new Quill('#editor', {
			modules : {
				toolbar : toolbarOptions
			},
			theme : 'snow'
		});

		function getEditorContent() {
			const title = document.getElementById("title");
			const writer = document.getElementById("writer");
			const content = quill.root.innerHTML; // 위쪽의 editor 객체를 통해서 가져오기

			/*   유효성 검사   */
			if (title.length <= 0) { // 최소 1자 이상 입력해야 함. 
				alert('제목을 입력하세요.')
				title.focus();
				return false; // 아래쪽 소스코드를 수행하지 않음. 함수가 종료됨.
			}

			if (writer.length <= 0) {
				alert('작성자를 입력하세요.')
				writer.focus();
				return false;
			}

			/* 
				<form action="write.do" metod="post">
			 		<input type="text" name="title" value="실제입력값"></input>
			 		<input type="text" name="content" value="실제입력값"></input>
			 		<input type="text" name="writer" value="실제입력값"></input>
				</form> 
			 */

			var form = document.createElement("form");
			form.action = "write.do";
			form.method = "post";
			form.style.display = "none";

			var input1 = document.createElement("input");
			input1.type = "text";
			input1.name = "title";
			input1.value = title.value;
			form.appendChild(input1);

			var input2 = document.createElement("input");
			input2.type = "text";
			input2.name = "content";
			input2.value = content;
			form.appendChild(input2);

			var input3 = document.createElement("input");
			input3.type = "text";
			input3.name = "writer";
			input3.value = writer.value;
			form.appendChild(input3);

			document.body.appendChild(form);
			form.submit();
		}
	</script>
</body>
</html>