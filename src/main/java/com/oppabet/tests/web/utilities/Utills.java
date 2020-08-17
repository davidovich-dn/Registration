package com.oppabet.tests.web.utilities;

import com.oppabet.tests.web.utilities.businessObjects.User;

import java.util.HashMap;
import java.util.Map;

public class Utills {

  private static String[] nickNames = {"6mohabdalla599t",
          "hisaias818",
          "8s.fox",
          "Fwinxhelgv",
          "Corayo",
          "xthe.looords",
          "omiga2007me",
          "tfarh",
          "xqqqtoby1",
          "akirankhan12",
          "3daniel.ansgar.ml",
          "0mezemate55x",
          "zanouar.gogo.54q",
          "yana-cools",
          "rero_2"};

  private static String[] emailServices = {"gmail.com",
          "hotmail.com",
          "outlook.com",
          "mail.ru",
          "ya.ru",
          "rambler.ru",
          "yahoo.com"
  };

  private static String[] names = {"Аким",
          "Алевтин",
          "Александр",
          "Алексей",
          "Альберт",
          "Альбин",
          "Альфред",
          "Богдан",
          "Боеслав",
          "Болеслав",
          "Боримир",
          "Борис",
          "Влад",
          "Владилен",
          "Владимир",
          "Владислав",
          "Джон",
          "Дионисий",
          "Дмитрий",
          "Добрыня"};

  private static String[] surnames = {"Смирнов",
          "Иванов",
          "Кузнецов",
          "Соколов",
          "Попов",
          "Лебедев",
          "Козлов",
          "Новиков",
          "Морозов",
          "Петров",
          "Волков",
          "Соловьёв",
          "Васильев",
          "Зайцев",
          "Павлов",
          "Семёнов",
          "Голубев",
          "Виноградов",
          "Богданов",
          "Воробьёв"};

  private static String[] passwords = {"Fcg6cSb4kdvfCETG",
          "D7zPGmvj6rktByFc",
          "JrBxdZQycYv8m7QW",
          "wcHHPaGjFfKwZ6vt",
          "reHKSWYYPe2p5YgX",
          "9g8LqjACTrPXxYqk",
          "qWqRBGWh3ascq2j9",
          "9DzrrcKykdYvDezs",
          "42u6QGfkUmRPkNm7",
          "bPaMx8URbYVFBKmH",
          "ua3YSu4GaRQdz5zk",
          "NMGGj7TzRWwdxCzk",
          "M3z7MSGkRh5nexn7",
          "u3dqQEnktTsZnG3h",
          "sBe3J3pZkaMBKawg"};

  private static String[] countries = {"China",
          "Canada",
          "Russia"};

  private static String generateCountry() {
    int countriesSize = countries.length;
    int randomCountry = (int) (Math.random() * countriesSize);

    return countries[randomCountry];
  }

  private static int generateRegionOrCity() {
    return (int) (Math.random() * 3);
  }

  private static String generateValidEmailAddress() {
    int nickNamesSize = nickNames.length;
    int emailServicesSize = emailServices.length;

    int randomNickNameNumber = (int) (Math.random() * nickNamesSize);
    int randomEmailServiceNumber = (int) (Math.random() * emailServicesSize);

    String s = nickNames[randomNickNameNumber] + "@" + emailServices[randomEmailServiceNumber];

    return s;
  }

  private static String generateName() {
    int namesSize = names.length;
    int randomNameNumber = (int) (Math.random() * namesSize);

    return names[randomNameNumber];
  }

  private static String generateSurname() {
    int surnamesSize = surnames.length;
    int randomSurnameNumber = (int) (Math.random() * surnamesSize);

    return surnames[randomSurnameNumber];
  }

  private static String generatePassword() {
    int passwordsSize = passwords.length;
    int randomPasswordNumber = (int) (Math.random() * passwordsSize);

    return passwords[randomPasswordNumber];
  }

  public static User generateUser() {
    Map<Integer, String> region = new HashMap<Integer, String>();
    Map<Integer, String> city = new HashMap<Integer, String>();
    region.put(generateRegionOrCity(), "");
    city.put(generateRegionOrCity(), "");

    return new User(generateCountry(),
            region,
            city,
            generateValidEmailAddress(),
            generateName(),
            generateSurname(),
            generatePassword());
  }
}
