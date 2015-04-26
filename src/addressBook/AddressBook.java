package addressBook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;


public class AddressBook implements java.io.Serializable {

  /**
   * serial Version UID
   */
  private static final long serialVersionUID = 13456781L;
  private ArrayList<Contact> contacts = new ArrayList<Contact>();

  /** 
   * get a Contact object by its id
   * @param id
   */
  public Contact getContactById (int id) {
    for (Contact contact : this.contacts) {
      if (contact.getId() ==id) {
        return contact;
      }
    }
    return null;
  }

  /** 
   * search for a contact
   * @param keyword input by user
   * @return all the contacts which match the keyword, stored in an array list
   */
  public ArrayList<Contact> search(String keyword) {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    for (Contact contact : this.contacts) {
      if (contact.found(keyword)) {
        contacts.add(contact);
      }
    }
    return contacts;
  }
  /** 
   * write the address book to file
   * @param obj
   * @param filename, the name of storage file
   * @throws IOException
   */
  static public void serialize (AddressBook obj, String filename) 
      throws IOException{
    FileOutputStream fileOut =
        new FileOutputStream(filename);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(obj);
    out.close();
    fileOut.close();
  }

  /** 
   * read the address book from a file
   * @param filename, the name of storage file
   * @return the AddressBook object
   * @throws Exception
   */
  static public AddressBook deserialize(String filename) 
      throws Exception {
    FileInputStream fileIn = new FileInputStream(filename);
    ObjectInputStream in = new ObjectInputStream(fileIn);
    AddressBook obj = (AddressBook) in.readObject();
    in.close();
    fileIn.close();
    return obj;
  }

  /**
   * add a contact to the Address Book 
   * @param contact
   */
  public void addContact (Contact contact){
    this.contacts.add(contact);
    Collections.sort(this.contacts, new NameComparator());
  }

  /** 
   * getter of contacts
   * @return the array list of contacts
   */
  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  /** 
   * delete a contact by its id
   * @param id
   * if the id not exist, do nothing 
   */
  public void deleteContact (int id){
    Contact contact = this.getContactById(id);
    if (contact == null){
      this.contacts.remove(contact);
    }

  }

  static public void main (String[] args) throws Exception {

  }

}
