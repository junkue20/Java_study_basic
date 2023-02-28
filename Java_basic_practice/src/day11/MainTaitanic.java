package day11;

import java.util.List;

public class MainTaitanic {

	public static void main(String[] args) {
		RestClientTitanic titanic = new RestClientTitanic();
		List<Titanic> list = titanic.paraseData();
		System.out.println("------------------------");
		System.out.println("    타이타닉호 탑승자 명단");
		System.out.println("------------------------");
		for (Titanic t : list) {
			System.out.println("이름 : " + t.getName());
			System.out.println("생존여부 : " + t.getSurvived());
			System.out.println("티켓등급 : " + t.getPclass());
			System.out.println("성별 : " + t.getSex());
			System.out.println("나이 : " + t.getAge());
			System.out.println("동승한 형제/자매 수 : " + t.getSibsp());
			System.out.println("동승한 부모/자녀 수  : " + t.getParch());
			System.out.println("티켓번호 : " + t.getTicket());
			System.out.println("운임요금 : " + t.getFare());
			System.out.println("객실번호 : " + t.getCabin());
			System.out.println("승객ID : " + t.getPassengerId());
			System.out.println("탑승한 곳 : " + t.getEmbarked());
			System.out.println("------------------------");
		}
	}

}
