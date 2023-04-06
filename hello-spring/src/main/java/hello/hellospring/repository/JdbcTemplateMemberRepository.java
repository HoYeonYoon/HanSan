package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import hello.hellospring.Domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository {

	private final Jdbctemplate jdbcTemplate;
	
	@Autowired
	public JdbcTemplateMemberRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
