package com.lambdaschool.watermyplants.repository;

import com.lambdaschool.watermyplants.models.Useremail;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Useremail to the rest of the application
 */
public interface UseremailRepository
        extends CrudRepository<Useremail, Long>
{
}
