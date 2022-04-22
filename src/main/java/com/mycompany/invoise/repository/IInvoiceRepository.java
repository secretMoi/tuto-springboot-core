package com.mycompany.invoise.repository;

import com.mycompany.invoise.model.Invoice;

import java.util.List;

public interface IInvoiceRepository {
    void create(Invoice invoice);
    List<Invoice> list();
}
