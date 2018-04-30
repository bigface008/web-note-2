package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final UserRepository user_repository;

	private final ProblemRepository problem_repository;

	@Autowired
	public DatabaseLoader(UserRepository user_repository, ProblemRepository problem_repository) {
		this.user_repository = user_repository;
		this.problem_repository = problem_repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.user_repository.save(new User("bob", "note", "normal", "bigface00@sjtu.edu.cn", "18069189552"));
		this.user_repository.save(new User("admin", "123", "admin", "bigface00@sjtu.edu.cn", "18069189552"));
		this.problem_repository.save(new Problem("bob", "Segmentation Fault", "None", "I am an SB.", "ICS", "2.1", "2018.1.1", "2018.1.1", 0, "None.", "ICS"));
		this.problem_repository.save(new Problem("bob", "Runtime Error", "None", "Compiler is an SB.", "WEB", "2.3", "2017.1.1", "2018.1.1", 2, "None.", "WEB"));
		this.problem_repository.save(new Problem("bob", "Bomb", "Silly", "I am an SB.", "ICS", "2.2", "2018.3.1", "2018.1.1", 0, "None.", "ICS"));
		this.problem_repository.save(new Problem("bob", "Segmentation Fault", "None", "I am an SB.", "ICS", "2.1", "2018.1.1", "2018.1.1", 0, "None.", "ICS"));
		this.problem_repository.save(new Problem("admin", "Unkown Fault", "Oh my god", "The world is wrong!!!!", "ICS", "1.1", "2018.10.1", "2018.12.1", 0, "None.", "ICS"));
		this.problem_repository.save(new Problem("admin", "Hazard", "Oh my god", "The world is wrong!!!!", "ICS", "1.1", "2018.10.1", "2018.12.1", 0, "None.", "ICS"));
	}
}