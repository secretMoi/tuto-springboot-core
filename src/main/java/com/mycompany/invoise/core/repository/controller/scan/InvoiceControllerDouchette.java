package com.mycompany.invoise.core.repository.controller.scan;

import com.mycompany.invoise.core.repository.controller.IInvoiceController;
import com.mycompany.invoise.core.repository.model.Invoice;
import com.mycompany.invoise.core.repository.service.IInvoiceService;


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
