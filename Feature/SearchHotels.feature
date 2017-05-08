@SearchFeature
Feature: Title of your feature
	I want to use this template for my feature file

@Search1
Scenario: Search successfully
Given I landing on Home page
When I input keyword into Location field
	And choose Check in date
	And choose Check out date
	And select Adults option
	And select Child option
	And click Search button
Then System redirect me to Result page
	And show search results
