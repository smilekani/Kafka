package in.co.kani;

/**
*  Kafka Consumer with Example Java Application
*/
public class KafkaConsumerDemo {
    public static void main(String[] args) {
        SampleConsumer consumerThread = new SampleConsumer("sampleTopic");
        consumerThread.start();
    }
}