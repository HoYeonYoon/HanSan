package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.Domain.Member;
import hello.hellospring.service.MemberService;

class MemberserviceTest {

	MemberService memberService;
	MemoryMemberRepository memberRepository;
	
	@BeforeEach
	public void beforeEach() {
		memberRepository = new MemoryMemberRepository();
		memberService = new MemberService(memberRepository);
	}
	
	
	 @AfterEach
	 public void afterEach() {
		 memberRepository.clearStore();
	 }
	
	
	@Test
	void join() {
		//given
		Member member = new Member();
		member.setName("hello");
		
		//when
		Long saveId = memberService.join(member);
		
		//then
		Member findMember = memberService.findOne(saveId).get();
		Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
		
	}
	
	@Test
	public void �ߺ�_ȸ��_����() {
		//given
		Member member1 = new Member();
		member1.setName("spring");
		
		Member member2 = new Member();
		member2.setName("spring");
		
		//when
		memberService.join(member1);
		assertThrows(IllegalStateException.class, () -> memberService.join(member2));
		
/*		try {
			memberService.join(member2);
			fail();
		} catch (IllegalStateException e) {
			assertThat(e.getMessage()).isEqualTo("�̹� �����ϴ� ȸ���Դϴ�.");
		}
*/
		
		//then
	}
	
	
	@Test
	void findMembers() {
		
	}
	
	@Test
	void findOne() {
		
	}
	
}
