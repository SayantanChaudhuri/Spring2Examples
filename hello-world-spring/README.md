# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Used Operating System:
- Ubuntu 18.04 LTS

### Used tools:
- Visual Studio Code
- Oracle Java 8+
- Spring Boot 2+
- Apache Maven 3.3+

### Visual Studio Code Plugins:
- Java Extension Pack
- Java Test Runner
- Spring Boot Extension Pack
- Spring Boot Tools
- Spring Initializer Java Support


### Installation Steps

#### Oracle Java 11 Installation

`sudo apt update`

`sudo apt upgrade`

`sudo add-apt-repository ppa:linuxuprising/java`

`sudo apt update`

`sudo apt install oracle-java11-installer`

`sudo apt install oracle-java11-set-default`

`java -version`

#### Maven installation

`sudo apt update`

`sudo apt install maven`

`mvn -version`

#### Visual Studio Code installation

Visual Studio installed from https://code.visualstudio.com/.
Usually download in Downloads folder. So use following command to install visual code:

`sudo apt update`

`sudo apt upgrade`

`sudo dkpg -i code_<version>.deb`

#### Run spring boot application

`mvn spring-boot:run`

#### Spring by-default link

http://localhost:8080

#### Disabling specific auto configuration ```language

````
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.context.annotation.*;

@Configuration
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class})

public class MyConfiguration {

}
````

#### Spring Beans and Dependency Injection

Contructor Injection

````
package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAccountService implements AccountService {

    private final RiskAssessor riskAssessor;

    @Autowired
    public DatabaseAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
    }
    
    // ...
}  
````

If a bean has one constructor, you can omit the @Autowired, as shown in the following example:

````
@Service
public class DatabaseAccountService implements AccountService {

    private final RiskAssessor riskAssessor;

    public DatabaseAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
    }
    
    // ...
}
````

#### Annotations

**@EnableAutoConfiguration**:  attempts to automatically configure your Spring application based on the jar dependencies that you hav1e added

**@ComponentScan**: enable @Component scan on the package where the application is located

**@Configuration**: allow to register extra beans in the context or import additional configuration classes

**@SpringBootApplication**: is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes

#### Developer Tools

**spring-boot-devtools** module can be included in any project to provide additional development-time features

````
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
````
````
Restart vs Reload 

The restart technology provided by Spring Boot works by using two 
classloaders. Classes that do not change (for example, those from third-party jars) are loaded into a base classloader. Classes that you are actively developing are loaded into a restart classloader. When the application is restarted, the restart classloader is thrown away and a new one is created. This approach means that application restarts are typically much faster than “cold starts”, since the base classloader is already available and populated. If you find that restarts are not quick enough for your applications or you encounter classloading issues, you could consider reloading technologies such as JRebel from ZeroTurnaround. These work by rewriting classes as they are loaded to make them more amenable to reloading.
````

