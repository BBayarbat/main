package com.miu.contact;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class ContactManagerTest {
    @Test
    public void testAddContact() {
        ContactManager cm = new ContactManager();
        
        cm.addContact("fname", "lname", "9907370312");
        //assumeNoException(t);
        assertFalse(cm.getContractList().size() == 0);
        
    }

    @Test
    public void testGetContractList() {
        ContactManager cm = new ContactManager();
        assertTrue(cm.getContractList().size() == 0);
    }
}
