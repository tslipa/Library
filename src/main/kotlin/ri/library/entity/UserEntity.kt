package ri.library.entity

import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Table(name = "Users")
data class UserEntity(
    @Id val id: UUID?,
    val login: String,
    val email: String,
    val password: String,
    val name: String,
    val surname: String
)