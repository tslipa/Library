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
    var id: String? = UUID.randomUUID().toString(),

    @Column(name = "login")
    var login: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "password")
    var password: String,

    @Column(name = "name")
    var name: String,

    @Column(name = "surname")
    var surname: String
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", "")
}