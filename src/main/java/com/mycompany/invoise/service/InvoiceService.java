package com.mycompany.invoise.service;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.IInvoiceRepository;

public class InvoiceService implements IInvoiceService {

    private static long lastNumber = 0L;

    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
