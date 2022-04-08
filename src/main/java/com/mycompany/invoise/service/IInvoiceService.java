package com.mycompany.invoise.service;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.IInvoiceRepository;

public interface IInvoiceService {
    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);
}
