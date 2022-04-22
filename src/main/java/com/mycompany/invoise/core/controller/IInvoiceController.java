package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.service.IInvoiceService;

public interface IInvoiceController {
    String createInvoice(Invoice invoice);
    void setInvoiceService(IInvoiceService invoiceService);
}
