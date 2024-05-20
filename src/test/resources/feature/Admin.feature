#@Inbuscap
#Feature: Inbuscap
#
#  Scenario: Inbuscap
#    Given User is already on Inbuscap
#    When User filter users by "Approved"

@AdminInbuscap
Feature: Admin can approved, reject and sort users status

  Scenario: Admin can approved verification users
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click users menu
    Then   Admin should redirected to users verification menu
    When   Admin click approved users data "Jeon Jekey"
    Then   Admin should see pop up kamu yakin menyetujui?
    When   Admin click Yes
    Then   Admin should see message verify "Successfully Updated"


  Scenario: Admin can reject verification users
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click users menu
    Then   Admin should redirected to users verification menu
    When   Admin click reject users data "Jeon Jungkook"
    Then   Admin should see pop up "Kamu Yakin Untuk Me-reject"
    When   Admin click Yes
    Then   Admin should see message verify "Successfully Updated"


  Scenario: Admin can sort verification user by status approved
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click users menu
    Then   Admin should redirected to users verification menu
    When   Admin click sort by approved
    Then   Admin should see status verification "Approved" for "Batman bin Superman"


  Scenario: Admin can sort verification user by status rejected
    Given   Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When    Admin click users menu
    Then    Admin should redirected to users verification menu
    When    Admin click sort by rejected
    Then    Admin should see status verification "Rejected" for "Daffa Bagus"


  Scenario: Admin can approved verification business
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click business menu
    Then   Admin should redirected to business verification menu
    When   Admin click approved business data "Jualan Bensin Mesin"
    Then   Admin should see pop up kamu yakin menyetujui?
    When   Admin click Yes
    Then   Admin should see message verify "Successfully Updated"


  Scenario: Admin can reject verification business
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click business menu
    Then   Admin should redirected to business verification menu
    When   Admin click reject business data "Jualan bensin eceran"
    Then   Admin should see pop up "Jualan bensin eceran"
    When   Admin click Yes
    Then   Admin should see message verify "Successfully Updated"


  Scenario: Admin can sort verification business by status approved
    Given  Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When   Admin click business menu
    Then   Admin should redirected to business verification menu
    When   Admin click sort by approved
    Then   Admin should see business status verification "Approved" for "Bandar Judi"


  Scenario: Admin can sort verification business by status rejected
    Given   Admin login with valid data email "admin@gmail.com" and password "pass12345"
    When    Admin click business menu
    Then    Admin should redirected to business verification menu
    When    Admin click sort by rejected
    Then    Admin should see business status verification "Rejected" for "Cake Shop"
