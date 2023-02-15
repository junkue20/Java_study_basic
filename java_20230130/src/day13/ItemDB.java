package day13;

import java.util.List;
import java.util.Map;

public interface ItemDB {

	// 물품 전체 목록
	public List<Map<String, Object>> selecItemListMap(int n);
	
	// 물품 등록
	public int insertItemMap(Map<String, Object> map);
}
