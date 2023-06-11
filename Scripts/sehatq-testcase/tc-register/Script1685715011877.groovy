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
import groovy.transform.ThreadInterrupt as ThreadInterrupt
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.apkPath, true)

Thread.sleep(5000)

// doing swipe from right to left
int startX = ((Mobile.getDeviceWidth() * 0.70) as int)

int endX = ((Mobile.getDeviceWidth() * 0.30) as int)

int startY = Mobile.getDeviceHeight() / 2

Mobile.swipe(startX, startY, endX, startY)

Thread.sleep(2000)

Mobile.swipe(startX, startY, endX, startY)

Mobile.tap(findTestObject('SehatQ/HalamanUtama-btn'), 50)

Thread.sleep(5000)

Mobile.waitForElementPresent(findTestObject('SehatQ/PopUpClose-btn'), 50)

Thread.sleep(3000)

if (Mobile.verifyElementVisible(findTestObject('SehatQ/PopUpClose-btn'), 50)) {
    Mobile.tap(findTestObject('SehatQ/PopUpClose-btn'), 50, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.tap(findTestObject('SehatQ/Profil-btn'), 0)

Mobile.tap(findTestObject('SehatQ/Daftar-btn'), 0)

Thread.sleep(5000)

Mobile.setText(findTestObject('SehatQ/Nama Lengkap-txtbox'), 'Rebecca', 0)

Mobile.tap(findTestObject('SehatQ/JenisKelamin-DropDown'), 0)

Mobile.tap(findTestObject('SehatQ/Perempuan-btn'), 0)

Mobile.setText(findTestObject('SehatQ/Email-txtbox'), 'fivoco2019@onlcool.com', 0)

Mobile.setEncryptedText(findTestObject('SehatQ/Password-txtbox'), 'nRNRMtlYKkE=', 0)

Mobile.tap(findTestObject('SehatQ/Policy-checkbox'), 0)

Mobile.tap(findTestObject('SehatQ/android.widget.Button - Daftar (1)'), 0)

Mobile.delay(50, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SehatQ/Lanjutkan-btn'), 0)

Mobile.tap(findTestObject('SehatQ/Skip-btn'), 0)

Mobile.tap(findTestObject('SehatQ/YesConfirmation-btn'), 0)

Thread.sleep(5000)

Mobile.closeApplication()

