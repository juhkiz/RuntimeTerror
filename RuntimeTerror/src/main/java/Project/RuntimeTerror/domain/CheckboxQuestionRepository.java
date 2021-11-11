package Project.RuntimeTerror.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CheckboxQuestionRepository extends CrudRepository<CheckboxQuestion, Long>{

}