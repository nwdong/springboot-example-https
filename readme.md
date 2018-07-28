# overview
- spring-boot-starter-web is the main dependency for hosting
- HttpsListenerService is for http listener
- application.properties is for SSL configuration (no code required)

# how to generate keystore
```
keytool -genkeypair -keyalg rsa -keysize 2048 -alias https-example-key-alias -storetype PKCS12 -keystore https-example-keystore.jks -dname "CN=https-example" -validity 3650
```

- "-alias" is the entry in keystore, which will be used as the value of "server.ssl.keyAlias" in properties

# how to build
```
mvn clean install
```

# how to test
## start application
```
mvn spring-boot:run
```
## send request through postman
- method: post
- url: https://localhost:8443/mypath
- headers: REQUEST_HEADER_TEST (myRequestHeader)
- body encode: text/plain
- body: request body test

Note, if can't get response, visit in browser firstly, then send request through postman again 
## result
mypath:myRequestHeader:request body test
 
