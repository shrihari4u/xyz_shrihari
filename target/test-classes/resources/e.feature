Feature: Test FaceBook login functionality

  Scenario: Check login is successful with given credentials
  Given open facebook
  When enter emailid
  Then enter password
  Then click on Login
  And search some one
  Then click on logout button
  
 
