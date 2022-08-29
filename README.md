# UITestsBelong

***Coding assignment - Cucumber scenario***
Write feature file , step definitions and pages for any two of the below requirements 

Site URL: http://automationpractice.com/

1.	While registering, if the email address is incorrect. User should see an error message
2.	Check whether Megamenu works (Dresses -> Summer dresses)
3.	On the Summer dresses page, select a dress(Quick view) and change the color (Blue) and then add the item to cart, Validate	whether same product name, color and quantity are displayed in Cart Summary page.

Once you finish assignment, please raise a PR on your Branch 

If you have write access issues, please push changes to your personal account and share.

*************************************************************************
note from author(anup) of the assignment
````
project
|   pom.xml
|   Readme.md
| 
\---src
    \---test
        +---java
        |    +---autoapp.automation
        |    |    +---features
        |    |    |
        |    |    +---pages
        |    |    |
        |    |    +---runner
        |    |    |
        |    |    +---stepDef
        |    |    |
        |    |    +---utlity
        |        
        +---resources


````

3 assignments are structured in feature files + step definitions + page object model(Pom)

####	1. While registering, if the email address is incorrect. User should see an error message
1. Register.feature file is <b>re-used</b>
2. Error message is parametrised in the feature file (incase the error message changes in the future)
3. Even Registrationpage is <b>re-used</b>
4.  Even RegisterStepDef is <b>re-used</b>

####   2. Check whether Megamenu works (Dresses -> Summer dresses)
1. Created new feature file to verify if the Megamenu works
2. created new pages SummerDressesPage & <b>reused</b> BasePage
3. created new step definitions

####   3. On the Summer dresses page, select a dress(Quick view) and change the color (Blue) and then add the item to cart, Validate	whether same product name, color and quantity are displayed in Cart Summary page.
1. Created new feature file to verify if the summary cart
2. created reused pages SummerDressesPage & created new page SummaryCartPage
3. created new step definitions & reused some new step definitions
4. the feature file has a parametrised value of quantity (dynamic) - if the tester wants to test with different quantity he will be able to do so
5. There is an extra validation included ( which is to validate the size - this is dynamic as well )
6. handled switch to frame while coming as different frame to select the blue colour
7. added data table and relative xpaths
