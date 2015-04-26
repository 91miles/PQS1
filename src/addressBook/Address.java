package addressBook;


public class Address implements java.io.Serializable {

  /**
   * serial Version UID
   */
  private static final long serialVersionUID = 13456780L;
  /**
   * type of the address
   */
  private AddressType type; 
  private String country;
  private String stateProvince; 
  private String city; 
  private String street; 
  /** 
   * apartment number
   */
  private String aptNo; 
  private String zipcode;

  /** 
   * getter of type
   */
  public AddressType getType() {
    return type;
  }

  /** 
   * setter of type
   */
  public void setType(AddressType type) {
    this.type = type;
  }

  /** 
   * getter of country
   */
  public String getCountry() {
    return country;
  }

  /** 
   * setter of country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /** 
   * getter of stateProvince
   */
  public String getStateProvince() {
    return stateProvince;
  }

  /** 
   * setter of stateProvince
   */
  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  /** 
   * getter of city
   */
  public String getCity() {
    return city;
  }

  /** 
   * setter of city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /** 
   * getter of street
   */
  public String getStreet() {
    return street;
  }

  /** 
   * setter of street
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /** 
   * getter of aptNo
   */
  public String getAptNo() {
    return aptNo;
  }

  /** 
   * setter of aptNo
   */
  public void setAptNo(String aptNo) {
    this.aptNo = aptNo;
  }

  /** 
   * getter of zipcode
   */
  public String getZipcode() {
    return zipcode;
  }

  /** 
   * setter of zipcode
   */
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  /** 
   * Default Constructor
   */
  public Address() {

  }

  /** 
   * Constructor
   * @param type
   * @param country
   * @param stateProvince
   * @param city
   * @param street
   * @param zipcode
   */
  public Address(AddressType type, String country, 
      String stateProvince, String city, String street, String aptNo, String zipcode) {
    this.type = type;
    this.country = country; 
    this.stateProvince = stateProvince; 
    this. city = city; 
    this.street = street;
    this.aptNo = aptNo;
    this.zipcode = zipcode;
  }

}
