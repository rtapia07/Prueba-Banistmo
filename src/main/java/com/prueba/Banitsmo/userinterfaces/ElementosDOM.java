package com.prueba.Banitsmo.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class ElementosDOM extends PageObject {

    public static final Target BTNPRODUCTS = Target.the("botonproductosServicios").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));
    public static final Target BTNCREDIT = Target.the("btnprestamos").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a"));
    public static final Target FORMCARLOANS = Target.the("CuentaComercial").located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[2]/h2/a"));
    public static final Target BTNRATES = Target.the("Documentos").located(By.xpath("//*[@id=\"filialTabs\"]/li[4]/a"));
    public static final Target BTNDOWLOADCONTRACT = Target.the("Pdf").located(By.xpath("//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/span/a/img"));
}