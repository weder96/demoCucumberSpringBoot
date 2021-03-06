package com.wsousa.demoCucumber;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = DemoCucumberApplication.class, loader = SpringBootContextLoader.class)
public class CucumberSpringContextConfiguration {

	private static final Logger LOG = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);

	/**
	 * Need this method so the cucumber will recognize this class as glue and load spring context configuration
	 */
	@Before
	public void setUp() {
		LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}

	@Test
	void test() {
		LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}
}