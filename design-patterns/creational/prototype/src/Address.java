/**
 * Nested Object
 * Note: This must also be copied
 */
public class Address {
  private String city;
  private String country;

  // Constructor
  public Address(String city, String country) {
    this.city = city;
    this.country = country;
  }

  // Deep copy Constructor
  public Address(Address other) {
    this.city = other.city;
    this.country = other.country;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
