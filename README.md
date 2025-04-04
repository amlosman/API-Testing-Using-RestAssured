# API Automation Framework Using RestAssured
  This project automates API tests for the Pet Store API (https://petstore.swagger.io/).
  It uses the following tools and frameworks:
 
 ##### API Testing:
 Java, Maven, TestNG, Rest-Assured.

 
 ### Prerequisites
 Before running the project, ensure the following tools and dependencies are installed:
 
 Java JDK (version 8 or higher)
 
 Eclipse/Intellij IDE (or any other Java IDE)
 
 Maven (for dependency management)

 TestNG (for test execution)
 ##### Project Structure 
* Utilities Package: This package contains 
* Readers Package: To read files
* EndPoint Package: To add Endpoint
* APIUtilies Package: Contain

    * RestHelper class
    * EndPointUtiles class
* allure.properties: Contain Allure config
* API Package: Contain API Tests
* Recourse package: Contains test data files
 ##### Project Setup
 1. Clone the Repository
 Clone this repository to your local machine:
  
 2. Install Dependencies Maven will automatically download the required dependencies. If not, run the following command in the project root directory:
 
          mvn clean install
 #### Running the Tests
 1. Running API Tests
 To run the API tests, use the following commands:
 
 Run all API tests:
 
           mvn test -Dtest=APITests
          
2. Generate Report from terminal 
 
          mvn allure:serve