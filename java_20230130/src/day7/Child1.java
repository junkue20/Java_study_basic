package day7;

public class Child1 extends Parents {

	@Override
	public void work() {
		// 부모의 work() 메소드를 호출함.
		super.work();// 부모의 기능을 사용함.
//		System.out.println("child1 work"); // 내가 필요한 기능을 추가.
	}

	@Override
	public void study() {
		super.study();
//		System.out.println("child2 study");
	}
}
