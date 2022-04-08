package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerMichel;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Dans quelle configuration êtes-vous ?" );
        var scanner = new Scanner(System.in);
        var configuration = scanner.nextInt();

        if(configuration == 1) {
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoice();
        }
        else if(configuration == 2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoice();
        }

    }
}
