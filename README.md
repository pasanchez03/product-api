# Product API

Este es un microservicio REST desarrollado en **Spring Boot** que permite gestionar productos en un catálogo.  
Está desplegado en **Google Cloud Run** y usa **PostgreSQL en Cloud SQL** como base de datos.

## **Endpoints de la API**

### **Obtener un producto por ID:**
```http
GET /products/{id}
```

**Ejemplo de respuesta (200 OK):**
```json
{
    "id": "A000000003",
    "name": "Macbook Air",
    "description": "24 GM RAM",
    "price": 999.99,
    "model": "M4 PRO"
}
```
**Respuesta en caso de error (404 Not Found):**

```json
{
    "mensaje": "Producto con ID A000000004 no encontrado.",
    "error": "Producto no encontrado",
    "timestamp": "2025-03-07T16:09:02.75658"
}
```

### **Actualizar un producto por ID:**
```http
PATCH /products/{id}
```

📌 **Ejemplo de solicitud:**

```json
{
  "description": "New Model",
  "model": "M4 PRO"
}
```

📌 **Ejemplo de respuesta (200 OK):**

```json
{
    "id": "A000000003",
    "name": "Macbook Air",
    "description": "New Model",
    "price": 999.99,
    "model": "M4 PRO"
}
```

📌 **Respuesta en caso de error (400 Bad Request):**

```json
{
  "mensaje": "Producto con ID A000000004 no encontrado.",
  "error": "Producto no encontrado",
  "timestamp": "2025-03-07T16:09:02.75658"
}
```
---

## **Instalación y Configuración**

### **1. Clonar el repositorio**

```sh
git clone https://github.com/pasanchez03/product-api.git
cd product-api
```

### **2. Configurar la base de datos**

Agrega en `application.properties` o en variables de entorno:

```properties
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/catalogdb
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=admin
```

### **3. Ejecutar el proyecto**

```sh
./gradlew bootRun
```

📌 **La API estará disponible en:**

```
http://localhost:8080/products
```

---

---
### **Documentación con OpenAPI/Swagger**
```md
## Documentación OpenAPI

La API cuenta con documentación en Swagger UI.

🔗 [Swagger UI](https://product-api-571621003987.us-central1.run.app/swagger-ui/index.html)
🔗 [OpenAPI Spec](https://product-api-571621003987.us-central1.run.app/openapi.yaml)