package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import dto.Member;

@Mapper
public interface MemberMapper {

	
	// 회원가입
	@Insert( value = {
			"  INSERT INTO memberTB  ",
					"  ( MEM_NAME, MEM_ID, ",
				      "  MEM_PW, MEM_PHONE,  ",
				      "  MEM_ADDRESS  )  ",
			"  VALUES (  ",
				      "  #{obj.MEM_NAME}, #{obj.MEM_ID},  ",
				      "  #{obj.MEM_PW}, #{obj.MEM_PHONE},  ",
				      "  #{obj.MEM_ADDRESS}  )   ",				      
	})
	public int insertMemberOne(@Param("obj") Member obj);
}
