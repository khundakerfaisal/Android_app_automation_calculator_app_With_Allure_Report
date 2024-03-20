## Android_app_automation_calculator_app
## Prerequisite
- Selenium Webdriver
- Appium
- Intellij
- Android Studio
- Appium Inspector
- Gradle
- Java
## About this project
The Adobe automation is  an Android app automation using a calculator app. Here we have calculated some values and printed the value in the result window.
Selenium WebDriver is used to interact with the Android app automation, and TestNG is used to assert the expected outcomes of the tests. We have to generate 
Allure report and attached an automation video for calculating the value.

## How to run this project
- Clone this project ```github.com/khundakerfaisal/Android_app_automation_calculator_app_With_Allure_Report```
- Open Android Studio and Open the APK file:
- Set required configuration
- Hit this command in cmd for checking the connectivity with emulator : adb devices
- Open Appium Server with following command: appium 
- Open Appium Inspector
- Set desired capabilites in json format:
  ```
  {
  "platformName": "android",
  "appium:platformVersion": "11",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:app": "H:\\apk\\calculator.apk",
  "appium:automationName": "UiAutomator2"
  }```

- Open Intellij Idea
- Hit the following command into the terminal: gradle clean test
- For generating Allure Report use these commands: ```allure generate allure-results```
  ```allure serve allure-results```

## Allure Report:
![App automation page 1](https://github.com/khundakerfaisal/Android_app_automation_calculator_app_With_Allure_Report/assets/44666800/2ea55495-cdeb-4a7f-8e9e-a07367816619)
![automation page 2](https://github.com/khundakerfaisal/Android_app_automation_calculator_app_With_Allure_Report/assets/44666800/3d4fec74-89be-42d9-bf29-8e90ce2cd497)

## App automation Video
https://drive.google.com/file/d/12h8lU72KReFSQUKh16MIfpF4F-bW81BH/view?usp=sharing
