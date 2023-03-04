package com.actitime.pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class TaskListPage {
		
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
		
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
		
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement createNewProject;
	
    @FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
private WebElement enterProjectName;
    
    @FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --' and @class='emptySelection']")
    private WebElement customerDropDown;
    
    @FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
    private WebElement ourCompanySelected;
    
    @FindBy(xpath="//textarea[@placeholder='Add Project Description']")
    private WebElement addProjectDescription;
    
    @FindBy(xpath="//div[text()='Create Project']")
    private WebElement createProjectBtn;
    
    @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
    private WebElement actualProjectCreated;
    
    @FindBy(xpath="//div[@class='item createNewTasks']")
    private WebElement createNewTask;
    
    @FindBy(xpath="//div[text()='- Select Customer -' and@class='emptySelection']")
    private WebElement selectCustomerDropDownTask;
    
    @FindBy(xpath="//div[text()='Our company' and@class='itemRow cpItemRow ']")
    private WebElement selectOurCompanyTask;
    
    @FindBy(xpath="//div[text()='- Select Project -' and @class='emptySelection']")
    private WebElement selectProjectDropDownTask;
    
    @FindBy(xpath="//div[text()='BankingProject' and@class='itemRow cpItemRow selected']")
    private WebElement SelectBankingProjectTask;
    
    @FindBy (xpath="(//td[@class='nameCell first'])[8]")
    private WebElement EnterTaskName;
    
    @FindBy(xpath="//div[text()='Create Tasks']")
    private WebElement createTask;
    
    @FindBy(xpath="(//div[@class='title'])[1]")
    private WebElement actualTaskName;
    
    
    
    
 public WebElement getCreateNewTask() {
		return createNewTask;
	}


	public WebElement getSelectCustomerDropDownTask() {
		return selectCustomerDropDownTask;
	}


	public WebElement getSelectOurCompanyTask() {
		return selectOurCompanyTask;
	}


	public WebElement getSelectProjectDropDownTask() {
		return selectProjectDropDownTask;
	}


	public WebElement getSelectBankingProjectTask() {
		return SelectBankingProjectTask;
	}


	public WebElement getEnterTaskName() {
		return EnterTaskName;
	}


	public WebElement getCreateTask() {
		return createTask;
	}


	public WebElement getActualTaskName() {
		return actualTaskName;
	}


public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	
	public WebElement getActualProjectCreated() {
		return actualProjectCreated;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCreateNewProject() {
		return createNewProject;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}

	public WebElement getOurCompanySelected() {
		return ourCompanySelected;
	}

	public WebElement getAddProjectDescription() {
		return addProjectDescription;
	}

	

	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
}









