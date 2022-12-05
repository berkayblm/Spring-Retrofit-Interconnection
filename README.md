# Spring-Retrofit-Interconne
Spring Boot and Android Retrofit Library for RESTAPI.

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
  
