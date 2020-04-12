$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AllFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Test CRM Application",
  "description": "",
  "id": "test-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "creating contacts",
  "description": "",
  "id": "test-crm-application;creating-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify user name appears on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_launches_browser()"
});
formatter.result({
  "duration": 15151417200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.click_on_login_button()"
});
formatter.result({
  "duration": 4678936599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_login_credentials()"
});
formatter.result({
  "duration": 749159900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionClass.verify_user_name_appears_on_home_page()"
});
formatter.result({
  "duration": 1106425100,
  "status": "passed"
});
});