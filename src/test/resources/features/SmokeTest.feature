#Author: Deepak Mahapatra
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search for a mobile on Flipkart
  As a user of Flipkart
  I want to search for a specific mobile
  So that I can view the details of the first search result

  Background:
    Given I open the browser
    And I navigate to url
@SmokeTest
  Scenario: Search and click on first mobile result
    When User enters "Apple iPhone 14 (Starlight, 128 GB)" in the search bar
    Then User clicks on the first search result
    And Mobile details page should be displayed