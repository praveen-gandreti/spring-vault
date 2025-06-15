package SepringLearning.springVaultLearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	@Value("${spring.db.password}")
	String password;
	
	@GetMapping("/demo")
	public String demo()
	{
		System.out.println(password);
		return password;
	}

}
