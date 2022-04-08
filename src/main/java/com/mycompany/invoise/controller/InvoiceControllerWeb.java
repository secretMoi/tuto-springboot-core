package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.IInvoiceService;

public class InvoiceControllerWeb implements IInvoiceController {

    private IInvoiceService invoiceService;

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice() {
        var customerName = "Tesla";

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
