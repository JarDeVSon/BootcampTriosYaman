package Pages.Cursos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursosPage {

    static WebDriver driver;

    public CursosPage(WebDriver driver){
        CursosPage.driver = driver;
    }
    public void verificarAPesquisaDeCursos(){
        WebElement pesquisarCurso = driver.findElement(By.cssSelector("#searchtext"));
        pesquisarCurso.sendKeys("TESTES FUNCIONAIS WEB E MOBILE (ABRIL/2021)");

        WebElement btnBusca = driver.findElement(By.cssSelector("#btn_form_search"));
        btnBusca.click();
    }
    public void validarTiposDeCursos(){

        WebElement tiposCursos = driver.findElement(By.cssSelector(".fa-list-ul"));
        tiposCursos.getText();
    }


}
