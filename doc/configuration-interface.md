
# Configuration Interface

This is the base class for all exceptions that represent an error response from the server.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getBaseUrl()` | baseUrl value. | `String` |
| `getHttpClientConfig()` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment. | `String` |
| `getBaseUri()` | Get base URI by current environment. | `String` |

