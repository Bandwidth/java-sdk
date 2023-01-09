# Bandwidth Java SDK

[![Test](https://github.com/Bandwidth/java-sdk/actions/workflows/test.yml/badge.svg)](https://github.com/Bandwidth/java-sdk/actions/workflows/test.yml)

| **OS** | **Java** | **Distribution** |
|:---:|:---:|:---:|
| Windows 2016 | 8, 11 | Zulu OpenJDK, Eclipse Temurin |
| Windows 2019 | 8, 11 | Zulu OpenJDK, Eclipse Temurin |
| Ubuntu 20.04 | 8, 11 | Zulu OpenJDK, Eclipse Temurin |
| Ubuntu 22.04 | 8, 11 | Zulu OpenJDK, Eclipse Temurin |
## Getting Started

### Installation

Add the following dependency to your `pom.xml` file

```xml

<!-- https://mvnrepository.com/artifact/com.bandwidth.sdk/bandwidth-sdk -->
<dependency>
    <groupId>com.bandwidth.sdk</groupId>
    <artifactId>bandwidth-sdk</artifactId>
    <version>{version}</version>
</dependency>

```

### Initialize

```java

BandwidthClient client = new BandwidthClient.Builder()
            .messagingBasicAuthCredentials("username", "password")
            .voiceBasicAuthCredentials("username", "password")
            .twoFactorAuthBasicAuthCredentials("username", "password")
            .webRtcBasicAuthCredentials("username", "password")
            .build();
String accountId = "12345";

```

### Create A Phone Call

```java

com.bandwidth.voice.controllers.APIController voiceController = client.getVoiceClient().getAPIController();

String to = "+15554443333";
String from = "+15553334444";
String applicationId = "3-a-b-c";
String answerUrl = "https://sample.com";

ApiCreateCallRequest body = new ApiCreateCallRequest();
body.setTo(to);
body.setFrom(from);
body.setApplicationId(applicationId);
body.setAnswerUrl(answerUrl);

ApiResponse<ApiCallResponse> createCallResponse = voiceController.createCall(accountId, body);
System.out.println(createCallResponse.getResult().getCallId());

```

### Send A Text Message

```java

String to = "+15554443333";
ArrayList<String> toNumbers = new ArrayList<String>();
toNumbers.add(to);
String from = "+15553334444";
String applicationId = "3-a-b-d";
String text = "Hello from Java";

MessageRequest body = new MessageRequest();
body.setTo(toNumbers);
body.setFrom(from);
body.setText(text);
body.setApplicationId(applicationId);

ApiResponse<BandwidthMessage> createMessageResponse = messagingController.createMessage(accountId, body);
System.out.println(createMessageResponse.getResult().getMessageId());

```

### Create BXML

```java

SpeakSentence speakSentence = SpeakSentence.builder()
    .text("Hello world")
    .voice("susan")
    .gender("female")
    .locale("en_US")
    .build();

String response = new Response()
    .add(speakSentence)
    .toBXML();
System.out.println(response);

```

### Create A MFA Request

```java

String to = "+15554443333";
String from = "+15553334444";
String applicationId = "3-a-c-b");
String scope = "scope";
int digits = 6;
String message = "Your temporary {NAME} {SCOPE} code is {CODE}";

TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
body.setTo(to);
body.setFrom(from);
body.setApplicationId(applicationId);
body.setScope(scope);
body.setDigits(digits);
body.setMessage(message);

mfaController.createVoiceTwoFactor(accountId, body);

String code = "123456"; //this is the user code to verify
int expirationTimeInMinutes = 3;

TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
body.setTo(to);
body.setApplicationId(applicationId);
body.setScope(scope);
body.setCode(code);
body.setExpirationTimeInMinutes(expirationTimeInMinutes);

ApiResponse<TwoFactorVerifyCodeResponse> response = mfaController.createVerifyTwoFactor(accountId, body);
System.out.println(response.getResult().getValid());

```

### WebRtc Participant & Session Management

```java

Session createSessionBody = new Session();
createSessionBody.setTag("new-session");

ApiResponse<Session> createSessionResponse = webrtcController.createSession(accountId, createSessionBody);
String sessionId = createSessionResponse.getResult().getId();

Participant createParticipantBody = new Participant();
createParticipantBody.setCallbackUrl("https://sample.com");
ArrayList<PublishPermissionEnum> publishPermissions = new ArrayList<PublishPermissionEnum>();
publishPermissions.add(PublishPermissionEnum.AUDIO);
publishPermissions.add(PublishPermissionEnum.VIDEO);

ApiResponse<AccountsParticipantsResponse> createParticipantResponse = webrtcController.createParticipant(accountId, createParticipantBody);
String participantId = createParticipantResponse.getResult().getParticipant().getId();

List<ParticipantSubscription> participantSubscriptions = new ArrayList<>();
participantSubscriptions.add(new ParticipantSubscription(participantId));

webrtcController.addParticipantToSession(accountId, sessionId, participantId, new Subscriptions(sessionId, participantSubscriptions));

```

## Supported Java Versions

This package can be used with Java >= 1.8 

## Documentation

Documentation for this package can be found at https://dev.bandwidth.com/sdks/java

## Credentials

Information for credentials for this package can be found at https://dev.bandwidth.com/guides/accountCredentials.html

