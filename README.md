
[details="Details"]
This Extension Creates Paytm Payment using this method

[[Free/OS] Paytm Payment API Custom Amount - Guides / Resources - Kodular Community](https://community.kodular.io/t/free-os-paytm-payment-api-custom-amount/120966)

[/details]


[details="Instruction and Blocks"]
> ![image|367x185, 75%](upload://jEd3cKc1IPRWCG7sjoB5WBmpatl.png) 
**Parameters**

    name: DomainUrl
    type: text
 
    "name": "OrderId",
    "type": "number"
  
    "name": "CustomerId",
    "type": "number"
  
    "name": "Amount",
    "type": "number"

>![image|328x124, 75%](upload://nek5H91YgbnwcVDJEqUF0cGOTWv.png) 
 Gives The Generated Link
 

[/details]

[details="Setup"]
#### Steps For Test Payment

1. Create An Account in Paytm Business
![image|690x336, 50%](upload://cWWV5vv9vdrplanloxjXOvZX4sy.jpeg)  

2. After Creating Sign In With Your Password and Email/Phone Number
![image|690x275, 50%](upload://b4yEilEwVm4hQ9j3d8JE9swOyj9.jpeg) 

3. It would ask OTP 
![image|690x265, 50%](upload://oAsB80j074xlRqh6p8y81a8A4Hu.jpeg) 

4.Paytm Dashboard Would Appear
![image|690x317, 50%](upload://tDIWMRl6WSkphgxcuUS7S0i5vNp.png) 

5.Click On Developer Settings
![image|690x335, 50%](upload://rTrYOOlSLpG5WbjDceEDxVbgERJ.png) 

6. Click on API Keys 
![image|690x298, 50%](upload://r2T1w3kHN4sN3Ar7agDIbHIyIz.png) 

7. Click On Generate Test API Keys 
![image|619x482, 50%](upload://d09XPVsdydCKBFdeM2QvZVxqqGI.png) 

8. After generating Merchant Id And Merchant Keys 
Copy The Details To Notepad 

9. Edit The Details in `C:\Users\Asus\Downloads\PaytmTestScript\PaytmTestScript\lib\config-paytm.php`

![image|690x219, 75%](upload://eKLkDg5CkY0BaCutVboO2C9lTnl.png) 

10. Upload To Your Hosting The Full Script
I use AwardSpace 
11. Upload To Your Hosting The Full Script
I use AwardSpace 
![image|121x58, 75%](upload://118o7iiqadEONoGKFjs1A4lr5A7.png)

12. Copy The https://example.com/PaytmExtension/pgRedirect.php

13. Paste the URL in The DomainURL

File structure
![image|690x228](upload://uXFjyFxOj3vUYeiq8QkB6EMjYX9.png) 
<hr>

#### Steps For Production Payment
1. Create An Account in Paytm Business
![image|690x336, 50%](upload://cWWV5vv9vdrplanloxjXOvZX4sy.jpeg)  

2. After Creating Sign In With Your Password and Email/Phone Number
![image|690x275, 50%](upload://b4yEilEwVm4hQ9j3d8JE9swOyj9.jpeg) 

3. It would ask OTP 
![image|690x265, 50%](upload://oAsB80j074xlRqh6p8y81a8A4Hu.jpeg) 

4.Paytm Dashboard Would Appear
![image|690x317, 50%](upload://tDIWMRl6WSkphgxcuUS7S0i5vNp.png) 

5.Click On Developer Settings
![image|690x335, 50%](upload://rTrYOOlSLpG5WbjDceEDxVbgERJ.png) 

6. Click on API Keys 
![image|690x298, 50%](upload://r2T1w3kHN4sN3Ar7agDIbHIyIz.png) 

7. Click On Generate Production API Keys 


8. After generating Merchant Id And Merchant Keys 
Copy The Details To Notepad 

10. Edit The Details in `C:\Users\Asus\Downloads\PaytmProductionScript\PaytmProductionScript\lib\config-paytm.php`
![image|690x219, 75%](upload://eKLkDg5CkY0BaCutVboO2C9lTnl.png) 

11. Upload To Your Hosting The Full Script
I use AwardSpace 
![image|121x58, 75%](upload://118o7iiqadEONoGKFjs1A4lr5A7.png)

12. Copy The https://example.com/PaytmExtension/pgRedirect.php

13. Paste the URL in The DomainURL

[/details]




[details="Usage"]
### This Extension Can Be Used with The Inbuilt Component WebView Like This
![image|690x389, 75%](upload://h6nE1Kj5GxcpXGIP6Fsfom5Kctr.png) 

To Get The Success or Failure Event Use this
![image|690x301](upload://vG12MjF46xPwNgaNTubet4RYBmx.png) 
 

[/details]


[details="Files"]
Test Script : - [PaytmTestScript.zip|attachment](upload://iQmmXjFR9kvCWugbeVIuPEXFlqx.zip) (6.3 KB) 
Production Script : - [PaytmProductionScript.zip|attachment](upload://6OQWEppGDRxts5EX3cqzBH5fWqI.zip) (6.4 KB) 
AIX :- [Paytm.aix|attachment](upload://7LKAcJ4t1TnUNCGPrn9ZulnHR2D.aix) (4.4 KB) 
APK:- [FilthyJadeMoth.apk|attachment](upload://x5saT5q6EesfMGnjVn6FC09rU4a.apk) (5.2 MB) 
AIS :- [FilthyJadeMoth_Screen1.ais|attachment](upload://cOu256UJ05bTEKLkU9kM2I7sqka.ais) (4.3 KB) 
[/details]



[details="Credits"]
Paytm by @One97
:kodular:odular by @Kodular
[Appetize.io](http://appetize.io/) By @Appetize
AwardSpace By @AwardSpace

[/details]


# Liked My Work Hit The Like button :+1:
