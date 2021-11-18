package Project.RuntimeTerror.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface OptionsRepository extends CrudRepository<Options, Long> {

}