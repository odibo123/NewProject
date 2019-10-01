Feature: GuruBank LOgin App Test

  Scenario Outline: To test user can login with ease
    Given user opens browser
    Then user is on Login Page
    Then user log into app by entering valid  "<userId>" and "<password>"
    #Then user login to app
    #Then Home Page is displayed
    #Then user validate Home Page title
    #Then user validate userId

    Examples: 
      | userId     | password |
      | mngr225336 | judEtEt  |

  #Scenario Outline: To test user is unable to login by entering invalid data
    #Given user opens browser
    #Then user is on Login Page
    #When user enters invalid details in  "<userId>" and "<password>"
   #Then user sees an error message
#
    #Examples: 
      #| userId     | password |
      #| mnr225338  | judEtEt  |
      #| mngr225336 | juyt546  |
      #| m#gr225336 | juyt546  |
      #|            |          |
