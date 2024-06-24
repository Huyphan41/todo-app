# Todos API

- [Todos API](#todos-api)
    * [Overview](#overview)
- [Explore REST APIs](#explore-rest-apis)
  * [Todos](#todos)
    + [Create todo](#create-todo)
    + [Get all todos by user](#get-todos-by-user)
- [Database](#database)
    * [todo](#todo)
- [Testing](#testing)
- [Tech Stack](#tech-stack)

## Overview

- This project is a TODOS `RESTful API` designed to **query todos by user.**
- The user can create a todo for a user and search todos by user.


# Explore REST APIs

##  Todo

| Method | Endpoint         | Description                           | Valid API Calls                 |
| ------ |------------------|---------------------------------------|---------------------------------|
| POST | /api/todos       | Creates a todo with an existing user id | [Create todo](#create-todo)     |
| GET | /api/todos?user=1570ce69-5617-4eac-9454-20c7fc1b3c2d | Get todos by user id | [Get todos](#get-todos-by-user) |


### Create a todo
- Description: Creates a todo with an existing user id.
- Request Body:
  ```json 
    {
      "id": "023df4cc-498b-42ab-a453-04441b229a08",
      "user_id": "f8e7956d-8b6c-4246-b53a-5bcf319a6a7d"
      "description": "description",
      "completed": true
    } 
  ```
### Get todos filter by user id
- Description: Gets todos with user id.
- Request Body:
  - Path Variables user id, in String format

# Database
- The database structure contains one table, a `todo` table that contains the todo object.
- The table structures and values are as follows:

## todo
- Id: UUID (Primary Key)
- UserId: UUID
- Description: VarChar
- Completed: Boolean


# Testing
- I used Mockito is several unit tests.
- More elaborate descriptions of the tests and their functionalities can be found in the test folder within this project.


# Tech Stack

- API Creation:
    - Java
    - H2
    - SpringBoot
    - Hibernate
    - JPA
    - Lombok
- User Input Testing:
    - Swagger UI
    - Postman# todo-app
