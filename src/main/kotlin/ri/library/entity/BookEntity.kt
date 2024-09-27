package ri.library.entity

import jakarta.persistence.Id
import jakarta.persistence.Table
import ri.library.enum.BookStatus
import java.util.*

@Table(name = "Books")
data class BookEntity(
    @Id val id: UUID?,
    val title: String,
    val author: String,
    val year: String,
    val publisher: String,
    val ownerId: UUID,
    val description: String?,
    val status: BookStatus,
    val url: String?
)