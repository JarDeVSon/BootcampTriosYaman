package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    static WebDriver driver;

    public ForumPage(WebDriver driver){
        ForumPage.driver = driver;
    }
    public void verificarBuscaNoForum(){
        WebElement buscaForum = driver.findElement(By.cssSelector("#topic_forum"));
        buscaForum.sendKeys("teste");

        WebElement btnBuscaForum = driver.findElement(By.cssSelector("i[class='fa fa-search']"));
        btnBuscaForum.click();
    }
    public void validarCategorias(){
        WebElement categorias = driver.findElement(By.cssSelector("a[href='https://triosdecapacitacao.eadplataforma.com/forum/categoria-exemplo/1/']"));
        categorias.click();
    }
    public void validarTopColaboradores(){
        WebElement colaboradores = driver.findElement(By.cssSelector("a[class='primeiro']"));
        colaboradores.click();
    }
}
