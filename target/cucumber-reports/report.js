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
        "john",
        "doe"
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
  "name": "user adds the coupons with \"john\" and \"doe\" and then saves",
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
  "status": "passed"
});
formatter.step({
  "name": "user selcts the created coupn and deletes the same",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationnew.user_selcts_the_created_coupn_and_deletes_the_same()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "coupon is successfully deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationnew.coupon_is_successfully_deleted()"
});
formatter.result({
  "status": "passed"
});
});