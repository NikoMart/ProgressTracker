package progressTracker.Repository;

import org.springframework.data.repository.CrudRepository;
import progressTracker.model.ProgressUnit;

public interface ProgressRepository extends CrudRepository<ProgressUnit,Long> {
}
