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

WebUI.navigateToUrl('https://www.baliarda.com.ar/')

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Vida con Salud/a_CONTACTO'))

WebUI.setText(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Contacto/input_Error de validacion en el formulario_Name'), 
    'Juan Cruz')

WebUI.setText(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Contacto/input_Error de validacion en el formulario_Email'), 
    'juancmouhape@gmail.com')

WebUI.setText(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Contacto/input_Error de validacion en el formulario_Phone'), 
    '2494887766')

WebUI.setText(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Contacto/input_Error de validacion en el formulario_Subject'), 
    'Prueba Visual testing')

WebUI.setText(findTestObject('Object Repository/VisualTesting/Page_Baliarda S.A. - Contacto/textarea_Error de validacion en el formular_4358bd'), 
    'Descripcion')

WebUI.takeScreenshotAsCheckpoint('imagenComparadora')

WebUI.closeBrowser()

