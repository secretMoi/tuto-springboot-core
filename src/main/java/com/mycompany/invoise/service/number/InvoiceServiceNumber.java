package com.mycompany.invoise.service.number;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.IInvoiceRepository;
import com.mycompany.invoise.service.IInvoiceService;
import org.springframework.stereotype.Service;


public class InvoiceServiceNumber implements IInvoiceService {

    private static long lastNumber = 0L;

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
