package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    static WebDriver driver;

    public HomePage(WebDriver driver){
        HomePage.driver = driver;
    }

    public void verificarAcessoAoSiteDaTrios(){
    }
    public void validarAsFuncionalidadesDoSiteDaTrios(){

    }
    public void validarOCadastreSeNoSiteDaTrios(){
        WebElement cadastreSe = driver.findElement(By.cssSelector("a[class='btn-custom custom1']"));
        cadastreSe.click();
    }
    public void validarInformacaoSaibaMais(){
        WebElement saibaMais = driver.findElement(By.cssSelector("a[class='btn-custom custom2']"));
        saibaMais.click();
    }
}
