$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "HomePage feature",
  "description": "",
  "id": "homepage-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 18237220943,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Darksky HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verifyTitle()"
});
formatter.result({
  "duration": 239870790,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify min max temperature",
  "description": "",
  "id": "homepage-feature;verify-min-max-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click today area on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I get temperatures on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I get min temperature on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I get max temperature on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify min temperature on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I verify max temperature on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.clickToday()"
});
formatter.result({
  "duration": 3092095815,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getTemperature()"
});
formatter.result({
  "duration": 747124684,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMinTemp()"
});
formatter.result({
  "duration": 99212,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMaxTemp()"
});
formatter.result({
  "duration": 66558,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyminTemp()"
});
formatter.result({
  "duration": 21301825,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMaxTemp()"
});
formatter.result({
  "duration": 19970200,
  "status": "passed"
});
formatter.after({
  "duration": 106239202,
  "status": "passed"
});
});