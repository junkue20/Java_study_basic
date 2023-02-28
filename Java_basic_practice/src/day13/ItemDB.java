package day13;

import java.util.List;
import java.util.Map;

public interface ItemDB { // 인터페이스 페이지

	// 물품 전체 목록
	public List<Map<String, Object>> selecItemListMap(int n);
	public List<Item> selectItemList(int n);
	
	// 물품 등록
	public int insertItemMap(Map<String, Object> map);
	
	// 물품에서 한개 삭제 ex)1004
	public int deleteItemOne(long no);
	
	// 물품 n개 삭제 ex){1004, 1007, 1010}
	public int deleteItemMany(long[] no);
	
	// 물품 수정 (name, content, price, quantity)를 변경하기
	public int updateItemOne(Item item);
}
