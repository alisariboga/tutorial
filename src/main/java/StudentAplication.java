import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class StudentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(
                StudentApplication.class, args);
        //System.out.println(ctx);
    }
}