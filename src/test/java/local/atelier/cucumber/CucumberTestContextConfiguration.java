package local.atelier.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import local.atelier.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
