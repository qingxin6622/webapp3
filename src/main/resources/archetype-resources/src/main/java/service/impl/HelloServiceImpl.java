package ${groupId}.${artifactId}.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ${groupId}.${artifactId}.service.HelloService;


@Component("helloService")
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;

	@Override
	@Transactional
	public List<Long> list() {
		return sqlSession.<Long>selectList("${groupId}.demo");
	}

}
