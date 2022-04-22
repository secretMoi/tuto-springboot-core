package com.mycompany.invoise.core.repository.service;

import com.mycompany.invoise.core.repository.model.Invoice;
import com.mycompany.invoise.core.repository.IInvoiceRepository;

import java.util.List;

public interface IInvoiceService {
    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);

    List<Invoice> getInvoiceList();
}
