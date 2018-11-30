# Swagger for Microservice Applications

## Purpose
This small project has turned into a working application for living api documentation. Should be as easy as plug and play. This is meant to be a starter application for those trying to expose their microservice APIs to their team or to the world.

## Setup
1. Copy and paste [CorsConfiguration.java](https://github.com/tylerreece22/swagger/blob/master/src/main/java/com/advisar/swagger/config/CorsConfiguration.java) into the project you want to use the API docs for. Otherwise you will have a bad time when you try to "cross origins" XD 
2. Copy and paste [SwaggerConfig.java](https://github.com/tylerreece22/swagger/blob/master/src/main/java/com/advisar/swagger/config/SwaggerConfig.java) into the same project. This creates the host/v2/api-docs endpoint which is where Swagger produces its JSON which this application will consume to create its API docs
3. Configure your services in [application.yml](https://github.com/tylerreece22/swagger/blob/master/src/main/resources/application.yml). This is where the swagger application will look to create its APIs (I commented out mine so you can see what it may look like when you implement yours). **NOTE:** If localhost is not working as a DNS then try plugging in the raw ip. I saw a lot of people saying that happened to them.
4. Boot up the application
5. Go to localhost:8765/swagger-ui.html (This is the endpoint Swagger has set up for your API Docs) and you will see all your service APIs documented. Enjoy!

**NOTE:** There are other configurations you can add to Swagger which change the look and some functionality of the UI but I do not have them here currently.