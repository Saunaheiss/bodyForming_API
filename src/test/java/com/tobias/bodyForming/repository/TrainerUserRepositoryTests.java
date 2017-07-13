package com.tobias.bodyForming.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tobias.bodyForming.Domain.TrainerUser;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class TrainerUserRepositoryTests {
	
	@Autowired
	TrainerUserRepository repository;
	
	@Test
	public void emptyDBTest() {
		assertThat( repository.count() ).isEqualTo( 1 );
	}
	
	@Test
    public void findByEmail() {
        assertThat( repository.getOne(1L).getEmail() ).isEqualTo("test@test.ch");
    }
	
//	@Test
//	public void findByLastNameOrFirstName() {
//		TrainerUser bolt= repository.findById(1L);
//		assertThat(repository.findByLastNameIgnoreCaseContainingOrFirstNameIgnoreCaseContaining("Bolt")).contains(bolt);
//	}
}
