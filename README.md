# Getting started

Bandwidth's HTTP Messaging platform

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

## How to Use

The following section explains how to use the Messaging library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *MessagingLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

Clicking the ``` Add ``` button will open a dialog where you need to specify Messaging in ``` Group Id ``` and MessagingLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Messaging-Java&workspaceName=Messaging&projectName=MessagingLib&rootNamespace=com.bandwidth.messaging)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *MessagingLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

MessagingClient client = new MessagingClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.bandwidth.messaging.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="get_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.getMessageAsync") getMessageAsync

> getMessage


```java
void getMessageAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
client.getMessageAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



### <a name="list_media_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.listMediaAsync") listMediaAsync

> listMedia


```java
void listMediaAsync(
        final String userId,
        final String continuationToken,
        final APICallBack<List<Media>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | TODO: Add a parameter description |
| continuationToken |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String userId = "userId";
String continuationToken = "Continuation-Token";
// Invoking the API call with sample inputs
client.listMediaAsync(userId, continuationToken, new APICallBack<List<Media>>() {
    public void onSuccess(HttpContext context, List<Media> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



### <a name="get_media_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.getMediaAsync") getMediaAsync

> getMedia


```java
void getMediaAsync(
        final String userId,
        final String mediaId,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | TODO: Add a parameter description |
| mediaId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String userId = "userId";
String mediaId = "mediaId";
// Invoking the API call with sample inputs
client.getMediaAsync(userId, mediaId, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



### <a name="upload_media_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.uploadMediaAsync") uploadMediaAsync

> uploadMedia


```java
void uploadMediaAsync(
        final String userId,
        final String mediaId,
        final long contentLength,
        final String body,
        final String contentType,
        final String cacheControl,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | TODO: Add a parameter description |
| mediaId |  ``` Required ```  | TODO: Add a parameter description |
| contentLength |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Optional ```  | TODO: Add a parameter description |
| cacheControl |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String userId = "userId";
String mediaId = "mediaId";
long contentLength = 88;
String body = "body";
String contentType = "Content-Type";
String cacheControl = "Cache-Control";
// Invoking the API call with sample inputs
client.uploadMediaAsync(userId, mediaId, contentLength, body, contentType, cacheControl, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



### <a name="delete_media_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.deleteMediaAsync") deleteMediaAsync

> deleteMedia


```java
void deleteMediaAsync(
        final String userId,
        final String mediaId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | TODO: Add a parameter description |
| mediaId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String userId = "userId";
String mediaId = "mediaId";
// Invoking the API call with sample inputs
client.deleteMediaAsync(userId, mediaId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



### <a name="create_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bandwidth.messaging.controllers.APIController.createMessageAsync") createMessageAsync

> createMessage


```java
void createMessageAsync(
        final String userId,
        final MessageRequest body,
        final APICallBack<DeferredResultResponseEntityMessage> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String userId = "userId";
    MessageRequest body = new MessageRequest();
    // Invoking the API call with sample inputs
    client.createMessageAsync(userId, body, new APICallBack<DeferredResultResponseEntityMessage>() {
        public void onSuccess(HttpContext context, DeferredResultResponseEntityMessage response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | 400 request is malformed or invalid |
| 401 | 401 The specified user does not have access to the account |
| 403 | 403  The user does not have access to the API |
| 404 | 404 he call-id is no longer active, or the path is not found |
| 409 | 409 Error when modifying a call that is unable to be modified |
| 415 | 415 The content-type of the request is incorrect |
| 429 | 429 The rate limit has been reached |
| 500 | 500 Unknown server error |
| 503 | 503 The service is unavailable for some reason |



[Back to List of Controllers](#list_of_controllers)



