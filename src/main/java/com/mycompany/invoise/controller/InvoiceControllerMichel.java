package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.IInvoiceService;

public class InvoiceControllerMichel implements IInvoiceController {

    private IInvoiceService invoiceService;

    public void createInvoice() {
        var customerName = "Tesla";

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
