package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {

    public void createInvoiceUsingConsole() {
        System.out.println( "What is the customer name ?" );
        Scanner scanner = new Scanner(System.in);
        var customerName = scanner.nextLine();

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);

        var invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}
