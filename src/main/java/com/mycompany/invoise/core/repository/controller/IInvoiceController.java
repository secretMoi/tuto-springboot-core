package com.mycompany.invoise.core.repository.controller;

import com.mycompany.invoise.core.repository.service.IInvoiceService;

public interface IInvoiceController {
    void createInvoice();
    void setInvoiceService(IInvoiceService invoiceService);
}
