# Museo Backend
Welcome to the Museo Backend Repository! This repository contains the backend code for the Museo Android app. Museo is an app that allows users to search for museums around them and explore exhibits within those museums. Users can view exhibit details, including images, descriptions, and audio guides.


**Features**

The Museo backend provides the following features:

Museum Search: Users can search for museums based on their current location or a specified location. The backend uses the JPA repository framework to retrieve museum data from a SQL database.

Exhibit Details: Users can view detailed information about exhibits within a museum. This includes exhibit images, descriptions, and audio guides. The backend retrieves exhibit data from the database using the JPA repository.

Audio Guides: Museo provides an easy way for users to access audio guides for exhibits. Users can listen to audio guides for specific exhibits within a museum.

Curator Web App: Curators of museums have access to a web application where they can upload data for their museums and exhibits. The backend handles data insertion into the SQL database using the JPA repository framework.

**Technologies Used**

The Museo Backend Repository utilizes the following technologies:

Java: The backend code is written in Java, a popular programming language known for its versatility and strong ecosystem.

Spring Boot: Spring Boot is a framework for building Java applications quickly and with minimal configuration. It provides a robust set of tools and libraries for developing web applications.

JPA Repository: The backend uses the JPA repository framework, which simplifies data access by providing an abstraction layer over the SQL database. It allows for easy querying and manipulation of data.

SQL Database: The backend interacts with a SQL database to store and retrieve museum and exhibit data. You can configure the database connection details in the application properties file.
