package ri.library.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id val id: String = UUID.randomUUID().toString(),
    val login: String,
    val email: String,
    val password: String,
    val name: String,
    val surname: String
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", "")
}