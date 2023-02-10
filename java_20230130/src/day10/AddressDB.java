package day10;

import java.util.List;
import java.util.Map;

public interface AddressDB {
	
	// 주소추가
	public int insertAddress(AddressTable address);
	public int insertAddressMap(Map<String, Object> map);

	// 주소한개조회
	public AddressTable selectAddressOne(long code);
	public List<AddressTable> selectAddressOneForId(MemberTable member);
	public Map<String, Object> selectAddressMapOne(long code);
	
	// 회원에 해당하는 주소 전체 조회
	public List<AddressTable> selectAddressList(MemberTable member);
	public List<Map<String, Object>> selectAddressListMap(MemberTable member);

}
