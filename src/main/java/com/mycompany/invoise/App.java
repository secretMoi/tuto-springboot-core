package com.mycompany.invoise;

import com.mycompany.invoise.controller.IInvoiceController;
import com.mycompany.invoise.service.IInvoiceService;
import com.mycompany.invoise.service.prefix.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration // fichier de config
@ImportResource("classpath:applicationContext.xml") // charge la config du fichier XML
@ComponentScan(basePackages = { // définit les implémentations à ustiliser
        "com.mycompany.invoise.controller.web",
        //"com.mycompany.invoise.service.prefix",
        "com.mycompany.invoise.repository.memory",
})
@PropertySource("application.properties") // charge le fichier de properties
public class App 
{
    public static void main( String[] args )
    {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertySource.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        var invoiceController = applicationContext.getBean(IInvoiceController.class);


        invoiceController.createInvoice();

    }

    @Bean // override l'injection de dépendance auto
    public IInvoiceService configureInvoiceService() {
        return new InvoiceServicePrefix();
    }
}
