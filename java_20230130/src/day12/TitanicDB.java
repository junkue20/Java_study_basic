package day12;

import java.util.List;
import java.util.Map;

import day11.Titanic;

// 메소드 정의

public interface TitanicDB {

	// 전체조회
	public List<Titanic> selectTitanicList();

	// 전체조회 Map방식
	public List<Map<String, Object>> selectTitaniListMap();

	// 나이순으로 정렬한 후 n명 조회
	public List<Titanic> selectTitanicAge(int n);
	
	
}
