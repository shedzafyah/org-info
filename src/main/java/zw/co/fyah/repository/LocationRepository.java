package zw.co.fyah.repository;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;
import zw.co.fyah.domain.*;

@Repository
public interface LocationRepository extends CrudRepository<Location,Long> {
}
