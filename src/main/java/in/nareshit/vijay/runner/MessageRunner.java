package in.nareshit.vijay.runner;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {
	private static org.slf4j.Logger log= LoggerFactory.getLogger(MessageRunner.class);

	@Override
	public void run(String... args) throws Exception {
		
		int a =10;
		try {
			log.info("STARTED");
			System.out.println("WELCOME TO SPRING BOOT APP!!+a");
			} catch (Exception e) {
				e.printStackTrace();
		}
		log.info("END");
		}
}
