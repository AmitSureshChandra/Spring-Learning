import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(value = "com.example.conference")
public class AppConfig {
	
}
