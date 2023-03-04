package com.actitime.testscript;
	    import java.io.IOException;
        import org.apache.poi.EncryptedDocumentException;
		import org.testng.Assert;
		import org.testng.Reporter;
		import org.testng.annotations.Listeners;
		import org.testng.annotations.Test;

		import com.actitime.generic.BaseClass;
		import com.actitime.generic.FileLib;
		import com.actitime.pom.HomePage;
		import com.actitime.pom.TaskListPage;

		@Listeners(com.actitime.generic.ListenerImplementation.class)
		public class ProjectModule extends BaseClass{

			@Test
			public void testCreateProject() throws InterruptedException,EncryptedDocumentException,IOException {
				String customerProjectName = f.getExcelData("Sheet1", 1, 3);
				String customerProjectDescription=f.getExcelData("Sheet1", 1, 5);
				Reporter.log("CreateProject",true);	
				HomePage h=new HomePage(driver);
				h.setTasks();
				TaskListPage t=new TaskListPage(driver);
                t.getAddNewBtn().click();
				t.getCreateNewProject().click();
				t.getEnterProjectName().sendKeys(customerProjectName);
				t.getCustomerDropDown().click();
				t.getOurCompanySelected().click();
				t.getAddProjectDescription().sendKeys(customerProjectDescription);
				t.getCreateProjectBtn().click();
			    Thread.sleep(4000);
				String actualCustomerProjectName=t.getActualProjectCreated().getText();
			    Assert.assertEquals(actualCustomerProjectName, customerProjectName);
			}	
		}


