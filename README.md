#### protobuf version 2

#### java 컴파일
```
protoc -I=./protobuf --java_out=./protobuf/out ./protobuf/*.proto
```

#### c# 컴파일
```
protoc -I=./protobuf --csharp_out=./protobuf ./protobuf/*.proto
```
