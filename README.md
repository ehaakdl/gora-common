#### protobuf version 2

#### protobuf 사용이유

```
플랫폼에 독립적으로 직렬화 하기 위해서 도입됨
```

#### java 컴파일
```
mkdir .\protobuf\out\java
protoc -I=./protobuf --java_out=./protobuf/out/java ./protobuf/request/chat/*.proto
protoc -I=./protobuf --java_out=./protobuf/out/java ./protobuf/request/*.proto
protoc -I=./protobuf --java_out=./protobuf/out/java ./protobuf/response/*.proto
protoc -I=./protobuf --java_out=./protobuf/out/java ./protobuf/response/chat/*.proto
```

#### c# 컴파일
```
mkdir .\protobuf\out\c
protoc -I=./protobuf --csharp_out=./protobuf/out/c ./protobuf/request/chat/*.proto
protoc -I=./protobuf --csharp_out=./protobuf/out/c ./protobuf/request/*.proto
protoc -I=./protobuf --csharp_out=./protobuf/out/c ./protobuf/response/*.proto
protoc -I=./protobuf --csharp_out=./protobuf/out/c ./protobuf/response/chat/*.proto
```



