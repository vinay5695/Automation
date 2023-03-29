Feature: Test functionality of ReqRes Api
For sample testing we should check the functionality of ReqRes api
@api
Scenario: Get List Users of ReqRes Api
Given Give the domain name of reqres
When send the get request with the resource url of reqres
Then validate the response code of reqres
@api
Scenario: Get single User of ReqRes Api
Given Give the domain name of reqres
When send the get request with the single resource url of reqres
Then validate the response code get of reqres
@api
Scenario: Get single user not found of ReqRes Api
Given Give the domain name of reqres
When send get request in server of reqres
Then validate the negative response code of reqres
@api
Scenario: Get delayed response of ReqRes Api
Given Give the domain name of reqres
When Get delayed response in server of reqres
Then validate the response code of reqres
@api
Scenario: delete a User of ReqRes Api
Given Give the domain name of reqres
When delete user in server of reqres
Then validate the delete response code of reqres
