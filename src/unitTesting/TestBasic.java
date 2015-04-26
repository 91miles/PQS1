package unitTesting;

import java.io.IOException;
import java.util.ArrayList;

import addressBook.Address;
import addressBook.AddressBook;
import addressBook.AddressType;
import addressBook.Contact;
import addressBook.Email;
import addressBook.EmailType;
import addressBook.PhoneNumType;
import addressBook.PhoneNumber;

public class TestBasic {

  static public void main (String[] args) throws Exception {

    Email e1 = new Email(EmailType.home, "email1@gmail.com");
    Email e2 = new Email(EmailType.other, "email2@gmail.com");

    PhoneNumber num1 = new PhoneNumber(PhoneNumType.home,"01","911");
    PhoneNumber num2 = new PhoneNumber(PhoneNumType.other,"86","110");

    Address addr1 = new Address(AddressType.home, "US", "NY", "New York", 
        "55 Broadway", "", "10012");
    Address addr2 = new Address(AddressType.home, "US", "NY", "Brooklyn", 
        "418 60 St", "", "11220");

    Contact contact1 = new Contact();
    contact1.setFirstName("Sam");
    contact1.setLastName("Smith");
    contact1.addAddress(addr1);
    contact1.addAddress(addr2);
    contact1.addEmail(e1);
    contact1.addEmail(e2);
    contact1.addPhoneNum(num1);
    contact1.addPhoneNum(num2);

    Contact contact2 = new Contact();
    contact2.setFirstName("Kobe");
    contact2.setLastName("James");

    Contact contact3 = new Contact();
    contact3.setFirstName("Zorro");
    contact3.setLastName("Zorro");
    
    Contact contact4 = new Contact();
    contact4.setFirstName("Ali");
    contact4.setLastName("Baba");
    
    AddressBook book = new AddressBook();
    book.addContact(contact1);
    book.addContact(contact2);
    book.addContact(contact3);
    book.addContact(contact4);

    AddressBook.serialize(book, "storage");

    System.out.println("Start Testing...");
    AddressBook bookCopy = AddressBook.deserialize("storage");
    if (bookCopy.search("Sam").size()!=0) {
      System.out.println(bookCopy.search("Sam").get(0).getLastName());
    }
    if (bookCopy.search("Kobe").size()!=0) {
      System.out.println(bookCopy.search("Kobe").get(0).getLastName());
    }
    if (bookCopy.search("11220").size()!=0) {
      System.out.println(bookCopy.search("11220").get(0).getLastName());
    }
    if (bookCopy.search("Kevin").size()==0) {
      System.out.println("Could not find Kevin. ");
    }
    
    for ( Contact c : bookCopy.getContacts()) {
      System.out.println(c.getLastName()+", "+c.getFirstName());
    }
    ArrayList<Contact> contacts = bookCopy.getContacts();
    System.out.println(bookCopy.getContacts().get(0).getFirstName());
    //contacts.get(0).setFirstName("New First Name");
    System.out.println(bookCopy.getContacts().get(0).getFirstName());
    
    //    assert bookCopy.search("Sam") != null;
    //    assert bookCopy.search("Kobe") != null;
    //    assert bookCopy.search("11220") != null;
    //    assert bookCopy.search("Kevin") == null;
  }


}
