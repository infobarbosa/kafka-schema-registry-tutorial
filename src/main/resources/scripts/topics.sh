#!/usr/bin/env bash
kafka-topics \
    --zookeeper zookeeper:2181/kafka \
    --create --topic cliente \
    --partitions 3 \
    --replication-factor 1

kafka-console-consumer \
    --bootstrap-server kafka:9092 \
    --topic cliente \
    --from-beginning