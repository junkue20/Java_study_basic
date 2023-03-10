package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 전화번호, 위치, 보유책(100), 
public class BookStore {

	private String phone = ""; // 전화번호
	private String address = "";// 주소
	private Book[] books = null; // 보유한 책 권수 배열
	/** 왜 private를 꼭 추가해야하는가? **/

	private int idx = 0; // 현재 배열에 추가되어있는 책의 위치

	// 생성자 1번만 사용가능함. 반환값 없음, 클래스명과 정확하게 일치
	// 준비물이 없는 빈 생성자
	public BookStore() {
		this.books = new Book[100];
	}

	// 책 등록하는 메소드(함수) 필요
	public void InsertBook(Book book) { // 왜 Book book이지??
		if (idx >= 100) { // 보관하는 책이 100권까지 도달할 경우
			System.out.println("책 추가 불가"); // 책 추가불가 메세지 출력
		} else {
			this.books[idx] = book;
			idx++;
			// 책이 100권이 될때까지 0번부터 시작해서 계속해서 값이 저장됨.
		}
	}

	// 현재까지 등록된 책 목록 출력
	public void selectBook() {
		int i = 0;
		for (i = 0; i < idx; i++) { // idx는 현재 책이 들어가 있는 숫자를 나타냄
			System.out.println(this.books[i].toString());
		}
	}

	// 마지막 등록한 책을 삭제하는 메소드
	public void deleteBook() { // 여기에는 왜 Book book이 안들어가는가
		if (idx > 0) {
			idx--;
		}
	}

	// 문제) 등록한 책의 가격을 전달받은 할인율 변경 메소드
	public float discountPrice(float per) {
		for (int i = 0; i < idx; i++) {
			long price = this.books[i].getPrice(); // 책의 값을 가져와야하기 떄문에 ".get"을 사용해야 함!!
			// 실수형 => 정수 => 결과값에 대한 손실이 일어날 수 있다. 형 변환은 항상 고려할것!!
			// int에서 long으로의 변환은 괜찮지만, 반대로의 변환은 결과값에 손실이 발생할 수 있다.
			long price1 = (int) (price - (price * per));
			this.books[i].setPrice(price1); // ".set" 을 이용하여 books 배열의 가격들을 변경해야 한다.

		}
		return 1;
	}

	// 문제) 가격이 X원 이상인 책 수량을 반환하는 메소드
	public void pirceQuery(int x) {
		int priceOver = 0; // 반환된 책 수를 나타낼 변수, 초기값은 0으로 지정
		for (int i = 0; i < idx; i++) { // 반복문 추가로 책 모두 소환
			if (this.books[i].getPrice() >= x)
				; // 만약 책 가격이 x원 이상인 경우,
			priceOver++; // 카운트를 1씩 올리고,
		}
		System.out.println(x + "원 이상인 책 수량 : " + priceOver + "권"); // 카운트된만큼 값을 출력

	}

	// 문제) 분류 코드가 전달받은 값의 항목만 출력하는 메소드
	public void printCate(char cate) {
		for (int i = 0; i < idx; i++) { // 반복문 추가
			if (this.books[i].getCate() == cate) { // 만약 책의 분류코드가 전달받은 값과 일치할때,
				System.out.println(this.books[i].toString()); // 저장된 책 목록 반환
			}
		}

	}
}
