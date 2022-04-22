package com.mycompany.invoise;

import com.mycompany.invoise.controller.IInvoiceController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var invoiceController = applicationContext.getBean(IInvoiceController.class);


        invoiceController.createInvoice();

    }
}
