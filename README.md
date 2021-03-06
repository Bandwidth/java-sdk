# Bandwidth Java SDK

## Getting Started

### Installation

Add the following dependency to your `pom.xml` file

```
<!-- https://mvnrepository.com/artifact/com.bandwidth.sdk/bandwidth-sdk -->
<dependency>
    <groupId>com.bandwidth.sdk</groupId>
    <artifactId>bandwidth-sdk</artifactId>
    <version>{version}</version>
</dependency>
```

### Initialize

```
BandwidthClient client = new BandwidthClient.Builder()
            .messagingBasicAuthCredentials("username", "password")
            .voiceBasicAuthCredentials("username", "password")
            .twoFactorAuthBasicAuthCredentials("username", "password")
            .webRtcBasicAuthCredentials("username", "password")
            .build();
String accountId = "12345";
```

### Create A Phone Call

```
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

```
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

```
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

```
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

```
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

webrtcController.addParticipantToSession(accountId, sessionId, participantId, null);
```

## Supported Java Versions

This package can be used with Java >= 1.8 

## Documentation

Documentation for this package can be found at https://dev.bandwidth.com/sdks/java.html

## Credentials

Information for credentials for this package can be found at https://dev.bandwidth.com/guides/accountCredentials.html

