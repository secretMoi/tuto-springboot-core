package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.repository.IInvoiceRepository;

import java.util.List;

public interface IInvoiceService {
    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);
    List<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
}
