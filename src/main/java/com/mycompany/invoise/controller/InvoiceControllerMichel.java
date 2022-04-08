package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceControllerMichel {
    public void createInvoiceUsingWebForm() {
        var customerName = "Tesla";

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);

        var invoiceServiceMichel = new InvoiceServiceMichel();
        invoiceServiceMichel.createInvoice(invoice);
    }
}
