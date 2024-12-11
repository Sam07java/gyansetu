Feature: User on login page and login with valid and invalid inputs from Excel "<Shortname>" and "<RowNumber>"

  Scenario Outline: Validate login with external data sheet
    Given User is on the signing page
    When I fetch login data from "<Shortname>" and <RowNumber>
    Then Validate login for each dataset

    Examples:
      | Shortname | RowNumber |
      | Sheet1    | 0         |
      | Sheet1    | 1         |
      | Sheet1    | 2         |
      | Sheet1    | 3         |
      | Sheet1    | 4         |
      | Sheet1    | 5         |
      | Sheet1    | 6         |
      | Sheet1    | 7         |

