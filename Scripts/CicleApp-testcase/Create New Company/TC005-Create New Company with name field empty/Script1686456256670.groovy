import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.cicleApp, true)

Mobile.waitForElementPresent(findTestObject('CicleApp/skipLabel'), 30)

if (Mobile.verifyElementVisible(findTestObject('CicleApp/skipLabel'), 30)) {
    Mobile.tap(findTestObject('CicleApp/skipLabel'), 30, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.tap(findTestObject('CicleApp/GoToSignIn-btn'), 0)

Mobile.tap(findTestObject('CicleApp/GoogleSignIn-btn'), 0)

Mobile.waitForElementPresent(findTestObject('CicleApp/emailDummy'), 30)

if (Mobile.verifyElementVisible(findTestObject('CicleApp/emailDummy'), 30)) {
    Mobile.tap(findTestObject('CicleApp/emailDummy'), 30, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.verifyElementAttributeValue(findTestObject('CicleApp/dontOwnCompany-text'), 'content-desc', 'you don\'t own or join a company', 
    0)

Mobile.verifyElementAttributeValue(findTestObject('CicleApp/newUserStatus-text'), 'content-desc', 'you are a new user on this device and you have not joined any company, please create a new company or join another company', 
    0)

Thread.sleep(3000)

Mobile.tap(findTestObject('CicleApp/createNewCompany-btn'), 0)

Mobile.tap(findTestObject('CicleApp/CreateDesc-txtbox'), 0)

Mobile.setText(findTestObject('CicleApp/CreateDesc-txtbox'), 'This is the description', 0)

Mobile.tap(findTestObject('CicleApp/Create-btn'), 0)

Mobile.verifyElementAttributeValue(findTestObject('CicleApp/errorMessageFieldEmpty-text'), 'content-desc', 'Name and description fields must be filled', 
    0)

Mobile.closeApplication()

