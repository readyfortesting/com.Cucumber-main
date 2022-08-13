@gmibankSifre
Feature: GMIBank Guvenli Sifre

  Background:
    Given kullanici gmibank sayfasina gider
    Then gmibank gmibank giris butonuna tiklar
    And gmibank register butonuna tiklar
    And gmibank password kutusuna tiklar

  Scenario Outline: Password Red Test
    Then "<password>" girer
    Then gmibank Password strength red gorur.

    Examples:
      |password|
      |1111    |
      |AAAA    |

  Scenario Outline: Password Orange Test
    Then "<passwordOrange>" girer
    Then gmibank Password strength orange gorur.

    Examples:
      |passwordOrange|
      |11AA    |
      |AAaa    |

  Scenario Outline: Password Yellow Test
    Then "<password>" girer
    Then gmibank Password strength yellow gorur.

    Examples:
      |password|
      |11Aa    |
      |++Aa    |

  Scenario Outline: Password Green Test
    Then "<passwordYellow>" girer
    Then gmibank Password strength green gorur.

    Examples:
      |passwordYellow|
      |1Aa+    |
      |Aa1+    |
