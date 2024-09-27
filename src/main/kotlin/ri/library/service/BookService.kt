package ri.library.service

import org.springframework.stereotype.Service
import ri.library.repository.BookRepository

@Service
class BookService(
    private val bookRepository: BookRepository
) {

}