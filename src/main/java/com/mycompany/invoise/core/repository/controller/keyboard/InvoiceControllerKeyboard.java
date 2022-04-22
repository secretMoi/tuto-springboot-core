package com.mycompany.invoise.core.repository.controller.keyboard;

import com.mycompany.invoise.core.repository.controller.IInvoiceController;
import com.mycompany.invoise.core.repository.model.Invoice;
import com.mycompany.invoise.core.repository.service.IInvoiceService;

import java.util.Scanner;


public class InvoiceControllerKeyboard implements IInvoiceController {

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;

    public void createInvoice() {
        System.out.println( "What is the customer name ?" );
        Scanner scanner = new Scanner(System.in);
        var customerName = scanner.nextLine();

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
