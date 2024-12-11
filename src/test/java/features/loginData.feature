Feature:Checking Login Fuctionality

  Scenario Outline: User on login page and login with valid and invalid inputs
    Given Navigate to Gyansetu Login Page
    When The user enter sheet "<username>" and "<password>"
    Then click login button on gyasetu

    Examples:
      | username                | password  |
      | sameersponnad@gmail.com | Same@1234 |
      | sameers@gmail.com       | Same@1234 |
      | Ekansh@gmail.com        | Riya@123  |
      | anushakabeer@gmail.com  | Anu@97sha |
      | sali1233@gmail.com      | Sali@123  |