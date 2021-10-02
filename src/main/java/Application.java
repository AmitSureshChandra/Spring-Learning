import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceInterface;

public class Application {
	
	public static void main(String args[]) {
		SpeakerServiceInterface service = new SpeakerService();
		System.out.println(service.findAll().get(0).getFirstName());
	}
}
