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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.takeScreenshotAsCheckpoint('Practice Form')

WebUI.setText(findTestObject('Object Repository/Set_text/Page_DEMOQA/input_Name_firstName'), 'Juan Cruz')

WebUI.delay(tiempo)

WebUI.clearText(findTestObject('Set_text/Page_DEMOQA/input_Name_firstName'))

WebUI.sendKeys(findTestObject('Set_text/Page_DEMOQA/input_Name_firstName'), 'Pedro')

WebUI.delay(tiempo)

WebUI.check(findTestObject('Set_text/Page_DEMOQA/label_Male'))

WebUI.delay(tiempo)

WebUI.scrollToElement(findTestObject('Set_text/Page_DEMOQA/label_Sports'), tiempo)

WebUI.check(findTestObject('Set_text/Page_DEMOQA/label_Sports'))

WebUI.delay(tiempo)

WebUI.click(findTestObject('Set_text/Page_DEMOQA/Link'))

WebUI.delay(tiempo)

WebUI.closeBrowser()

