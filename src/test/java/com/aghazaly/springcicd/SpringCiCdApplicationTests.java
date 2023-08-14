package com.aghazaly.springcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringCiCdApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringCiCdApplication.class);

	@Test
	void contextLoads() {
		logger.info("spring boot is test case excuted");
		assertEquals(true, true);
	}

}
