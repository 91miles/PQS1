package addressBook;

public class Email implements java.io.Serializable {

  /**
   * serial Version UID
   */
  private static final long serialVersionUID = 13456783L;
  private EmailType type; 
  private String content; 

  /**
   * Constructor
   * @param content
   */
  public Email( String content) {
    this.content = content;
  }
  
  /**
   * Constructor
   * @param type
   * @param content
   */
  public Email(EmailType type, String content) {
    this.type = type; 
    this.content = content;
  }

  /**
   * getter of type
   */
  public EmailType getType() {
    return type;
  }

  /**
   * setter of type
   */
  public void setType(EmailType type) {
    this.type = type;
  }

  /**
   * getter of content
   */
  public String getContent() {
    return content;
  }

  /**
   * setter of content
   */
  public void setContent(String content) {
    this.content = content;
  }
  
}
