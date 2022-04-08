package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.IInvoiceService;

import java.util.Scanner;

public class InvoiceController implements IInvoiceController {

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
