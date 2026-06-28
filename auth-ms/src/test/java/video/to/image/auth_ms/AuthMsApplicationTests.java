package video.to.image.auth_ms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "jwt.secret=test-secret-key-with-at-least-32-characters")
class AuthMsApplicationTests {

	@Test
	void contextLoads() {
	}

}
