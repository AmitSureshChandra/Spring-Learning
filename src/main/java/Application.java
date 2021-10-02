import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.conference.service.SpeakerService;

public class Application {
	
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService service = context.getBean("speakerService", SpeakerService.class);
		System.out.println(service);
//		SpeakerServiceInterface service = new SpeakerService();
		System.out.println(service.findAll().get(0).getFirstName());
		SpeakerService service2 = context.getBean("speakerService", SpeakerService.class);
		System.out.println(service2);
	}
}
