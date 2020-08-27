package web_study_09.dao;

import java.util.List;

import web_study_09.dto.Member;

public interface MemberDao {
	
	List<Member> selectMemberByAll();

	Member selectMemberByUserId(Member member);
	
	int insertMember(Member member);
	
	int updateMemder(Member member);
	
	int deleteMember(Member member);
	
}
