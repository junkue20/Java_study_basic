package day7;

public class Child2 extends Parents {

	@Override // 이 메소드는 기능을 재 정의 할것임.
	public void work() {
		// super.work(); (부모기능)을 다 빼버리고 새롭게 사용.)
	    System.out.println("child2 work");
	}

	@Override
	public void study() {
	    System.out.println("child2 study");

	}

	
}
