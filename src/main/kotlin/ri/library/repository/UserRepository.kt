package ri.library.repository

import org.springframework.data.repository.CrudRepository
import ri.library.entity.UserEntity
import java.util.*

interface UserRepository : CrudRepository<UserEntity, String>