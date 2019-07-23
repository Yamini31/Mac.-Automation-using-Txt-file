package SendMavenEmail.MacmillanInstructorModule;


public class XpathClass {

	public static String signin;
	public static String createacc;
	public static String firstname;
	public static String lastname;
	public static String email;
	public static String pass;
	public static String confirmpass;
	public static String secques1;
	public static String ques1;
	public static String answer1;
	public static String secques2;
	public static String answer2;
	public static String secques3;
	public static String answer3;
	public static String college;
	public static String selectfromdropdown;
	public static String checkbox1;
	public static String checkbox2;
	public static String signup;
	public static String url;
	public static String vistext2;
	public static String vistext3;
	public static String driverpathinfo;
	public static String user;
	public static String passwo;
	public static String loginbutton;

	XpathClass() {

		
		url = "https://staging.macmillan-learning.com/college/us";
		driverpathinfo = "/home/qainfotech/Downloads/chromedriver";
		signin = "//a[@href=\"/college/us/login\"]";
		
		//Register Page 
		
		createacc = "//button[@id=\"createAccount\"]";
		firstname = "//input[@id=\"firstName\"]";
		lastname = "//input[@id=\"lastName\"]";
		email = "//input[@id=\"email\"]";
		pass = "//input[@id=\"password\"]";
		confirmpass = "//input[@id=\"confirmPassword\"]";
		secques1 = "//select[@id=\"Security_Question_1__c\"]";
		ques1 = "//option[@value=\"What is the first and last name of your first boyfriend or girlfriend?\"]";
		answer1 = "//input[@id=\"Security_Question_1_Answer__c\"]";
		secques2 = "Security_Question_2__c";
		answer2 = "//input[@id=\"Security_Question_2_Answer__c\"]";
		secques3 = "Security_Question_3__c";
		answer3 = "//input[@id=\"Security_Question_3_Answer__c\"]";
		college = "//input[@class='react-autosuggest__input']";
		selectfromdropdown = "//span[text()='Fortis College']";
		checkbox1 = "//input[@id='OptIn__c']";
		checkbox2 = "//input[@id='Terms_of_Service__c']";
		signup = "//button[@id=\"signup\"]";
		vistext2 = "What street did you grow up on?";
		vistext3 = "What was your favorite place to visit as a child?";
		
		//Login Page
		
		user="//input[@id=\"username\"]";
	    passwo="//input[@id=\"password\"]";
	    loginbutton="//button[@id=\"signin\"]";
		
	}

}
