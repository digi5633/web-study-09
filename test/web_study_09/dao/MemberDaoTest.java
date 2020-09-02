package web_study_09.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import web_study_09.dao.impl.MemberDaoImpl;
import web_study_09.dto.Member;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberDaoTest {

	@Test
	public void test05SelectMemberByAll() {
		System.out.println("test05SelectMemberByAll");
		List<Member> list = MemberDaoImpl.getInstance().selectMemberByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);

		System.out.println();
	}

	@Test
	public void test03SelectMemberByUserId() {
		System.out.printf("%s()%n", "test03SelectMemberByUserId");
		Member selectMember = MemberDaoImpl.getInstance().selectMemberByUserId(new Member("somi"));
		Assert.assertNotNull(selectMember);

		System.out.printf("%s%n%n", selectMember);
	}

	@Test
	public void test01InsertMember() {
		System.out.printf("%s()%n", "test01InsertMember");
		Member insertMember = new Member("박규영", "parkgy", "1234", "pgy@naver.com", "010-1111-2222", 0);
		int res = MemberDaoImpl.getInstance().insertMember(insertMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", insertMember);
	}

	@Test
	public void test02UpdateMemder() throws ParseException {
		System.out.printf("%s()%n", "test02UpdateMemder");
		Member updateMember = new Member("JSP", "parkgy", "5678", "jsp@gmail.com", "010-5555-5555", 1, new Date());
		int res = MemberDaoImpl.getInstance().updateMember(updateMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", updateMember);
	}

	@Test
	public void test04DeleteMember() {
		System.out.printf("%s()%n", "test04DeleteMember");
		Member deleteMember = new Member("parkgy");
		int res = MemberDaoImpl.getInstance().deleteMember(deleteMember);
		Assert.assertEquals(1, res);

		System.out.printf("%s%n%n", deleteMember);
	}

}
