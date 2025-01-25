**Required:**

* Maven -> install on your pc and make sure to add maven bin path in to your environment variables in path
* WildFly -> install on your pc
* JDK 17

Maven:
mvn clean package

Get ToDoList : 
GET http://localhost:8080/ListWave-1.0/api/list
GET http://localhost:8080/ListWave-1.0/api/list/{id}

Update:
PUT http://localhost:8080/ListWave-1.0/api/list/{id}

Delete:
DELETE http://localhost:8080/ListWave-1.0/api/list/{id}

Create:
POST http://localhost:8080/ListWave-1.0/api/list

//JSON
{
"status": "in Porgess",
"description": "Buy musik"
}