# Spring-Retrofit-Interconnection (Spring Boot v3.0.0)

Spring Boot and Android Retrofit Library for RESTAPI.

Important!
For your application to run on localhost server you need to specify this in your Application.properties file:


	<application

		android:usesCleartextTraffic="true"
	
	</application>
	
If you are running the application on an Android Emulator then you need to change the local host url as http://10.0.2.2:8080/

Android Dependecies for Retrofit:

	dependencies {

  	implementation 'com.squareup.retrofit2:retrofit:2.5.0'

 	 implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
	}

Spring Boot pom.xml Config File:
Make sure to add these two dependencies:





    <dependency>

		<groupId>org.springframework.boot</groupId>
    
		<artifactId>spring-boot-starter-data-jpa</artifactId>
      
	</dependency>

	<dependency>
    
		<groupId>mysql</groupId>
      
		<artifactId>mysql-connector-java</artifactId>
      
		<scope>runtime</scope>
      
	</dependency>
  
  
  For the application.properties file configure your own MYSQL server username and password:
  
