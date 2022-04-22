package com.mycompany.invoise;

import com.mycompany.invoise.controller.IInvoiceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // englobe les anciennes annotations
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);
        var invoiceController = applicationContext.getBean(IInvoiceController.class);

        invoiceController.createInvoice();

    }
}
