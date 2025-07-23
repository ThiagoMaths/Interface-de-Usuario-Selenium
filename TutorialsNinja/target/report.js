$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Resgistraion functionality scenarios",
  "description": "",
  "id": "resgistraion-functionality-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify whether the user able to register into the application by providing all the details",
  "description": "",
  "id": "resgistraion-functionality-scenarios;verify-whether-the-user-able-to-register-into-the-application-by-providing-all-the-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    },
    {
      "line": 3,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I lauch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to account registration page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Ravi"
      ],
      "line": 8
    },
    {
      "cells": [
        "LastName",
        "Kiran"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email",
        "ravi.kiran@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Telephone",
        "91221223344"
      ],
      "line": 11
    },
    {
      "cells": [
        "Password",
        "test1"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select the Privacy Policy",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see that the User account has successfully created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});