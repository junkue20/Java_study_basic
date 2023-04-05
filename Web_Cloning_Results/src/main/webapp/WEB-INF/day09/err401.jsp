<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<jsp:include page="head.jsp"></jsp:include>

    <div id="layoutError">
        <div id="layoutError_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-6">
                            <div class="text-center mt-4">
                                <h1 class="display-1">401</h1>
                                <p class="lead">허용되지 않은 접근</p>
                                접근 불가능한 주소입니다.
                                <a href="index.html">
                                    <i class="fas fa-arrow-left me-1"></i>
                                    메인화면으로
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
        <div id="layoutError_footer">
            <footer class="py-4 bg-light mt-auto">
                <div class="container-fluid py-4">
                    <div class="d-flex justify-content-between align-items-center small">
                        <div class="text-muted me-2">Copyright &copy; PKNU 2023.</div>
                        <div>
                            <a href=""> Privacy Policy</a> &middot; <a href="">Terms</a> &amp; Conditions
                        </div>
                    </div>
                </div>
            </footer>
        </div>
    </div>

    <!-- 2. Bootstrap용 js는 body에 위치해야 함! -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>

</html>