package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product milk = new Product("milk");
        Product butter = new Product("butter");
        Product tea = new Product("tea");
        Product eggs = new Product("eggs");

        Item itemMilk = new Item(milk, new BigDecimal(12), 2);
        Item itemButter = new Item(butter, new BigDecimal(9),1);
        Item itemTea = new Item(tea, new BigDecimal(23),1);
        Item itemEggs = new Item(eggs, new BigDecimal(1),10);

        Invoice invoice = new Invoice("2021/01/05/1231");

        itemMilk.setInvoice(invoice);
        itemButter.setInvoice(invoice);
        itemTea.setInvoice(invoice);
        itemEggs.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemButter);
        items.add(itemMilk);
        items.add(itemTea);
        items.add(itemEggs);


        invoice.setItems(items);



        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int size = invoice.getItems().size();

        //Then
        assertNotEquals(0,id);
        assertEquals(4, size);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}

