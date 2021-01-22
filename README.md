# spring-cloud-stream-kafka-producer
Sample Spring Cloud Stream Kafka Producer

## How to start

Run following commands & Run Consumer without group id

```
mvn clean install
mvn spring-boot:run -Dspring.cloud.stream.kafka.binder.brokers=<KAFKA_BROKER_URL> -Dspring.cloud.stream.bindings.output.destination=<TOPIC_NAME>
```

## Steps to run:

1. Once the application starts, send some messages on the kafka topic via hitting /send endpoint

```
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"messageId":1,"message":"hey"}' \
  http://localhost:8080/send
```

2. The application listen to the POST requests and sends the message to provided kafka topic.

## Docker Setup

1. Run the below command to build the docker image

```
mvn clean install
docker build . -t producer
```

2. Run the src/main/docker/docker-compose-producer.yml file with the following command

 ```
 docker-compose -f docker-compose-producer.yml up
 ```
 

