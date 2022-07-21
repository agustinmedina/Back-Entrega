# Backend made with Spring boot framework for Argentina Program


### This is the Portfolio UML

[![UML](https://i.ibb.co/TRRBHJR/portfolio.png "UML")](https://i.ibb.co/TRRBHJR/portfolio.png "UML")

I will provide a summary of the full version written by Written by Nam Ha Minh 2022:
https://www.codejava.net/frameworks/spring-boot/spring-security-jwt-authentication-tutorial

### **Summary**

**JSON Web Token:**

JSON Web Token (JWT) is widely used for securing REST APIs, in terms of securely transmitting tokens along with HTTP requests, which facilitates stateless and secure communication between REST clients and API backend.

[![jwt](https://www.codejava.net/images/articles/frameworks/springboot/jwt-auth/JWT_request_response.png "jwt")](https://www.codejava.net/images/articles/frameworks/springboot/jwt-auth/JWT_request_response.png "jwt")

When a REST client invokes a protected API end point, it should put a JWT in the Authorization header of the request. If the server could verify the token, the request will be handled. Otherwise an HTTP status 401 (Unauthorized) is returned.

This is a Java Maven project based on the following technologies:Spring Boot, Spring Web, Spring Security, Spring Data JPA, MySQL JDBC, Spring Validation, JSON Web Token.




**Spring Security Filters chain:**

It's also important to understand how Spring Security works at a glance, in order to understand how to implement JWT Authentication with Spring. When a client sends a request to the server, the request will go through a sequence of filters before reaching the destination servlet which is actually responsible for processing the request. Let’s look at the following diagram:

[![filter](https://www.codejava.net/images/articles/frameworks/springboot/jwt-auth/spring_security_filters_chain.png "filter")](https://www.codejava.net/images/articles/frameworks/springboot/jwt-auth/spring_security_filters_chain.png "filter")

The Spring Web framework plugs in a special filter called FilterChainProxy that picks a chain of internal filters used by Spring Security, depending on the application’s security configuration. Each filter in the Spring Security filters chain is responsible for applying a specific security concern to the current request.

We need to insert our own custom filter (e.g. JWT Token Filter) in the middle of Spring Security filters chain. This filter will check availability and verify integrity of the access token. If the token is verified, the request is passed through the downstream filters and finally reaching the destination handler. Otherwise, an Unauthorized error should be raised.

**Required Dependencies:**

[![dependencias](https://i.ibb.co/pn687dw/dependencia.png "dependencias")](https://i.ibb.co/pn687dw/dependencia.png "dependencias")


**REST APIs with Spring Data JPA:**

We don't use classic web so disable CSRF and no session management needed. For early testing, all the requests are allowed without authentication.

- Get 
- Post
- Update
- Delete by id
- Save in MySQL database

**JWT Token Utility Class(JwtTokenUtil)**:

Here, the generateAccessToken() method creates a JSON Web Token with the following details:
- Subject is a combination of the user’s ID and email, separated by a comma.
- Issuer name is *
- The token is issued at the current date and time
- The token should expire after 24 hours
