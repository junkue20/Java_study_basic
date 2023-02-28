package day8;

import java.util.List;

public interface BookDB {
	// 책등록 (int인 이유는 책넘버가 int이기 때문!)
	public int insertBook(Book book);

	// 책 전체조회
	public List<Book> selectBookList();

	// 책 10개씩 조회
	public List<Book> selectBookListPage(int page);

	// 책 삭제
	public int deleteBook(int no);

	// 책 수정
	public int updateBook(Book book);

	// 책1권 조회 // 반환타입
	public Book selectOneBook(int no);

	// n이상의 가격에 해당하는 책 조회
	public List<Book> selectBookPrice(long price);

	// 분류에 해당하는 항목만 조회
	public List<Book> selectBookCate(char cate);

}
