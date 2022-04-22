package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.IInvoiceController;
import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.service.IInvoiceService;

import java.util.Scanner;


public class InvoiceControllerKeyboard implements IInvoiceController {

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;

    public String createInvoice(Invoice invoice) {
        System.out.println( "What is the customer name ?" );
        Scanner scanner = new Scanner(System.in);
        var customerName = scanner.nextLine();

        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
        return null;
    }
}
