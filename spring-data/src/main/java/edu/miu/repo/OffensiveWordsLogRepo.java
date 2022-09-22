package edu.miu.repo;

import edu.miu.entity.OffensiveWordsLog;
import org.springframework.data.repository.CrudRepository;

public interface OffensiveWordsLogRepo extends CrudRepository<OffensiveWordsLog, String> {
    OffensiveWordsLog findOffensiveWordsLogByUserId(long userId);
}
