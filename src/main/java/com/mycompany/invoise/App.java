package com.mycompany.invoise;

import com.mycompany.invoise.controller.IInvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerKeyboard;
import com.mycompany.invoise.controller.InvoiceControllerDouchette;
import com.mycompany.invoise.controller.InvoiceControllerWeb;
import com.mycompany.invoise.repository.IInvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoise.service.IInvoiceService;
import com.mycompany.invoise.service.InvoiceServiceNumber;
import com.mycompany.invoise.service.InvoiceServicePrefix;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Quel controleur (keyboard, web, douchette) ?" );
        var scanner = new Scanner(System.in);
        var controllerType = scanner.nextLine();

        System.out.println( "Quel service (number, prefix) ?" );
        var serviceType = scanner.nextLine();

        System.out.println( "Quel repo (memory, database) ?" );
        var repositoryType = scanner.nextLine();

        IInvoiceController invoiceController = null;
        switch (controllerType) {
            case "keyboard":
                invoiceController = new InvoiceControllerKeyboard();
                break;

            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;

            case "douchette":
                invoiceController = new InvoiceControllerDouchette();
                break;
        }

        IInvoiceService invoiceService = null;
        switch (serviceType) {
            case "number":
                invoiceService = new InvoiceServiceNumber();
                break;

            case "prefix":
                invoiceService = new InvoiceServicePrefix();
                break;
        }

        IInvoiceRepository invoiceRepository = null;
        switch (repositoryType) {
            case "memory":
                invoiceRepository = new InvoiceRepositoryMemory();
                break;

            case "database":
                invoiceRepository = new InvoiceRepositoryDatabase();
                break;
        }

        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();

    }
}
