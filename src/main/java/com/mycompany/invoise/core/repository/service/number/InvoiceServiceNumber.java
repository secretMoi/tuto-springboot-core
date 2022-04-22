package com.mycompany.invoise.core.repository.service.number;

import com.mycompany.invoise.core.repository.model.Invoice;
import com.mycompany.invoise.core.repository.IInvoiceRepository;
import com.mycompany.invoise.core.repository.service.IInvoiceService;

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

    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
