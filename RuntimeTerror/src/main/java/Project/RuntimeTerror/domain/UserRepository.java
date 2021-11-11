package Project.RuntimeTerror.domain;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);//TÄRKEÄ, JOTTA voi etsiä tunnuksen perusteella
}
