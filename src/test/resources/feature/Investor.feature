@Inbuscap
Feature: Investor

  Scenario: Investor can update profile with valid data
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click my profile
    Then    Investor should redirected to profile page
    When    Investor click button edit
    And     Investor upload image
    And     Investor update full name "jungkook", no ktp "1777886777141700" and npwp "1777886777141700"
    And     Investor click save button

  Scenario Outline: User can't update profile with invalid data
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click my profile
    Then    Investor should redirected to profile page
    When    Investor click button edit
    And     Investor update email "<email>", no ktp "<noktp>", no hp "<hp>" and npwp "<npwp>"
    And     Investor click save button
    Then    Investor should get Error Update Message "<message>"
    Examples:
      | email | noktp | hp  | npwp | message                          |
#      | investor@gmail |          |        |         | Not a valid email                |
      |       | 2747  |     |      | Ktp Number minimum length is 16  |
      |       |       | 081 |      | Phone Number minimum length is 8 |
      |       |       |     | 1111 | NPWP Number minimum length is 16 |

  Scenario: Investor can Top Up
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click my profile
    Then    Investor should redirected to profile page
    When    Investor click Top Up
    And     Investor select bank and input amount 2000000
    And     Investor click send button
    Then    Investor should see summary top up "Status : pending"
    And     Investor click close button top up

  Scenario: Investor can't Top Up with invalid amount
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click my profile
    Then    Investor should redirected to profile page
    When    Investor click Top Up
    And     Investor select bank and input amount 0
    And     Investor click send button
    Then    Investor should get message "amount is required"


  Scenario: Investor can make an investment
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click see all business
    And     Investor see Detail "Merch Kpop"
    And     Investor click invest button
    And     Investor input jumlah invest "3000000"
    And     Investor click Go Invest
    Then    Investor should redirected to invested Business Page

  Scenario: Investor can't make an investment with null amount
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click see all business
    And     Investor see Detail "Merch Kpop"
    And     Investor click invest button
    And     Investor input jumlah invest "0"
    And     Investor click Go Invest
    Then    Investor should get message "amount is required"

  Scenario: Investor can't make an investment if amount > saldo
    Given   Investor open the inbuscap web
    When    Investor input "jekey@gmail.com" as Email and "pass12345" as password
    And     Investor click login button
    Then    Investor should redirected to the home page
    When    Investor click see all business
    And     Investor see Detail "Merch Kpop"
    And     Investor click invest button
    And     Investor input jumlah invest "310000000"
    And     Investor click Go Invest
    Then    Investor should get pop up message "amount > saldo"
















