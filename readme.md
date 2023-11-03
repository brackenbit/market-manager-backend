# Market Manager App

Market Manager is an application to help manage farmers' markets.

## Back End

This Java / Spring Boot application provides the back end for Market Manager, and works with a TypeScript/React front end.

## Functionality

Currently implemented functionality includes:

-   application infrastructure (database, authentication, etc.)
-   managing stallholders
    -   library of stallholder information
-   managing markets
    -   calendar view of market events

Some of the intended functionality yet to be implemented includes:

-   managing stallholders:
    -   track payment of stall fees,
    -   track attendance.
-   manage markets:
    -   automatically generate market events based on recurrence pattern,
    -   automatically generate list of expected stallholders based on typical stallholder attendance pattern,
    -   plan site maps, with automated assistance to lay out stallholders appropriately based on various characteristics.

## Design Decisions

### Language / Framework

Java / Spring Boot were used as I wanted to develop my skills with these commonly-used technologies.

### Identity and Access Management

Several different implementations were developed for the IAM, so that I could learn more about different techniques and options, including a custom authorization server implemented with Spring Security, and setting up a KeyCloak instance. Ultimately, as reliability and security are so important for IAM, Okta was used as an off-the-shelf solution.

# Running the app

The application as stored in this repo will not run, as it relies on importing secrets from an omitted ".../resources/secrets.yaml".
A secrets.yaml file with valid configuration for the datasource and okta must be included.

With a valid secrets.yaml file included, simply run "MarketManagerApplication.java".

The application relies on access to an appropriate database (e.g. MySQL), which can be populated with some example data using the SQL scripts in "/database_setup"

# Using the app

All interaction with this application is through the associated TypeScript/React front end.

(Readme last updated 03Nov2023)
