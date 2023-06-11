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

Thread.sleep(3000)

Mobile.tap(findTestObject('CicleApp/skipLabel'), 0)

Mobile.tap(findTestObject('CicleApp/GoToSignIn-btn'), 0)

Thread.sleep(3000)

Mobile.tap(findTestObject('CicleApp/GoogleSignIn-btn'), 0)

Mobile.waitForElementPresent(findTestObject('CicleApp/WennaEmail'), 30)

Thread.sleep(3000)

if (Mobile.verifyElementVisible(findTestObject('CicleApp/WennaEmail'), 30)) {
    Mobile.tap(findTestObject('CicleApp/WennaEmail'), 30, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.tap(findTestObject('CicleApp/sekolahQA-btn'), 0)

Mobile.tap(findTestObject('CicleApp/add-btn'), 0)

Thread.sleep(3000)

Mobile.tap(findTestObject('CicleApp/addTeam-btn'), 0)

Mobile.tap(findTestObject('CicleApp/CreateName-txtbox'), 0)

Mobile.setText(findTestObject('CicleApp/CreateName-txtbox'), 'team-02', 0)

Mobile.tap(findTestObject('CicleApp/CreateDesc-txtbox'), 0)

Mobile.setText(findTestObject('CicleApp/CreateDesc-txtbox'), 'ini deskripsinya', 0)

Thread.sleep(3000)

Mobile.tap(findTestObject('CicleApp/Create-btn'), 0)

'Tidak dapat membuat card baru, karena rollnya dianggap tidak eligible untuk membuat card'
Mobile.verifyElementAttributeValue(findTestObject('CicleApp/errorMessage-label'), 'content-desc', 'Http status error [401], you will be redirected to the sign-in page after 3 seconds ', 
    0)

Mobile.closeApplication()

