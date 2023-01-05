package com.jpa.querydsl;

import com.jpa.querydsl.repository.TcSidoInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuerydslApplicationTests {
	@Autowired
	TcSidoInfoRepository repository;
	@Test
	void contextLoads() {
		System.out.println(repository.findAll());
	}

}
