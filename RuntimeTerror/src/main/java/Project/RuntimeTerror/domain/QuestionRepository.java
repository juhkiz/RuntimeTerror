package Project.RuntimeTerror.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource
public interface QuestionRepository extends CrudRepository<Question, Long> {
	List<Question> findByQuestionType(@Param("questionType.questionType") String questionType);
}