package Model;

public class doctor {
  private int id,specialist_id;
  private String email;
  private String password;
  private String name;
  private String phone;
  private String image;
  private String intro;
  private String gender;

  public doctor(){

  }

  public doctor(int id, int specialist_id, String email, String password, String name, String phone, String image, String intro, String gender) {
    this.id = id;
    this.specialist_id = specialist_id;
    this.email = email;
    this.password = password;
    this.name = name;
    this.phone = phone;
    this.image = image;
    this.intro = intro;
    this.gender = gender;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getSpecialist_id() {
    return specialist_id;
  }

  public void setSpecialist_id(int specialist_id) {
    this.specialist_id = specialist_id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "doctor{" +
            "id=" + id +
            ", specialist_id=" + specialist_id +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", image='" + image + '\'' +
            ", intro='" + intro + '\'' +
            ", gender='" + gender + '\'' +
            '}' + "\n";
  }
}
