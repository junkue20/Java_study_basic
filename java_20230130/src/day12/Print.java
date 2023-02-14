package day12;

import java.util.Iterator;
import java.util.List;

import day11.Titanic;

// 출력하는 곳
public class Print {

	// 전체 목록을 받아서 생존자의 인원수를 구하시오.

	public void printSurvived(List<Titanic> list) {
		// 전체목록 입력
		int cnt = 0;
		for (Titanic t : list) {
			if (t.getSurvived().equalsIgnoreCase("yes")) {
				cnt++;
			}
		}
		System.out.println("총 생존자는 " + cnt + "명 입니다.");
	}

	// 전체 목록을 받아서 연령대별 인원수를 구하시오. (단 0은 제회)
	// 단, 0살로 나오는 사람은 제외, 0.01~9, 9~19 등..
	public void printAge(List<Titanic> list) {
		int[] idx = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		// ------------------------------------------
		int i = 0;
		while (i < list.size()) {
			Titanic t = list.get(i);

			if (t.getAge() > 0) {
				int n = t.getAge().intValue() / 10;
				idx[n]++;
			}
			i++;
		}
		for (i = 0; i < idx.length; i++) {
			System.out.println(i * 10 + "대 => " + idx[i] + "명");
		}
		// ------------------------------------------

//		for (Titanic t : list) {
//			if (t.getAge() > 0 && t.getAge() <= 9) {
//				idx[0]++;
//			} else if (t.getAge() <= 19) {
//				idx[1]++;
//			} else if (t.getAge() <= 29) {
//				idx[2]++;
//			} else if (t.getAge() <= 39) {
//				idx[3]++;
//			} else if (t.getAge() <= 49) {
//				idx[4]++;
//			} else if (t.getAge() <= 59) {
//				idx[5]++;
//			} else if (t.getAge() <= 69) {
//				idx[6]++;
//			} else if (t.getAge() <= 79) {
//				idx[7]++;
//			} else if (t.getAge() <= 89) {
//				idx[8]++;
//			}
//		}
//		System.out.println("---------------------");
//		System.out.println("어린이 수 : " + idx[0] + "명");
//		System.out.println("10대 수 : " + idx[1] + "명");
//		System.out.println("20대 수 : " + idx[2] + "명");
//		System.out.println("30대 수 : " + idx[3] + "명");
//		System.out.println("40대 수 : " + idx[4] + "명");
//		System.out.println("50대 수 : " + idx[5] + "명");
//		System.out.println("60대 수 : " + idx[6] + "명");
//		System.out.println("70대 수 : " + idx[7] + "명");
//		System.out.println("80대 수 : " + idx[8] + "명");
//		System.out.println("---------------------");

		// ------------------------------------------

	}

	// 전체 목록에서 pclass값의 종류별 갯수를 구하시오.(종류는 1,2,3)
	public int[] printPclass(List<Titanic> list) {
		int[] idx = { 0, 0, 0, 0 };
		for (Titanic t : list) {
			int n = t.getPclass();
			idx[n]++;

			// ------------------------------------------
//			if (t.getPclass() == 1) {
//				idx[0]++;
//			} else if (t.getPclass() == 2) {
//				idx[1]++;
//			} else if (t.getPclass() == 3) {
//				idx[2]++;
//			}
			// ------------------------------------------

		}
		return idx;

	}

	// 전체 목록에서 운임요금(fare) 30보다 큰것만 fare와 name으로 출력. (단, fare는 소수점을 올림하여 정수로 표시)
	public void printFare(List<Titanic> list) {
		for (Titanic t : list) {
			if (t.getFare() > 30) {
				System.out.println("이름 : " + t.getName());
				System.out.println("요금 : " + t.getFare().intValue() + "$");
				System.out.println("----------------------------------------");
			}
		}
	}

	// 전체 목록에서 이름(name)에서 Mr. Miss. Mrs. 를 각각 포함하는 인원수를 구하시오.
	public void printName(List<Titanic> list) {
		int[] idx = { 0, 0, 0 };
		// int idx = new int idx[3];
		for (Titanic t : list) {
			if (t.getName().contains("Mr.")) {
				idx[0]++;
			} else if (t.getName().contains("Miss.")) {
				idx[1]++;
			} else if (t.getName().contains("Mrs.")) {
				idx[2]++;
			}
		}
		System.out.println("성인남성 수 : " + idx[0] + "명");
		System.out.println("미혼여성 수 : " + idx[1] + "명");
		System.out.println("기혼여성 수 : " + idx[2] + "명");
	}

	// 연령대별 생존자수 구하기 (전체 생존자 수 891명, 비율은 소수점으로 표시)
	public void printAgeSurvived(List<Titanic> list) {
		// 0.01~9까지, 연령대별 인원수를 구하고 연령대별 생존자수 구하기
		// 생존자수 / 전체인원 * 100
		int[] idx1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] idx2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// ------------------------------------------
		int i = 0;
		for (Titanic t : list) {

			if (t.getAge() > 0) {
				int n = t.getAge().intValue() / 10;
				idx1[n]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[n]++;
				}
			}
		}
		for (i = 0; i < idx1.length; i++) {
			System.out.println(i * 10 + "대 생존자 => " + idx1[i] + "명");
			System.out.println(i * 10 + "대 생존자 비율 => " + (float) idx2[i] / idx1[i] * 100);
			System.out.println("----------------------------");

		}
	}

	// 성별 생존자수 구하기 (전체 생존자 수 891명, 비율은 소수점으로 표시)
	public void printSexSurvived(List<Titanic> list) {
		// 남녀 인원수 구하기, 남녀 생존자수 구하기
		// 생존자수 / 전체인원 * 100
		int idx1[] = { 0, 0 };
		int idx2[] = { 0, 0 };

		for (Titanic t : list) {
			if (t.getSex().equals("male")) {
				idx1[0]++; // 남자전체수
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[0]++; // 남자생존자
				}
			} else if (t.getSex().equals("female")) {
				idx1[1]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[1]++;
				}
			}
		}
		System.out.println((float) (idx2[0] / (float) idx1[0]) * 100);
		System.out.println((float) (idx2[1] / (float) idx1[1]) * 100);
		System.out.println("----------");
	}

	// 티켓 등급별 생존자수 구하기 (전체 생존자 수 891명, 비율은 소수점으로 표시)
	public void printPClassSurvived(List<Titanic> list) {
		// 남녀 인원수 구하기, 남녀 생존자수 구하기
		// 생존자수 / 전체인원 * 100
		int[] idx1 = new int[4];
		int[] idx2 = new int[4];

		for (Titanic t : list) {
			if (t.getPclass() == 1) {
				idx1[1]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[1]++;
				}
			} else if (t.getPclass() == 2) {
				idx1[2]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[2]++;
				}
			} else if (t.getPclass() == 3) {
				idx1[3]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					idx2[3]++;
				}
			}
		}
		for (int i = 1; i < 4; i++) {
			System.out.println(i + "등급대 생존자 => " + idx2[i] + "명");
			System.out.println(i + "등급대 생존자 비율 => " + (float) idx2[i] / (float) idx1[i] * 100);
			System.out.println("-------------------------");
		}
	}

	// for문 사용해서 출력
	public void printListAll0(List<Titanic> list) {

		for (Titanic t : list) { // 너무 기니까 이정도만.
			System.out.println(t.getName());
		}
		for (int i = 0; i < list.size(); i++) {
			Titanic t = new Titanic();
			System.out.println(t.getName());
		}

	}

	// while문 이용해서 출력
	public void printListAll1(List<Titanic> list) {
		Iterator<Titanic> cursor = list.iterator(); // 변환해줘야함
		while (cursor.hasNext()) { // 만약 list값이 계속해서 다음값이 존재한다면
			Titanic c = cursor.next();
			System.out.println(c.getName());
		}

		int i = 0; // 초기값
		while (i < list.size()) {
			Titanic c = list.get(i);
			System.out.println(c.getName());
		}
	}

	// do-while문 이용해서 출력
	public void printListAll2(List<Titanic> list) {
		int i = 0;
		do {
			Titanic c = list.get(i);
			System.out.println(c.getName());
			i++; // 증가값
		} while (i < list.size()); // 조건

	}

}
