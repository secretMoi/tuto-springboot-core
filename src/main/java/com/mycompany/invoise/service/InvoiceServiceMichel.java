package com.mycompany.invoise.service;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryMichel;

public class InvoiceServiceMichel {

    private static long lastNumber = 112L;

    private InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();

    public void createInvoice(Invoice invoice) {
        invoice.setNumber("INV_" + ++lastNumber);
        invoiceRepositoryMichel.create(invoice);
    }
}
