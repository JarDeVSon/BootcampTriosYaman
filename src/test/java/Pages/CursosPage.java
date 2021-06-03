package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CursosPage {
    static WebDriver driver;

    public CursosPage(WebDriver driver){
        CursosPage.driver = driver;
    }
    public void verificarAPesquisaDeCursos(){
        WebElement pesquisaCurso = driver.findElement(By.cssSelector("#searchtext"));
        pesquisaCurso.sendKeys("TESTES FUNCIONAIS WEB E MOBILE (ABRIL/2021)");

        WebElement btnBusca = driver.findElement(By.cssSelector("#btn_form_search"));
        btnBusca.click();
    }
    public void validarTiposDeCursos(){
        
    }


}
