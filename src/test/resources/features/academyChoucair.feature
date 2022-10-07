#CRISTHIAN CARRERO

@stories
  Feature: Challenge Choucair
    As user, i want write in the form of the page Utest.com for the test to enter to this great company, selecting the correct selectores.

    @scenario1
    Scenario Outline: develop and navigate the forms of the Utest.com page.
      Given there is a form to enroll information
      |firstName  |lastNname  |
      |<firstName>|<lastNname>|
      When to write in the form correct values
      | strCourse     | zipCode | password | confirmPassword |
      | <strCourse>   | <zipCode> | <password> | <confirmPassword> |
      Then the page welcomes us Welcome to the world's largest community of freelance software testers!
      Examples:
        | firstName | lastNname | strCourse | zipCode | password | confirmPassword |
        | Agon    | lastNname   | Sogamoso  | 1233    | M1C0n7r@S3Na | M1C0n7r@S3Na |
