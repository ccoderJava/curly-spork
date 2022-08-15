package cc.ccoder.serverless.curlyspork;

import cc.ccoder.serverless.curlyspork.controller.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurlySporkApplicationTests {

	@Test
	public void testWelcome() {
		assertEquals(HttpStatus.OK, new IndexController().welcome().getStatusCode());
	}

}
