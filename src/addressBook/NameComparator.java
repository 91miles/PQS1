package addressBook;

import java.util.Comparator;

public class NameComparator implements Comparator<Contact> {

  @Override
  public int compare (Contact c1, Contact c2) {
    String name1 = c1.getLastName()+' '+c1.getFirstName();
    String name2 = c2.getLastName()+' '+c2.getFirstName();
    return name1.compareTo(name2);
  }

}
