$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:elearningregistration.feature");
formatter.feature({
  "name": "Registration of elearning website",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "http://elearningm1.upskills.in/index.php the_url_opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration.http_elearningm_upskills_in_index_php_the_url_opened(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tagreg"
    }
  ]
});
formatter.step({
  "name": "user clicks signup button",
  "keyword": "When "
});
formatter.match({
  "location": "Registration.user_clicks_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the form with values \"firstname\" \"lastname\" \"email\" \"code\" \"username\" \"pass\" \"confirm\" \"phone\" \"language\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.user_fills_the_form_with_values(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks register button",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.user_clicks_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:elearningregistrationnew.feature");
formatter.feature({
  "name": "Registration of elearning website and coupon creation and deletion",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tagregnew"
    }
  ]
});
formatter.step({
  "name": "user logins with his credentials \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.step({
  "name": "lands on the dashboard page",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks coupons link on the page",
  "keyword": "Then "
});
formatter.step({
  "name": "user adds the coupons with \"\u003ccouponname\u003e\" and \"\u003ccode\u003e\" and then saves",
  "keyword": "When "
});
formatter.step({
  "name": "coupons names are successfully created",
  "keyword": "Then "
});
formatter.step({
  "name": "user edits the selected coupon and then saves the same",
  "keyword": "When "
});
formatter.step({
  "name": "the edited coupons are successfully saved",
  "keyword": "Then "
});
formatter.step({
  "name": "user selcts the created coupn and deletes the same",
  "keyword": "When "
});
formatter.step({
  "name": "coupon is successfully deleted",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "couponname",
        "code"
      ]
    },
    {
      "cells": [
        "john1",
        "doe1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tagregnew"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logins with his credentials \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnew.user_logins_with_his_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "lands on the dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "Registrationnew.lands_on_the_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks coupons link on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationnew.user_clicks_coupons_link_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds the coupons with \"john1\" and \"doe1\" and then saves",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnew.user_adds_the_coupons_with_and_and_then_saves(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "coupons names are successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationnew.coupons_names_are_successfully_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user edits the selected coupon and then saves the same",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnew.user_edits_the_selected_coupon_and_then_saves_the_same()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the edited coupons are successfully saved",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationnew.the_edited_coupons_are_successfully_saved()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"form-coupon\"]/div/table/tbody/tr[2]\"}\n  (Session info: chrome\u003d100.0.4896.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-C8FU4M02\u0027, ip: \u0027192.168.0.174\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\001ZBY~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62114}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9fdb8bba85d16ccf013c531bd8d25193\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"form-coupon\"]/div/table/tbody/tr[2]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefinitions.Registrationnew.the_edited_coupons_are_successfully_saved(Registrationnew.java:144)\r\n\tat ✽.the edited coupons are successfully saved(file:elearningregistrationnew.feature:30)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user selcts the created coupn and deletes the same",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnew.user_selcts_the_created_coupn_and_deletes_the_same()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "coupon is successfully deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationnew.coupon_is_successfully_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});