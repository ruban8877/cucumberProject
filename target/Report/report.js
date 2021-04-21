$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "adactin hotel website functionality",
  "description": "",
  "id": "adactin-hotel-website-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Book hotel and get the order number",
  "description": "",
  "id": "adactin-hotel-website-functionality;book-hotel-and-get-the-order-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch the Adactin webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "acchuthantm"
      ],
      "line": 6
    },
    {
      "cells": [
        "password",
        "123456"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill all the required the details in the adactin page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "choose a hotel in available options",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Fill all the personal details and card details and book the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "print the Confirmation order Number",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "summa irrra",
  "keyword": "And "
});
});