import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.example.conference.repository.SpeakerRepository;
import com.example.conference.service.SpeakerService;

@Configurable
public class AppConfig {

	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
		SpeakerService speakerService =  new SpeakerService();
//		SpeakerService speakerService =  new SpeakerService(this.getSpeakerRepository());
		return speakerService;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new SpeakerRepository();
	}
}
