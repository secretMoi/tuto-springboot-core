package com.mycompany.invoise.repository;

import com.mycompany.invoise.model.Invoice;

public interface IInvoiceRepository {
    void create(Invoice invoice);
}
