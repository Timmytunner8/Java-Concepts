package com.example.SOLID;

import java.math.BigDecimal;

// A class should have one, and only one, reason to change.
public class SingleResponsibility {
    
}

class Invoice {
    BigDecimal calculateTotal() {return new BigDecimal(100);}
}

class InvoiceRepository {
    void save(Invoice inv) { System.out.printf("Saving invoice: %s%n", inv); }
}

class InvoicePrinter {
    void print(Invoice inv) { System.out.printf("Printing invoice: %s%n", inv); }
}