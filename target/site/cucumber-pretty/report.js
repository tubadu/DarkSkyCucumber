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
  "duration": 3255953473,
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
  "duration": 216316854,
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
  "duration": 1160862698,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point (720, 1026)\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027tubas-MBP.lan\u0027, ip: \u00272605:6000:1516:4081:0:0:0:8edc%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/yb/krnghls1475...}, goog:chromeOptions: {debuggerAddress: localhost:62548}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b0710aebdf19ae125e48e7859cddeec8\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat runnerTest.Webpages.HomePage.temperature(HomePage.java:26)\n\tat stepDefinition.HomePageSD.clickToday(HomePageSD.java:20)\n\tat ✽.When I click today area on homepage(HomePage.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSD.getTemperature()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSD.getMinTemp()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSD.getMaxTemp()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSD.verifyminTemp()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSD.verifyMaxTemp()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1530037894,
  "status": "passed"
});
});