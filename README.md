# protobuf

#### version 2

#### 사용이유

```
java, c# 독립적으로 직렬화 하기 위해서 도입됨
```

<details>
<summary><h4>컴파일 방법</h4></summary>

#### java 컴파일
```
mkdir .\protobuf\out\java
protoc -I=protobuf --java_out=./protobuf/out/java ./protobuf/request/chat/*.proto
protoc -I=protobuf --java_out=./protobuf/out/java ./protobuf/request/*.proto
protoc -I=protobuf --java_out=./protobuf/out/java ./protobuf/response/*.proto
protoc -I=protobuf --java_out=./protobuf/out/java ./protobuf/response/chat/*.proto
protoc -I=protobuf --java_out=./protobuf/out/java ./protobuf/*.proto
```

#### c# 컴파일
```
mkdir .\protobuf\out\c
protoc -I=protobuf --csharp_out=./protobuf/out/c ./protobuf/request/chat/*.proto
protoc -I=protobuf --csharp_out=./protobuf/out/c ./protobuf/request/*.proto
protoc -I=protobuf --csharp_out=./protobuf/out/c ./protobuf/response/*.proto
protoc -I=protobuf --csharp_out=./protobuf/out/c ./protobuf/response/chat/*.proto
protoc -I=protobuf --csharp_out=./protobuf/out/c ./protobuf/*.proto
```

#### 컴파일 결과물
- <img width="197" alt="image" src="https://github.com/ehaakdl/gora-common/assets/6407466/df025318-00c5-4a38-b572-148ac8e43ac6">
</details>

<details>
<summary>
    <h4>모델링 스펙 정리</h4>
</summary>

## ChatHistoryRequest(채팅 내역 조회 요청)

- `chatType`: 채팅 유형(1:1, 그룹, 전체)
- `groupType`: 어떤 그룹 유형 인지 나타낸다(미사용 - 나중에 구현 예정)
- `groupCode`: 어떤 그룹 인지 나타낸다(미사용 - 나중에 구현 예정)
- `userCode`: 어떤 유저에 데이터를 가져올지 지정한다(1:1 채팅에서 사용, 미사용 - 나중에 구현 예정)
- `startAt`: 조회 시작 범위
- `endAt`: 조회 끝 범위
- `page`: 조회할 페이지 번호
- `pageSize`: 조회할 페이지 사이즈
- `accessToken`: 계정 인증토큰

## ChatSendRequest(채팅 전송 요청)

- `chatType`: 채팅 유형(1:1, 그룹, 전체)
- `groupType`: 어떤 그룹 유형으로 보내는지 나타낸다(미사용 - 나중에 구현 예정)
- `groupCode`: 어떤 그룹으로 보내는지 나타낸다(미사용 - 나중에 구현 예정)
- `userCode`: 어떤 유저에게 보낼지 지정한다(1:1 채팅에서 사용, 미사용 - 나중에 구현 예정)
- `message`: 전송할 메시지 담는곳
- `accessToken`: 계정 인증토큰

## ChatHistoryResponse(채팅 내역 조회 응답)

### MessageData(메시지 정보)

- `chatType`: 채팅 유형(1:1, 그룹, 전체)
- `groupType`: 어떤 그룹 유형 인지 나타낸다(미사용 - 나중에 구현 예정)
- `groupCode`: 어떤 그룹 인지 나타낸다(미사용 - 나중에 구현 예정)
- `senderEmail`: 보낸 유저 이메일
- `senderUserCode`: 보낸 유저 코드
- `receiveEmail`: 수신 유저 이메일
- `receiveUserCode`: 수신 유저 코드
- `sentAt`: 보낸시각
- `message`: 메시지 담는곳

### ChatHistoryResponse(채팅 내역 조회 응답)

- `page`: 페이지 번호
- `pageSize`: 한 페이지당 크기
- `data`: 메시지 정보가 담기는곳
- `totalPage`: 전체 페이지 개수
- `accessToken`: 계정 인증 토큰(재발급될때 이 필드가 채워짐)

## GenericResponse(일반적으로 사용되는 응답)

- `status`: 요청에 대한 결과 코드
- `accessToken`: 계정 인증 토큰(재발급될때 이 필드가 채워짐)

## NetworkPacket(네트워크 패킷)

- `data`: 데이터가 담김
- `type`: 패킷에 담긴 데이터 유형
- `dataSize`: 패딩을 제외한 실제 데이터 사이즈
- `udpChannelId`: udp 로 전송된 사용자가 누구인지 식별하기 위한 필드
- `identify`: 패킷에 식별자
- `totalSize`: 분할 패킷인 경우 합쳤을때 사이즈
- `sequence`: 분할 패킷인 경우 순서를 식별하기 위한 필드
</details>
