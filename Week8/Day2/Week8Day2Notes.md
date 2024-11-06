# Today's Agenda:
        - Explicit Wait
        - Framework Walkthrough


# Wait:
    -  Implicit Wait
          - It is a global wait
          - All findElement() and findElements() are affected by implicit wait
          - After reaching the max limit if the element is not found findElement() throws
            NoSuchElementException

    -  Thread.sleep       
          - It will sleep for the whole duration mentioned particularly
            for a piece of code
          - Not recommended

     - ExplicitWait
          - It is used to wait for the element's behaviour
          - It is used to wait for a certain condition is met or not
                 - visibilityOf()
                 - invisibilityOf()
                 - alertIsPresent()
                 - stalenessOf()
                 - elementToBeClickable()
                 - numberOfWindowsToBe()


           - Polling Interval
                 - 500ms
                 - It will poll for each 500ms for the total duration mentioned
                 - After the max time if the element's behaviour is not met
                   then it will TimeOutException

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 

      StaleElementReferenceException:
         - Thread.sleep()
         - WebDriverWait   

# Framework:
       - Architect(6 -8 yrs of exp)      
       - If it is to automate Web application
             - Selenium-Java 
             - TestNG - to manage the test runs
             - Cucumber - to support BDD
             - POM - design pattern
             - Apache POI 
             - Aventstack

 Description:
       - Hybrid Framework
          supports both TestNG + Cucumber
          design pattern - POM          
              - Selenium-Java 
             - TestNG - to manage the test runs
             - Cucumber - to support BDD
             - POM - design pattern
             - Apache POI 
             - Aventstack


 Components:
      - com.framework.selenium.design
              - Browser
                  It is an Interface which has all unimplemeneted methods related to browser
              - Element
                  It is an Interface which has all unimplemented methods related to Element

      - com.framework.selenium.base
              - SeleniumBase
                  It acts as the wrapper class(It has its own customized methods built on 
                  top of Selenium library)
                  It is the heart of our framework
                  where proper exception handling is done
                  It implements Browser and Element Interfaces
                  It is a class which has all the reusable methods 
                 
              - DriverInstance
                   It is to maintain the driver instances specifically
                   where it has all the configurations to avoid thread conflict between the driver access 

       - com.framework.testng.base
              - ProjectSpecificMethods
                   This class has all the methods specific to the project            
              - RetryEngine
                    This class is used to retry the failed tests automatedly 

       - com.framework.utils
             - DataLibrary 
                  Read the data from th excel sheet
             - Reporter
                  to deal with ExtentReport

       - com.framework.pages
             - It has classes for each page

       - com.framework.testcases     
             - It has classes for each testcase     


   Hierarchy:
           AbstractTestNGCucumberTests
              DriverInstance
                Reporter
                  SeleniumBase
                    ProjectSpecificMethods
                      pages
                      testcases

# Execution flow:
 @BeforeSuite            -------------> startReport()  

    @BeforeTest         -------------> setValues()

       @BeforeClass      ------------> testCaseDetails()  

          @DataProvider  ------------> sendData()   

             @BeforeMethod  ---------> preCondition() 

                @Test      ----------> runLogin() , runCreateLead()

             @AfterMethod  ----------> postCondition()

       @AfterClass       ------------> Nil

    @AfterTest          -------------> NIL

@AfterSuite             -------------> NIL                                     


              


