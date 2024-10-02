package ri.library.entity

import jakarta.persistence.*
import ri.library.enums.BookStatus
import java.util.*

@Entity
@Table(name = "books")
data class BookEntity(
    @Id
    @Column(name = "id")
    var id: String? = UUID.randomUUID().toString(),

    @Column(name = "title")
    var title: String,

    @Column(name = "author")
    var author: String,

    @Column(name = "year")
    var year: String,

    @Column(name = "publisher")
    var publisher: String,

    @Column(name = "owner_id")
    var ownerId: String,

    @Column(name = "description")
    var description: String?,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: BookStatus,

    @Column(name = "url")
    var url: String?
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", "", null, BookStatus.FREE, null)
}