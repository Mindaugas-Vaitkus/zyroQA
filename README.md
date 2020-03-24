# zyroQA
QA Engineer (Mid/Senior) task

Identify 3 most critical user flows, write your insights and send the description.
Automate one of those flows - create E2E test (use any automation tool you like).
Commit the source to a public repository (GitHub) and send the link.
It would be nice to have a live demo.

LINK:
https://zyro.com/

Most critical work flows:

1. User can sign up
	Test Case:
  		- Navigate to https://zyro.com/
  		- Click 'Join Zyro' button
  		- Enter email address
  		- Click 'Continue' button
  		- Enter password
  		- Enter your name
  		- Click 'Create Account' button
	Expected Result:
  		- User should be able to enter email address / password / name
  		- User should be able to click 'Continue' button and it should lead to next step
  		- User should be welcomed with closable overlay (https://zyro.com/welcome)
  		- User should be promoted to choose template with closable overlay (https://zyro.com/websites)
  		- User should be signed in and redirected to https://zyro.com/sites
  
2. User can sign in
	Test Case:
 		- Navigate to https://zyro.com/
 		- Click 'Sign In' button
 		- Enter email address
 		- Enter password
 		- Click 'Sign In' button
	Expected Result:
 		- User should be able to enter email address / password
 		- User should be able to click 'Sign In' button
 		- User should be signed in
 		- User should be redirected to https://zyro.com/sites
 		
3. User can create and access website
	Test Case:
		- Navigate to https://zyro.com/
		- Sign in
		- Click 'Create a free website' button
		- Choose template
		- Mouse hover chosen template
		- Click 'Start Building' button
		- Click 'Publish site' button
		- Enter non existing domain name
		- Click 'Continue' button
		- Click 'View Your Site' button
	Expected Result:
		- User should be able to select template
		- User should be able to enter domain name
		- User should be able to publish and access website