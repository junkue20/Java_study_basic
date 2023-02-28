package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

// 메인에서 실행시키며 결과 출력하는 클래스
public class Print {

	// 3권정도 임의의 값으로 추가한 후 실행하기
	public void printBook(List<Book> book) {
		for (Book one : book) {
			System.out.println(one.getCode());
		}
	}
// ----------------------------------------------------------------------------

	// 전체 책과 필터하는 가격 조건 전달 받으면 가격보다 큰 책만 반환
	public List<Book> queryPrice(List<Book> book, long price) {
		List<Book> list = new ArrayList<>();
		for (Book p : book) {
			p.getPrice();
			if (p.getPrice() > price) {
				list.add(p);
			}
		}
		return list;
	}

// ----------------------------------------------------------------------------

	// 가격에서 일의 자리가 0인것만 조회
	// ex) 12233 = > X
	// ex) 12300 = > O
	public List<Map<String, Object>> queryPriceMap(List<Book> book) {
		List<Map<String, Object>> list = new ArrayList<>();
		for (Book p : book) {
			Map<String, Object> map = new HashMap<>();
			p.getPrice();
			if ((p.getPrice() % 10) == 0) {
				map.put("code", p.getCode());
				map.put("title", p.getTitle());
			}
			list.add(map);
		}
		return list;
	}

// ----------------------------------------------------------------------------

	// ex) 3
	// 3*1 = 3
	// ~
	// 3*9 = 27
	public void gugudan(int n) {
		for (int i = 1; i <= 9; i++) {
			int j = n * i;
			System.out.println(n + "*" + i + " = " + j);
		}
	}

// ----------------------------------------------------------------------------

	// n개의 정수형이 오면 합을 구해서 반환하는 메소드 구현
	public long sum(List<Long> list) {
		long sum = 0;
		for (Long n : list) {
			sum += n;
		}
		return sum;

	}

// ----------------------------------------------------------------------------

	// n개의 실수형이 오면 합과 평균을 구해서 반환하는 메소드 구현
	public Map<String, Object> sumAvg(List<Double> list) {
		double sum = 0.0d;
		double avg = 0.0d;
		Map<String, Object> map = new HashMap<>();
		for (Double n : list) {
			sum += n;
		}
		avg = sum / list.size();
		map.put("합한값", sum);
		map.put("평균값", avg);

		return map;

	}
// ----------------------------------------------------------------------------

}
