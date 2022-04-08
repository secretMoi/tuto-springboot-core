package com.mycompany.invoise;

import com.mycompany.invoise.model.Invoice;
import com.mycompany.invoise.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the customer name ?" );
        Scanner scanner = new Scanner(System.in);
        var customerName = scanner.nextLine();

        var invoice = new Invoice();
        invoice.setCustomerName(customerName);
        var invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}
