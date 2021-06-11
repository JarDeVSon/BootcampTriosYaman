package Pages.Login;

import Aplicacao_WEB.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    static WebDriver driver;
    public LoginPage(WebDriver driver){
        LoginPage.driver = driver;
    }

    public void verificarOPreenchimentoDoEmail(){
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("jardounifanor@gmail.com");
    }
    public void verificarOPreenchimentoDaSenha(){
        WebElement senha = driver.findElement(By.cssSelector("#senha"));
        senha.sendKeys("1996$jrd");
    }
    public void validarOLembreMeDaConta(){
        WebElement lembreMe = driver.findElement(By.cssSelector("input[name='remember']"));
        lembreMe.click();
    }
    public void validarOAcessoAContaNoSiteDaTrios(){
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("jardounifanor@gmail.com");
        WebElement senha = driver.findElement(By.cssSelector("#senha"));
        senha.sendKeys("1996$jrd");
        WebElement entrar = driver.findElement(By.cssSelector("#btn_login"));
        entrar.click();
    }
    public void validarORedirecionamentoDeEsqueceuSuaSenha(){

        WebElement esqueceuSenha = driver.findElement(By.cssSelector("a[href='#lembrarsenha']"));
        esqueceuSenha.click();

        WebElement recuperarSenha = driver.findElement(By.cssSelector("#email-redefine-password"));
        recuperarSenha.sendKeys("sasasas@email.com");
        WebElement btnEnviar = driver.findElement(By.cssSelector("#btnRedefinePassword"));
        btnEnviar.click();
    }
    public void validarORedirecionamentoDeNaoConsegueSeAutenticar(){
        WebElement seAutenticar = driver.findElement(By.cssSelector("a[href='#autenticacao']"));
        seAutenticar.click();
        WebElement recuperarSenha = driver.findElement(By.cssSelector("input[placeholder='Digite seu E-mail...']"));
        recuperarSenha.sendKeys("shuahsuahs@email.com");
        WebElement btnEnviar = driver.findElement(By.cssSelector("#btn_confirmacao"));
        btnEnviar.click();
    }
}
