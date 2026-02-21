

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockitotest.Users;
import com.mockitotest.UsersDao;
import com.mockitotest.UsersService;

@ExtendWith(MockitoExtension.class)
public class userServiceTest {
	@Mock
	UsersDao daomock;
	
	@InjectMocks
	UsersService service ;
	
	
	@Test
	public void typeOfUser() {
		// create mock object
		//UsersDao daomock=mock(UsersDao.class);//instead of writing this we use annotation at above
		
		// create fake object
		Users fakeObject=new Users();
		fakeObject.setId(1);
		fakeObject.setName("Allen");
		fakeObject.setBalance(2000);
		
		// mention what object should return
		when(daomock.findById(1)).thenReturn(fakeObject);
		
		//UsersService service=new UsersService(daomock);//instead of writing this we use annotation at above
		
		String res=service.typeOfUser(1);
		
		assertEquals("regular user",res);
	}
}
