kafka-topics \
    --zookeeper zookeeper:2181/kafka \
    --create --topic cliente \
    --partitions 3 \
    --replication-factor 1

