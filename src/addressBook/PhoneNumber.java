package addressBook;

public class PhoneNumber implements java.io.Serializable {

  /**
   * serial Version UID
   */
  private static final long serialVersionUID = 13456784L;
  private PhoneNumType type; 
  private String countryCode; 
  private String phoneNum; 

  /** 
   * getter of type
   *  */
  public PhoneNumType getType() {
    return type;
  }

  /** 
   * setter of type
   *  */
  public void setType(PhoneNumType type) {
    this.type = type;
  }

  /** 
   * getter of countryCode
   *  */
  public String getCountryCode() {
    return countryCode;
  }

  /** 
   * setter of countryCode
   *  */
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /** 
   * getter of phoneNum
   *  */
  public String getPhoneNum() {
    return phoneNum;
  }

  /** 
   * setter of phoneNum
   *  */
  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  /** 
   * Default Constructor
   */
  public PhoneNumber() {

  }
  /** 
   * Constructor
   * @param type type of the telephone number
   * @param countryCode
   * @param phoneNum
   *  */
  public PhoneNumber(PhoneNumType type, String countryCode, String phoneNum) {
    this.type = type; 
    this.countryCode = countryCode; 
    this.phoneNum = phoneNum;
  }

}
