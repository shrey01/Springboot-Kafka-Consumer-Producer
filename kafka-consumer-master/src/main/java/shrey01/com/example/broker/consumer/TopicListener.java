package shrey01.com.example.broker.consumer;
/**
 * @author Shreyaskar Nath Tripathi 
 * Github.com/shrey01
 * @date 25th August 2022
 */
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

	@Value("${topic.name.consumer")
	private String topicName;

	@KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
	public void consume(ConsumerRecord<String, String> payload) {
		log.info("Topic Name :", topicName);
		log.info("key: ", payload.key());
		log.info("Headers: ", payload.headers());
		log.info("Partion: ", payload.partition());
		log.info("Order: ", payload.value());
	}

}