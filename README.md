# Spring Boot E-commerce API Store
This repository contains a complete RESTful API for an e-commerce platform, built using Java and the Spring Boot framework. It provides a backend solution for managing products, users, shopping carts, orders, and payments.

## Features

*   **User Management & Authentication**: Secure user registration and login using JWT (JSON Web Tokens).
*   **Role-Based Access Control**: Differentiated access for `USER` and `ADMIN` roles.
*   **Product Catalog**: Full CRUD (Create, Read, Update, Delete) operations for products and categories.
*   **Shopping Cart**: Persistent shopping cart functionality for anonymous and authenticated users.
*   **Order Management**: Create orders from the shopping cart and track their status.
*   **Payment Integration**: Secure payment processing via Stripe, including checkout session creation and webhook handling for payment status updates.
*   **Database Migrations**: Uses Flyway for automated, version-controlled database schema management.
*   **API Documentation**: Integrated Swagger UI for interactive API documentation.

## Tech Stack

*   **Framework**: Spring Boot 3
*   **Language**: Java 17
*   **Security**: Spring Security 6 (with JWT)
*   **Database**: Spring Data JPA, MySQL
*   **Database Migration**: Flyway
*   **Payment Gateway**: Stripe
*   **API Documentation**: SpringDoc OpenAPI (Swagger)
*   **Build Tool**: Maven
*   **Utilities**: Lombok, MapStruct

## Getting Started

Follow these instructions to get a local copy up and running for development and testing purposes.

### Prerequisites

*   Java JDK 17 or later
*   Maven
*   MySQL Server
*   A Stripe account for API keys

### Installation & Setup

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/borzuy2282/spring-api-store-project.git
    cd spring-api-store-project
    ```

2.  **Configure the Database:**
    Open the `src/main/resources/application-dev.yaml` file and update the database URL, username, and password to match your local MySQL setup.
    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/store_api?createDatabaseIfNotExist=true
        username: your_mysql_user
        password: your_mysql_password
    ```
    Flyway will automatically create the necessary tables and populate them with initial data upon the first run.

3.  **Set up Environment Variables:**
    Create a `.env` file in the root directory of the project by copying the example file:
    ```sh
    cp .env.example .env
    ```
    Edit the `.env` file and provide the required secret keys:
    ```
    JWT_SECRET=your_super_secret_key_for_jwt_signing
    STRIPE_SECRET_KEY=your_stripe_secret_key_sk_...
    STRIPE_WEBHOOK_SECRET_KEY=your_stripe_webhook_signing_secret_whsec_...
    ```

4.  **Run the Application:**
    Use the Maven wrapper to build the project and start the application:
    ```sh
    ./mvnw spring-boot:run
    ```
    The API will be running on `http://localhost:8080`.

## API Documentation

The API is documented using OpenAPI 3. Once the application is running, you can access the interactive Swagger UI to explore and test the endpoints:

*   **Swagger UI**: `http://localhost:8080/swagger-ui.html`

### Core API Endpoints

A brief overview of the available API resources:

| Feature             | Endpoint              | Description                                        |
| ------------------- | --------------------- | -------------------------------------------------- |
| **Authentication**  | `/auth`               | Handles user login, token refresh, and user info.  |
| **Users**           | `/users`              | Manages user registration and profiles.            |
| **Products**        | `/products`           | Provides access to the product catalog.            |
| **Carts**           | `/carts`              | Manages shopping cart creation and item handling.  |
| **Orders**          | `/orders`             | Allows users to view their past orders.            |
| **Checkout**        | `/checkout`           | Initiates the payment process with Stripe.         |
| **Admin**           | `/admin`              | Admin-only endpoints.                              |
