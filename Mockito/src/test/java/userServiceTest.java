

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.mockitotest.Users;
import com.mockitotest.UsersDao;
import com.mockitotest.UsersService;

public class userServiceTest {
	
	@Test
	public void typeOfUser() {
		// create mock object
		UsersDao daomock=mock(UsersDao.class);
		
		// create fake object
		Users fakeObject=new Users();
		fakeObject.setId(1);
		fakeObject.setName("Allen");
		fakeObject.setBalance(2000);
		
		// mention what object should return
		when(daomock.findById(1)).thenReturn(fakeObject);
		
		UsersService service=new UsersService(daomock);
		
		String res=service.typeOfUser(1);
		
		assertEquals("regular user",res);
	}
}
