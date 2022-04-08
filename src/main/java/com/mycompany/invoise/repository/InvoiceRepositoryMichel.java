package com.mycompany.invoise.repository;

import com.mycompany.invoise.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel implements IInvoiceRepository {

    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
