package com.wsousa.demoCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

/**
 * To run cucumber test
 */
@RunWith(Cucumber.class)
@CucumberContextConfiguration
@CucumberOptions(features = "classpath:api", plugin = {"pretty", "json:target/cucumber-report.json"})
public class CucumberTest {

}
