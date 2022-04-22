package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.model.Invoice;

import java.util.List;

public interface IInvoiceRepository {
    void create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
}
