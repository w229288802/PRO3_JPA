package test;

import java.util.UUID;

import org.junit.Test;

import com.welge.dao.UserDao;
import com.welge.model.User;

public class TestDap {
		@Test
		public void testT(){ 
			UserDao userDao = new UserDao();
			User user = new User();
			user.setId(UUID.randomUUID().toString());
			user.setName("张三");
			userDao.save(user);
		}
}
