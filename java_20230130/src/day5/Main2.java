package day5;

public class Main2 {

	public static void main(String[] args) {
                            /*---------------문자--------------*/
		// 클래스명 객체명 = new 생성자명();
		Exam <String> obj = new Exam</* 앞에서 String을 선언했기에 굳이 적지 않아도 됨. */>();
		obj.setElement("aaa");
		String str = obj.getElement();
		System.out.println(str);

                            /*---------------숫자--------------*/
		// 제너릭 클래스의 타입은 원시타입 대입 불가능! ex)int, long ※※※※중요!!※※※※
		Exam <Integer> obj1 = new Exam<Integer>(); 
        // int는 Integer, long은 Long 등으로 해야 함 (원시타입은 강사님 블로그 강의자료 상단에서 확인이 가능.)
		obj1.setElement(1000);
		System.out.println(obj1.getElement());
	}

}
