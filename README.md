# ItemAPI

A simple Spring Boot REST API for managing items using in-memory storage.

## Features
- Get all items
- Get item by ID
- In-memory data storage (no database)

## Tech Stack
- Java
- Spring Boot
- Maven

## Project Structure
src/main/java/com/amrita/itemapi
├── ItemapiApplication.java
├── controller
│   └── ItemController.java
├── model
│   └── Item.java
└── service
└── ItemService.java

## API Endpoints

### Get all items
- **URL:** `/items`
- **Method:** `GET`
- **Description:** Returns a list of all items stored in memory.

**Sample Response:**
```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Electronics item"
  }
]

## How to Run the Application

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Make sure Java 17+ is installed
4. Run the main class: `ItemapiApplication`
5. Application will start on port 8080

## API Endpoints

### Get all items
- URL: /items
- Method: GET

### Get item by ID
- URL: /items/{id}
- Method: GET

### Add new item
- URL: /items
- Method: POST
- Body:
```json
{
  "name": "Tablet",
  "description": "Portable device"
}
## Deployment

This is a Spring Boot (Java) backend application which requires a JVM.
Platforms like Vercel and Netlify do not support Java backend services.

The application can be deployed on platforms such as:
- Render
- Railway
- AWS EC2
- DigitalOcean
