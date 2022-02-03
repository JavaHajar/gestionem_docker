package testDao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import repository.AdminRepos;
import repository.AdminReposImp;

public class AdminReposImpTest {

	@Test
	public final void testValidate() {
		AdminRepos adminrepo = new AdminReposImp();
		Assertions.assertTrue(adminrepo.validate("test@gmail.com", "testii"));
	}

}
