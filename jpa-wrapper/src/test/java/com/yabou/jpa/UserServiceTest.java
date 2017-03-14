package com.yabou.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

@Test
public class UserServiceTest extends CoreTest {

	@Autowired
	private UserService userService;

	@Test
	public void testFindUser() {
		User andy = new User();
		andy.setLogin("andy");
		User echo = new User();
		echo.setLogin("echo");
		action.sync(andy);
		action.sync(echo);
		User user = userService.findUser("andy");
		assert "andy".equals(user.getLogin());
	}

	@Test
	public void testFindUserNotExist() {
		User andy = new User();
		andy.setLogin("andy");
		User echo = new User();
		echo.setLogin("echo");
		action.sync(andy);
		action.sync(echo);
		try {
			userService.findUser("andy2");
			assert false;
		} catch (UserNotFoundException e) {
		}		
	}
}
