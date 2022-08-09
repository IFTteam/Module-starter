# Module-starter
This is a starter for building your own module, I have set up several most commonly used entities and repository, you can test it with the RESTAPI in TestController.java.
## Getting start
- First you should setup the mysql server and build the database use the schema provided by Yuxuan. Then update the application.yml with your database info
'''
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/email_automation
    username: your user name
    password: your password
'''
- Then you can run the application, and you can try the following POST in postman:  
'''
http://localhost:8086/test/addUser?domain=google&avatarUrl=www.google.com&companyId=123&unsubscribeLink=dawjiotawfjkpa&subsriptionType=dwadsad&createdBy=1&password_hash=123&subscriptionType=ss&unsubscribeType=32&username=aag&apiKey=12333
'''
