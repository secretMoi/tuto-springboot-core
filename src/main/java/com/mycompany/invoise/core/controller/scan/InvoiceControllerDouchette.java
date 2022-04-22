package com.mycompany.invoise.core.controller.scan;

import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.service.IInvoiceService;
import com.mycompany.invoise.core.controller.IInvoiceController;


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
