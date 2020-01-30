package com.test.cucumber.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber-features"}, glue = {"com.jorgehernandezramirez.bdd.cucumber.steps"})
public class UserTest {
}