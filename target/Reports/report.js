$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "adactin hotel website functionality",
  "description": "",
  "id": "adactin-hotel-website-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book hotel and get the order number",
  "description": "",
  "id": "adactin-hotel-website-functionality;book-hotel-and-get-the-order-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch the Adactin webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Fill the valid usename and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Fill all the required the details in the adactin page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "choose a hotel in available options",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fill all the personal details and card details and book the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "print the Confirmation order Number",
  "keyword": "Then "
});
formatter.match({
  "location": "StepExection.launch_the_Adactin_webpage()"
});
formatter.result({
  "duration": 110363368202,
  "status": "passed"
});
formatter.match({
  "location": "StepExection.fill_the_valid_usename_and_password()"
});
formatter.result({
  "duration": 7415558175,
  "status": "passed"
});
formatter.match({
  "location": "StepExection.fill_all_the_required_the_details_in_the_adactin_page()"
});
formatter.result({
  "duration": 8759512021,
  "status": "passed"
});
formatter.match({
  "location": "StepExection.choose_a_hotel_in_available_options()"
});
formatter.result({
  "duration": 1811471689,
  "status": "passed"
});
formatter.match({
  "location": "StepExection.fill_all_the_personal_details_and_card_details_and_book_the_hotel()"
});
formatter.result({
  "duration": 6033653098,
  "status": "passed"
});
formatter.match({
  "location": "StepExection.print_the_Confirmation_order_Number()"
});
formatter.result({
  "duration": 415560406,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.all({By.id: order_no,By.name: order_no})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RUBAN-PC\u0027, ip: \u0027192.168.43.86\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.support.pagefactory.ByAll.findElement(ByAll.java:58)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getAttribute(Unknown Source)\r\n\tat org.step.StepExection.print_the_Confirmation_order_Number(StepExection.java:90)\r\n\tat ✽.Then print the Confirmation order Number(FeatureFile/Login.feature:15)\r\n",
  "status": "failed"
});
});