package ri.library.repository

import org.springframework.data.repository.CrudRepository
import ri.library.entity.BookEntity

interface BookRepository : CrudRepository<BookEntity, String>