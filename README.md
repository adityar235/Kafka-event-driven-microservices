
┌─────────────┐     ┌──────────────┐     ┌─────────────┐
│   Course    │────▶│   Kafka      │────▶│   Course    │
│  Producer   │     │   Broker     │     │  Consumer   │
│  (Service)  │     │  (Docker)    │     │  (Service)  │
└─────────────┘     └──────────────┘     └─────────────┘
                          │
                    ┌─────┴─────┐
                    │  Topic:   │
                    │ "aditya"  │
                    └───────────┘



producer sends data of Type:
    String courseId;
    String title;
    String trainer;
    double price;
 
Uses KafkaTemplate Library to connect with kafka server.

FOR docker kafka image use 
docker pull apache/kafka:3.9.2

Run producer/consumer on port 9092 
with replication factor 1

Expose kafka port to your local machine form docker machine -p 9092:9092

TO access kafka-topics.sh in Kafka  to start topic name aditya move to directory /opt/kafka/bin/

Uses StringSerializer and	StringDeserializer in Producer/Consumer to send data over the kafka server 
