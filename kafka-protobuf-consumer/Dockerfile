# Pull base image.
FROM ubuntu:latest

RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/kafka-protobuf-consumer-1.0-SNAPSHOT.jar kafka-consumer.jar

CMD java -jar kafka-producer.jar
