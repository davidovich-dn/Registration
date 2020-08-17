package com.oppabet.tests.web.utilities.businessObjects;

import java.util.Map;

public class User {

  private Integer id;
  private String country;
  private Map<Integer, String> region;
  private Map<Integer, String> city;
  private String currency;
  private String phoneNumber;
  private String email;
  private String name;
  private String surname;
  private String password;
  private String promoCode;

  public User(String country, Map<Integer, String> region, Map<Integer, String> city, String email, String name,
              String surname, String password) {
    this.country = country;
    this.region = region;
    this.city = city;
    this.email = email;
    this.name = name;
    this.surname = surname;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Map<Integer, String> getRegion() {
    return region;
  }

  public void setRegion(Map<Integer, String> region) {
    this.region = region;
  }

  public Map<Integer, String> getCity() {
    return city;
  }

  public void setCity(Map<Integer, String> city) {
    this.city = city;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    User user = (User)o;

    if (id != null ? !id.equals(user.id) : user.id != null)
      return false;
    if (country != null ? !country.equals(user.country) : user.country != null)
      return false;
    if (region != null ? !region.equals(user.region) : user.region != null)
      return false;
    if (city != null ? !city.equals(user.city) : user.city != null)
      return false;
    if (currency != null ? !currency.equals(user.currency) : user.currency != null)
      return false;
    if (phoneNumber != null ? !phoneNumber.equals(user.phoneNumber) : user.phoneNumber != null)
      return false;
    if (email != null ? !email.equals(user.email) : user.email != null)
      return false;
    if (name != null ? !name.equals(user.name) : user.name != null)
      return false;
    if (surname != null ? !surname.equals(user.surname) : user.surname != null)
      return false;
    if (password != null ? !password.equals(user.password) : user.password != null)
      return false;
    return promoCode != null ? !promoCode.equals(user.promoCode) : user.promoCode != null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (surname != null ? surname.hashCode() : 0);
//    result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
//    result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "User{"
            + "name='"
            + name
            + '\''
            + ", surname='"
            + surname
            + '\''
            + ", birthDate='"
//            + birthDate
            + '\''
            + ", password='"
            + password
            + '\''
            + ", emailAddress='"
//            + emailAddress
            + '\''
            + '}';
  }
}
