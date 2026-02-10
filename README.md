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

