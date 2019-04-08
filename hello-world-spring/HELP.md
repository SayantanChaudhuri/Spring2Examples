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