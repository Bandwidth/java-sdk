
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `baseUrl` | `String` | *Default*: `"https://www.example.com"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). |
| `messagingBasicAuthUserName` | `String` | The username to use with basic authentication |
| `messagingBasicAuthPassword` | `String` | The password to use with basic authentication |
| `multiFactorAuthBasicAuthUserName` | `String` | The username to use with basic authentication |
| `multiFactorAuthBasicAuthPassword` | `String` | The password to use with basic authentication |
| `phoneNumberLookupBasicAuthUserName` | `String` | The username to use with basic authentication |
| `phoneNumberLookupBasicAuthPassword` | `String` | The password to use with basic authentication |
| `voiceBasicAuthUserName` | `String` | The username to use with basic authentication |
| `voiceBasicAuthPassword` | `String` | The password to use with basic authentication |
| `webRtcBasicAuthUserName` | `String` | The username to use with basic authentication |
| `webRtcBasicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
BandwidthClient client = new BandwidthClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .messagingBasicAuthCredentials("MessagingBasicAuthUserName", "MessagingBasicAuthPassword")
    .multiFactorAuthBasicAuthCredentials("MultiFactorAuthBasicAuthUserName", "MultiFactorAuthBasicAuthPassword")
    .phoneNumberLookupBasicAuthCredentials("PhoneNumberLookupBasicAuthUserName", "PhoneNumberLookupBasicAuthPassword")
    .voiceBasicAuthCredentials("VoiceBasicAuthUserName", "VoiceBasicAuthPassword")
    .webRtcBasicAuthCredentials("WebRtcBasicAuthUserName", "WebRtcBasicAuthPassword")
    .environment(Environment.PRODUCTION)
    .baseUrl("https://www.example.com")
    .build();
```

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## bandwidthClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getBaseUrl()` | baseUrl value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getAuthManagers()` | The list of auth managers. | `Map<String, AuthManager>` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

