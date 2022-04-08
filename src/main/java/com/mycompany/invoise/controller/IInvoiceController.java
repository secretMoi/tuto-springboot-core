package com.mycompany.invoise.controller;

import com.mycompany.invoise.service.IInvoiceService;

public interface IInvoiceController {
    void createInvoice();
    void setInvoiceService(IInvoiceService invoiceService);
}
