# ListWave Backend App



## Requirements

### Install Required Tools

Before setting up the ListWave Backend, ensure that the following tools are installed:

1. **Maven**
   - Install Maven on your PC from [Maven's official website](https://maven.apache.org/download.cgi).
   - After installation, make sure to add Maven's `bin` directory to your system's environment variables.

2. **WildFly**
   - Install WildFly on your PC by downloading it from [WildFly's official website](https://wildfly.org/downloads/).
   - Unzip the downloaded package and set the `WILDFLY_HOME` environment variable to point to your WildFly installation directory.

3. **Jakarta EE 10**
   - Ensure that your application server (e.g., WildFly) supports Jakarta EE 10. WildFly 27+ comes with Jakarta EE 10 compatibility.
   - For more information, refer to [Jakarta EE's official website](https://jakarta.ee/).

4. **JDK 17**
   - Install JDK 17 from either [AdoptOpenJDK](https://adoptopenjdk.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
   - Set the `JAVA_HOME` environment variable to point to your JDK installation directory.

5. **ListWave FrontEnd App**
	- Feel free to [Download ListWave FrontEnd](https://github.com/ontari/listwave-frontend-app1) from master to have a better User Experience

### Setting Up Maven

- Open a terminal and navigate to the project's root directory.
- Run the command `mvn clean install` to build the project and download all required dependencies.

Once Maven is installed, run the following command to clean and package the Maven project:

```bash
mvn clean package

```

### Deploying to WildFly

1. Start WildFly by running `standalone.sh` (Linux/macOS) or `standalone.bat` (Windows) located in the `bin` directory of your WildFly installation.
2. Deploy the generated `.war` file located in the `target` directory to WildFly:
   - Copy the `.war` file to the `standalone/deployments` directory of your WildFly installation.
   - Monitor the WildFly logs to ensure successful deployment.


__________________

## API Endpoints

The ListWave Backend app exposes the following API endpoints. These should be accessible at http://localhost:8080.


### Get Data

#### Fetch data and get all entries in the List


```http
GET http://localhost:8080/ListWave-1.0/api/list

````

#### Fetch data from the List for a specific item by ID

```http

GET http://localhost:8080/ListWave-1.0/api/list/{id}
````

### Update

Update an existing List item:

```http

PUT http://localhost:8080/ListWave-1.0/api/list/{id}
````


### Delete
Delete an existing List item:

```http

DELETE http://localhost:8080/ListWave-1.0/api/list/{id}
```

Delete all entries from List:

```http
DELETE http://localhost:8080/ListWave-1.0/api/list/delete
```


### Create

Create a new entry in the List:
```http

POST http://localhost:8080/ListWave-1.0/api/list
```


JSON Payload Example:
```json
{
"status": "in Porgess",
"description": "Buy some awesome books"
}
```

________________

## Conclusion

This completes the setup for the ListWave Backend App. Once you've configured everything, you should be able to interact with the API endpoints and manage the To-Do list items as needed.
