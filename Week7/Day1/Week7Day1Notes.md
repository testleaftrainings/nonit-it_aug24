
# Steps to implement Hooks:
   - Create a package called hooks and create a class called HooksImplementation
   - Create 2 methods preCondition() and postCondition() and annotate with @Before and @After 
   - The HooksImplementatio class should extends BaseClass
   - In the Runner class inside glue attribute mention hooks package as well
        glue ={"steps","hooks"}


# Tags:
   - It is used to categorize the scenarios

     tags="@smoke"   )// only smoke scenarios will be executed
     tags="not @smoke") // to exclude a scenario from execution
     tags="@smoke or @functional")// To run scenarios that have either of the tags
     tags="@functional and @regression" )//To run scenarios which has both the tags



# Page Object Model - Design Pattern:
    Design Pattern -> Best Practices to code
     - pom.xml -> Project Object Model
     - POM     -> Page Object Model


# Pages
   - LoginPage
       enterUsername
         - return this
       enterPassword
       clickLoginButton
         - return new WelcomePage()
   - WelcomePage
        clickCRMSFALink
   - MyHomePage
       clickLeadsLink
   - MyLeadsPage
       clickCreateLeadLink
       clickFindLeadsLink
       clickMergeLeadsLink
   - CreateLeadPage
       enterCompanyName
       enterFirstName
       enterLastName
       clickSubmitButton
    - ViewLeadPage
       verifyLeads
       clickEditButton
       clickDeleteButton
       clickDuplicateButton                         
  
# Steps to Implement POM:
  1. Create a new Project and have all the dependencies inside the pom.xml
  2. Create 3 packages inside src/main/java
      - base
         Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition()
         and annotate with @BeforeMethod and @AfterMethod
         Create static driver as a global variable 
      - pages
         Create 6 classes for each page
         Each Classes inside pages package should extends ProjectSpecificMethods
         Create methods for each action inside each page
         Inside each method add return statement according to the page navigation
            if an action stays in the sama page -> return this
            if an action takes you to another page -> return new Page();
      - testcases  
          All classes inside the testcase package should extend ProjectSpecificMethods
          Create a class called RunLogin
          Create a method called runLogin and annotate with @Test
          Create object for LoginPage and call the method and execute