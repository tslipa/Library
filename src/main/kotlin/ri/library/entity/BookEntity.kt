package ri.library.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import ri.library.enum.BookStatus
import java.util.*

@Table("Books")
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