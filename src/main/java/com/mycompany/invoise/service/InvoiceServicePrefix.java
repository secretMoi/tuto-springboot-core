package com.mycompany.invoise.service;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.IInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceServicePrefix implements IInvoiceService {

    private long lastNumber;
    private String prefix;

    @Autowired
    private IInvoiceRepository invoiceRepository;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(prefix + ++lastNumber);
        invoiceRepository.create(invoice);
    }
}
