package com.mycompany.invoise.controller;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.IInvoiceService;

public class InvoiceControllerDouchette implements IInvoiceController {
    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;

    @Override
    public void createInvoice() {
        System.out.println("Utilise la douchette");

        Invoice invoice = new Invoice();
        invoice.setCustomerName("clientX");
        invoiceService.createInvoice(invoice);
    }
}
