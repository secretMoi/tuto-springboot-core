package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.service.IInvoiceService;
import com.mycompany.invoise.core.repository.IInvoiceRepository;

import java.util.List;


public class InvoiceServiceNumber implements IInvoiceService {

    private static long lastNumber = 0L;

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }

    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
