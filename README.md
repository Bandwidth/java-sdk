# Getting Started with bandwidth

Bandwidth's set of APIs

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.bandwidth.sdk</groupId>
  <artifactId>bandwidth-sdk</artifactId>
  <version>1.2.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/com.bandwidth.sdk/bandwidth-sdk/1.2.0

## Initialize the API Client

The following parameters are configurable for the API Client.

| Parameter | Type | Description |
|  --- | --- | --- |
| `messagingBasicAuthUserName` | `String` | The username to use with basic authentication |
| `messagingBasicAuthPassword` | `String` | The password to use with basic authentication |
| `voiceBasicAuthUserName` | `String` | The username to use with basic authentication |
| `voiceBasicAuthPassword` | `String` | The password to use with basic authentication |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |

The API client can be initialized as following.

```java
BandwidthClient client = new BandwidthClient.Builder()
    // Set authentication parameters
    .messagingBasicAuthUserName("MessagingBasicAuthUserName")
    .messagingBasicAuthPassword("MessagingBasicAuthPassword")
    .voiceBasicAuthUserName("VoiceBasicAuthUserName")
    .voiceBasicAuthPassword("VoiceBasicAuthPassword")

    // Set the environment
    .environment(Environments.PRODUCTION)
    .build();
```

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## Authorization

This API does not require authentication.

## API Reference

### List of APIs

*

