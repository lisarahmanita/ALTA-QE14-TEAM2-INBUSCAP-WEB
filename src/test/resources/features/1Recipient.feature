@Inbuscap
  Feature:    Recipient login website

    Scenario: Login with valid data recipient
      Given   User open the inbuscap web
      When    User click profile icon
      And     User choose login
      Then    User should redirected to the login page
      And     User input "recipient@gmail.com" as Email and "pass12345" as password
      When    User click login button
      Then    User should see "Hello, Welcome to Inbuscap.id"
#      Then    User see pop up "Hello, Welcome to Inbuscap.id"

  Scenario: Recipient create proposals
    Given   Login with data recipient email "recipient@gmail.com" and password "pass12345" and home page status "Hello, Welcome to Inbuscap.id"
    When    User click Create Bussiness
    Then    User redirect to create proposal page
    When    User fill proposal image "kucing.jpg", title "Jualan Kopi", description "pait banget", amount "100000000", share profit "10", file proposals "proposal.pdf"
    And     User click create proposal
    Then    User should see proposal pop up "success create post"

  Scenario: Recipient edit proposal
    Given   Login with data recipient email "recipient@gmail.com" and password "pass12345" and home page status "Hello, Welcome to Inbuscap.id"
    When    User click my bussiness
    And     User click dot
    And     User click edit proposal
    Then    User redirect to proposal detail
    When    User fill proposal edit image "kucing.jpg", title "Jualan Kopi", description "pait banget", amount "100000000", share profit "10", file proposals "proposal.pdf"
    And     User click save edit proposal
    Then    User should see proposal pop up "success update post"

  Scenario: Recipient archive proposal
    Given   Login with data recipient email "recipient@gmail.com" and password "pass12345" and home page status "Hello, Welcome to Inbuscap.id"
    When    User click my bussiness
    And     User click dot Merch Kpop
    And     User click archive proposal
    Then    User should see proposal archive pop up "Kamu Yakin Untuk Mengarsip Proposal Ini?"
    When    User click Yes button
    Then    User should see proposal pop up "success archive post"

    Scenario: Recipient delete proposal
      Given   Login with data recipient email "recipient@gmail.com" and password "pass12345" and home page status "Hello, Welcome to Inbuscap.id"
      When    User click my bussiness
      And     User click dot
      And     User click delete
      And     User click yes delete button
      Then    User should see proposal pop up "success delete post"

  Scenario: Recipient verification user
  Given   Login with data recipient email "recipient@gmail.com" and password "pass12345" and home page status "Hello, Welcome to Inbuscap.id"
  When    User click profile icon
  And     User click my profile
  And     User click verification
  Then    User redirect to verification users
  When    User fill users verification ktp "ktp.jpg", npwp "npwp.jpg", and selfie "selfie.jpg"
  And     User click save verification
  Then    User should see proposal pop up "Successfully Updated"

  Scenario: Register account user
  Given     User open the inbuscap web
  When      User click profile icon
  And       User choose register
  Then      User should redirected to the register page
  When      User fill form register fullname "Batman bin garena", email "superhero96@gmail.com", handphone "082588754665", password "pass12345", ktp "3328666667587774", npwp "5587226524512224"
  And       User click register
  Then      User should see proposal pop up "Registered Successfully"


    Scenario: Register account user by invalid data
      Given     User open the inbuscap web
      When      User click profile icon
      And       User choose register
      Then      User should redirected to the register page
      When      User fill form register fullname "Batman bin garena", email "superhero96@gmail.com", handphone "082588754665", password "pass12345", ktp "3328666667587774", npwp "5587226524512224"
      And       User click register
      Then      User should see proposal invalid pop up update  "Oops! Something went wrong."