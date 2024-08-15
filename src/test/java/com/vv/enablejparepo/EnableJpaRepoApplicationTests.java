package com.vv.enablejparepo;

import com.vv.enablejparepo.repository.MyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EnableJpaRepoApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		// Verify that the repository bean is loaded
		assertThat(applicationContext.getBean( MyRepository.class ) ).isNotNull();
	}
}
