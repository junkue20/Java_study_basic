package review;

public class Review1 {

	public static void main(String[] args) {
		Name.print(); // 인스턴스를 생성하지 않아도 호출이 가능

		Name name = new Name(); // 인스턴스 생성
		name.print2(); // 인스턴스를 생성하여야만 호출이 가능
	}

}

class Name {
	static void print() { // 클래스 메소드
		System.out.println("안녕하세요");
	}

	void print2() { // 인스턴스 메소드
		System.out.println("반갑습니다.");
	}
}




/* 오늘 집가서 pull 되어있나 꼭 확인해볼 것! */