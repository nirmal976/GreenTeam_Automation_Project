Feature: As a user I am able to check the total price with shipment 

Scenario Outline: Login with data table 

	Given As a User I can Open any Browser 
	And As a User I can enter "http://automationpractice.com/index.php"
	And As a User I can clik on the modual Sign in 
	And As a user I can enter Valid "<UserName>" & "<PassWard> "
	And As a user I can clik the Sign in button 
	And As a user I am able to verify the title "My account - My Store" 
	When As a user I can able to click Upper left corner (Dresses) Link 
	And As a user I am able to print all the price 
	And As a user I can select Second dress on that list 
	And As a user I am able to click Add to cart button 
	And As a user I am able to click on proceed to checkout 
	And As a user I am able to see the total price with shipping 
	And As a user I am able to click on signout button 
	Then As a user I am able to verify the Logout title "Order - My Store" 
	And close the browser 
	
	
	Examples: 
		|UserName          		|  PassWard	|			
		|deyaryan976@gmail.com  | nirmal976 |
		
		
		
