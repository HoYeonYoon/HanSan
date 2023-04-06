package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.hellospring.Domain.Member;
import hello.hellospring.repository.MemberRepository;

public class MemberService {

	private final MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	/**
	 * ȸ�� ����
	 */
	public Long join(Member member) {
		// ���� �̸��� �ִ� �ߺ� ȸ�� X
		validateDuplicateMember(member);
		memberRepository.save(member);
		return member.getId();
	}
	
	public void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
			.ifPresent(m -> {
				throw new IllegalStateException("�̹� �����ϴ� ȸ���Դϴ�.");
			});
	}
	
	/**
	 * ��ü ȸ�� ��ȸ 
	 */
	public List<Member> findMembers(){
		return memberRepository.findAll();
	}
	
	/**
	 * ���� ȸ�� ��ȸ
	 * @param memberId
	 * @return
	 */
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
}