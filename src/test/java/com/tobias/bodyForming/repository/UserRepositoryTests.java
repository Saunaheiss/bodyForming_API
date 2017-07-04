package com.tobias.bodyForming.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tobias.bodyForming.Domain.User;
import com.tobias.bodyForming.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class UserRepositoryTests {
	
	@Autowired
	UserRepository repository;
	
	User user = new User( "Karsten", "Nordhausen", "email@test.ch", "testPW" );
	
	
	@Test
	public void emptyDBTest() {
		assertThat( repository.count() ).isEqualTo( 1 );
	}
	
	@Test
	public void before() {
		assertThat(repository.count() ).isEqualTo( 1 );
	}
	
	@Test
    public void saveUser() {
        repository.save( user );
        assertThat( repository.count() ).isEqualTo( 2 );
    }
	
	@Test
    public void findByEmail() {
		repository.save(user);
        User user = repository.findByEmail( "email@test.ch" );
        assertThat( repository.findAll().get(1).getEmail() ).isEqualTo( user.getEmail() );
        assertThat( user.getId() ).isEqualTo( 4 );
    }
    
    @Test
    public void findById() {
    	repository.save(user);
        assertThat( repository.findById( user.getId() ).getFirstName() ).isEqualTo( "Karsten" );
    }
    
    @Test
    public void findByFirstName() {
    	repository.save(user);
        assertThat( repository.findByFirstName( "Karsten" ).getId() ).isEqualTo( 5 );
    }
	
}
