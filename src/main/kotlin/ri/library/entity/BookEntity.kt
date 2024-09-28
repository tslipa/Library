package ri.library.entity

import jakarta.persistence.*
import ri.library.enum.BookStatus
import java.util.*

@Entity
@Table(name = "books")
data class BookEntity(
    @Id
    @Column(name = "id")
    val id: String = UUID.randomUUID().toString(),

    @Column(name = "title")
    val title: String,

    @Column(name = "author")
    val author: String,

    @Column(name = "year")
    val year: String,

    @Column(name = "publisher")
    val publisher: String,

    @Column(name = "owner_id")
    val ownerId: UUID,

    @Column(name = "description")
    val description: String?,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    val status: BookStatus,

    @Column(name = "url")
    val url: String?
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", UUID.randomUUID(), null, BookStatus.FREE, null)
}