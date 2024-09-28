package ri.library.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @Column(name = "id")
    val id: String = UUID.randomUUID().toString(),

    @Column(name = "login")
    val login: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "surname")
    val surname: String
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", "")
}