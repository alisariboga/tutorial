import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(
                StudentApplication.class, args);
        //System.out.println(ctx);
    }
}