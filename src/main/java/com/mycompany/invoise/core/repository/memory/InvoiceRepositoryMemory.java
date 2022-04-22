package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.model.Invoice;
import com.mycompany.invoise.core.repository.IInvoiceRepository;

import java.util.ArrayList;
import java.util.List;


public class InvoiceRepositoryMemory implements IInvoiceRepository {

    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("NUM_1");
        invoice1.setCustomerName("EDF");

        Invoice invoice2 = new Invoice();
        invoice1.setNumber("NUM_2");
        invoice1.setCustomerName("Helia");

        return List.of(invoice1, invoice2);
    }

    @Override
    public Invoice getById(String number) {
        Invoice invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setCustomerName("EDF");

        return invoice;
    }
}
