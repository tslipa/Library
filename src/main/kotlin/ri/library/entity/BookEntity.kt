package ri.library.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import ri.library.enum.BookStatus
import java.util.*

@Entity
@Table(name = "books")
data class BookEntity(
    @Id val id: String = UUID.randomUUID().toString(),
    val title: String,
    val author: String,
    val year: String,
    val publisher: String,
    val ownerId: UUID,
    val description: String?,
    val status: BookStatus,
    val url: String?
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", "", "", UUID.randomUUID(), null, BookStatus.FREE, null)
}