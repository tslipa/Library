package ri.library.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("Users")
data class UserEntity(
    @Id val id: UUID?,
    val login: String,
    val email: String,
    val password: String,
    val name: String,
    val surname: String
)