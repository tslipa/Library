package ri.library.repository

import org.springframework.data.repository.CrudRepository
import ri.library.entity.BookEntity
import ri.library.enum.BookStatus

interface BookRepository : CrudRepository<BookEntity, String> {
    fun findByStatus(status: BookStatus): List<BookEntity>

    fun findByOwnerId(ownerId: String): List<BookEntity>
}