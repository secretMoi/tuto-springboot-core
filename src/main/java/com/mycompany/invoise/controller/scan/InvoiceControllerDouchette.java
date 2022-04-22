package com.mycompany.invoise.controller.scan;

import com.mycompany.invoise.controller.IInvoiceController;
import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.IInvoiceService;
import org.springframework.stereotype.Controller;

@Controller
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
