# For Parallel Execution:
        - Remove static keyword in PSM
        - Create parameterized constructor in each pages
           public LoginPage(ChromeDriver driver) {
		        this.driver=driver;
	         }
        - Pass driver value in each Constructor initialization in each pages and testcases

# POM with Excel Integration:
   - Create data folder and have the excelsheets inside 
        Login
        CreateLead
   - Create a package called utils and have the ReadExcel java class inside
   - Create sendData() and annotate with DataProvider and call the readExcel() and return 
   - Replace all the hardcoded data with input arguments in the required pages
   - In the testClasses, use dataProvider attribute to receive the data 
     and pass input arguments in the test method.
   - Create setValues() in each testclass to mention the fileName and annotate with @BeforeTest 

       
       

# POM with Cucumber:
   For TestNG _POM :
     - with driver as static -> sequential execution is possible
     - To have sequential and parallel execution declare Parameterized Constructor in each pages  
   For Cucumber_POM:
      - Constructor should not be defined 
      - With driver as static -> sequential execution is possible 

# POM with ThreadLocal:
# ThreadLocal:
   - Java class which is used to access each thread independently
   private static final ThreadLocal<ChromeDriver> chDriver = new ThreadLocal<ChromeDriver>();     
 private:
    - This variable can be accessed only within the class
 static+final
    - constant -> cannot change the value

    
	public void setDriver() {
        //Sets the current thread's copy of this thread-local variable
		chDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
        //Returns the value in the current thread's copy of this thread-local variable
		return chDriver.get();
	}

 # Encapsulation:
     - getter and setter methods   
          