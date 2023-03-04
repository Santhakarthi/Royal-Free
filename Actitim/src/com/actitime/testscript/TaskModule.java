package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass{

@Test
	public void testCreateTask() throws InterruptedException,EncryptedDocumentException,IOException {
		String TaskName = f.getExcelData("Sheet1", 1, 6);
		Reporter.log("createTask",true);	
		HomePage h=new HomePage(driver);
		h.setTasks();
		TaskListPage t=new TaskListPage(driver);
		Thread.sleep(2000);
        t.getAddNewBtn().click();
        Thread.sleep(2000);
        t.getCreateNewTask().click();
        Thread.sleep(2000);
        t.getSelectCustomerDropDownTask().click();
        Thread.sleep(2000);
        t.getSelectOurCompanyTask().click();
        Thread.sleep(2000);
        t.getSelectProjectDropDownTask().click();
        Thread.sleep(2000);
        t.getSelectBankingProjectTask().click();
        Thread.sleep(2000);
        t.getEnterTaskName().sendKeys(TaskName);
        Thread.sleep(2000);
        t.getCreateTask().click();
       Thread.sleep(4000);
   	String actualTaskName = t.getActualTaskName().getText();
   	Assert.assertEquals(actualTaskName, TaskName);
   	}
}