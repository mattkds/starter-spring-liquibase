# starter-spring-liquibase
Define a simple starter for a spring web app using Liquibase for database migration

## Introduction
This repository is a simple implementation of a spring web app using liquibase tool to manage Database Migration on relationship databases.

### Technical Stack

[Java 17](https://openjdk.org/projects/jdk/17/)

### Built With

![Spring](https://img.shields.io/static/v1?style=for-the-badge&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF&label=)
![Apache Maven](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Maven&color=C71A36&logo=Apache+Maven&logoColor=FFFFFF&label=)
![Liquibase](https://img.shields.io/static/v1?style=for-the-badge&message=Liquibase&color=2962FF&logo=Liquibase&logoColor=FFFFFF&label=)

### Usage of Liquibase

Here liquibase are used in the db.changelog-master.yaml file which gather all migration database.
All changes are write on yaml way. Some SQL files could be executed by sqlFile tag. All specific SQL file are stored in resources/db/changelog/changes folder. 


