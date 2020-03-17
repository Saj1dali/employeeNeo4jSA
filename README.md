# employeeNeo4jSA
Author: Sajid Ali

Employee REST API
Using Neo4j graph data and Spring tools to create an application that will allow users to interact with graph data from the web interface.

Neo4j Spring data Rest API
The primary goal of the Spring Data project is to make it easier to build Spring-powered applications that use new data access technologies such as non-relational databases, map-reduce frameworks, and cloud based data services.
Spring data makes it easy to use data access technologies, relational and non-relational databases, map-reduce frameworks and cloud-based data services. 
Spring Data Neo4J
Provides support for the Neo4j Graph Database including annotated plan old Java objects (POJOs), SD-Repositories and Neo4j-Template.
It also offers advanced features to map annotated entity classes to the Neo4j Graph database. Spring Data Neo4j is core part of the Spring Data project which aims to provide convenient data access for NoSQL databases.
Spring Data Neo4j helps to write code as we would normally do in Spring but work with a graph database. It does this by using the Neo4j object-graph mapper (OGM) library, which takes a role like Hibernate in JPA, to interact with the drivers, and ultimately, the Neo4j graph database.
Application
Requirements: An Employee node with two properties
	Employee Name (String)
	Employee Id (Integer)
And then return all the employees.
What you will build
You will build a Spring application that lets you create and retrieve Employee objects that are stored in a Neo4j NoSQL database by using Spring Data REST. Spring Data REST takes the features of Spring HATEOS and Spring Data Neo4j and automatically combines them together. 
Setup
Your favourite IDE for Java (Eclipse, NetBeans etc)
JDK 1.8 or later
Maven 3.2+
Neo4j Server
You need to set up Neo4j server to build this application. You can install Neo4j’s open source server for free. This example follows the local installation on a windows machine. You can also use Neo4jSandbox or a cloud hosted Neo4j database. If you chose second option, you need to provide the URL to your Neo4j server in an environment variable NEO4J_URL. 
Once you have installed the Neo4j server, you can start it with default setting by opening the “Neo4j Desktop” application. Default username and password for Neo4j are neo4j/neo4j. You can reset the password for database by going into Manage->Administration.

 

Spring Initializr
Spring initializr offers a fast way to create a skeleton for Spring Applications. It also enables to pull in all the dependencies you need and does a lot of setup for you. Our application requires “Rest Repositories” and “Spring Data Neo4j Dependencies”.
