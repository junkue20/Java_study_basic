package day10;

import java.util.List;
import java.util.Map;

public interface MemberDB {

	// 추가하기
	public int insertMember(MemberTable member);
	public int insertMemberMap(Map<String, Object> map);

	// 1개 조회
	public MemberTable selectMemberOne(String id);
	public Map<String, Object> selectMemberMapOne(String id);

	// 전체 조회
	public List<MemberTable> selectMemberList();
	public List<Map<String, Object>> selectMemberMapList();

}
