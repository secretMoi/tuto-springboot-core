package com.mycompany.invoise.service;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.IInvoiceRepository;

public class InvoiceServiceMichel implements IInvoiceService {

    private static long lastNumber = 112L;

    private IInvoiceRepository invoiceRepository;

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber("INV_" + ++lastNumber);
        invoiceRepository.create(invoice);
    }
}
