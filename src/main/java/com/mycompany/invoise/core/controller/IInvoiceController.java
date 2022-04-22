package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.service.IInvoiceService;

public interface IInvoiceController {
    void createInvoice();
    void setInvoiceService(IInvoiceService invoiceService);
}
