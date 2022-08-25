package shrey01.com.example;
/**
 * @author Shreyaskar Nath Tripathi 
 * Github.com/shrey01
 * @date 25th August 2022
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MainApp.class, args);
    }

}
