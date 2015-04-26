package addressBook;

import java.util.ArrayList;

/** Description of Contact 
*
* @author Kaiwen Shen
* @version Feb 17, 2015
*/

public class Contact implements java.io.Serializable {

  /**
   * serial Version UID
   */
  private static final long serialVersionUID = 13456782L;
  /** Remember the most recent id */
  private static int lastId = 0;
  /** Identification of a Contact object */
  private int id; 
  /** contact's name (first and last ) */
  private String firstName;
  private String lastName;
  /** contact's emails */
  private ArrayList<Email> emails = new ArrayList<Email>();
  /** contact's phone numbers */
  private ArrayList<PhoneNumber> phoneNums = new ArrayList<PhoneNumber>();
  /** contact's addresses */
  private ArrayList<Address> addresses = new ArrayList<Address>();
  
  private String note;

  /** 
   * Constructor
   * construct an object from an id
   * lastId increments by 1
   *  */
  public Contact () {
    this.id = lastId+1;
    lastId ++;
  }
  /** 
   * getter of id
   *  */
  public int getId() {
    return this.id;
  }
  
  /** 
   * getter of first name
   *  */
  public String getFirstName() {
    return this.firstName;
  }
  
  /** 
   * getter of last name
   *  */
  public String getLastName() {
    return this.lastName;
  }

  /** 
   * setter of first name
   *  */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /** 
   * setter of last name
   *  */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /** 
   * getter of note
   *  */
  public String getNote() {
    return note;
  }
  
  /** 
   * setter of note
   *  */
  public void setNote(String string) {
    this.note = string;
  }

  /** 
   * add an email
   *  */
  public void addEmail(Email email) {
    this.emails.add(email);
  }

  /** 
   * add a phone number
   *  */
  public void addPhoneNum(PhoneNumber phoneNumber ) {
    this.phoneNums.add(phoneNumber);
  }

  /** 
   * add an address
   *  */
  public void addAddress(Address address) {
    this.addresses.add(address);
  }

  /** 
   * delete a Phone Number 
   * @param index, index in the array list
   * if the index out of bounds, do nothing 
   *  */
  public void deletePhoneNum(int index) {
    if ( 0<=index && index <this.phoneNums.size()) {
      this.phoneNums.remove(index);
    }else {

    }
  }

  /** 
   * delete an email 
   * @param index, index in the array list
   * if the index out of bounds, do nothing 
   *  */
  public void deleteEmail(int index) {
    if ( 0<=index && index <this.emails.size()) {
      this.emails.remove(index);
    }else {

    }
  }

  /** 
   * delete an address 
   * @param index, index in the array list
   * if the index out of bounds, do nothing 
   *  */
  public void deleteAddress(int index) {
    if ( 0<=index && index <this.addresses.size()) {
      this.addresses.remove(index);
    }else {

    }
  }
  
  /** 
   * return true if any of its fields matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean found(String keyword) {
    if(this.findInAddresses(keyword) ||
        this.findInEmails(keyword) || 
        this.findInName(keyword) ||
        this.findInPhoneNums(keyword)){
      return true;
    }else {
      return false;
    }
  }

  /** 
   * return true if any of its first/last name fields matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean findInName(String keyword) {
    if (this.getFirstName()!= null && this.firstName.contains(keyword)) {
      return true; 
    }
    if ( this.getLastName()!= null &&this.lastName.contains(keyword)) {
      return true; 
    }else {
      return false;
    }
  }

  /** 
   * return true if any of its addresses matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean findInAddresses(String keyword) {
    for (Address a : this.addresses) {
      if (a.getCountry().contains(keyword) || 
          a.getStateProvince().contains(keyword) || 
          a.getCity().contains(keyword) ||
          a.getStreet().contains(keyword) ||
          a.getType().toString().contains(keyword) ||
          a.getZipcode().contains(keyword) ) {
        return true;
      }
    }
    return false;
  }

  /** 
   * return true if any of its phone numbers matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean findInPhoneNums (String keyword) {
    for (PhoneNumber num: this.phoneNums) {
      if (num.getType().toString().contains(keyword) ||
          num.getCountryCode().contains(keyword) || 
          num.getPhoneNum().contains(keyword)) {
        return true;
      }
    }
    return false;
  }

  /** 
   * return true if any of its emails matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean findInEmails (String keyword) {
    for (Email email : this.emails) {
      if (email.getContent().contains(keyword) ||
          email.getType().toString().contains(keyword)) {
        return true; 
      }
    }
    return false;
  }

  /** 
   * return true if its note matches the keyword
   * @param keyword used by search, input by user
   *  */
  public boolean findInNote (String keyword) {
    if (this.note.contains(keyword)) {
      return true;
    }else {
      return false;
    }
  }
}
