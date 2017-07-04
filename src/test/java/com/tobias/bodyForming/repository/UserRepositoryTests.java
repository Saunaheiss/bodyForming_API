package com.tobias.bodyForming.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tobias.bodyForming.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class UserRepositoryTests {
	
	@Autowired
		UserRepository repository;
	
	@Test
	public void emptyDBTest() {
		assertThat( repository.count() ).isEqualTo( 0 );
	}
	
//	@Autowired
//    UserRepository repository;
//	
//	User user = new User( "Karsten", "Nordhausen", "email@test.ch", "testPW" );
//	
////	@Test
////	public void before() {
////		assertThat(repository.count() ).isEqualTo( 0 );
////	}
//	
//	@Test
//    public void saveUser() {
//        repository.save( user );
//        assertThat( repository.count() ).isEqualTo( 1 );
//    }
	
}
