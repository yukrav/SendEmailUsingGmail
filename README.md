# SendEmailUsingGmail
Sending Email Using Gmail using SSL


In This code, we are sending email to any email id via java code.
Email is sending via SSL.

For SSL, you must need to add SSLSocketFactory in properties as :
prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");


To run the program.
1) you must enable "Allow less secure apps" in your gmail account from which email needs to be send.
To enable "Allow less secure apps" in gmail, follow the below steps.

Turning on 'less secure apps' settings in gmail

Go to your (Google Account).
On the left navigation panel, click Security.
On the bottom of the page, in the Less secure app access panel, click Turn on access.
If you don't see this setting, your administrator might have turned off less secure app account access (check the instruction above).
Click the Save button.

2) Load the program in your code editor/IDE.
3) Execute as "Run as" java application.
4) Email will be sent to destinated emails.
