Feature: adactin hotel website functionality

  Scenario Outline: 
    Book hotel and get the order number

    Given Launch the Adactin webpage
    When Enter the valid usernhaame and passwordtm
      | username | acchuthantm |
      | password |      123456 |
    When Fill all the required the details in the adactin page
    And choose a hotel in available options
    And Fill all the personal details of "<First Name>","<Last Name>","<Billing Address>"  and card details of "<Credit Card No.>","<CVV Number>" and book the hotel
    Then print the Confirmation order Number

    Examples: 
      | First Name | Last Name | Billing Address | Credit Card NO.  | CVV Number |
      | Ruban      | Suresh    | Omr,Karapakkam  | 9076655545659080|        657 |
