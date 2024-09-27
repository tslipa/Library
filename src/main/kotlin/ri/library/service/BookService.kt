package ri.library.service

import org.springframework.stereotype.Service
import ri.library.entity.BookEntity
import ri.library.enum.BookStatus
import ri.library.repository.BookRepository
import java.util.*

@Service
class BookService(
    private val bookRepository: BookRepository
) {
    fun addBook(book: BookEntity) : BookEntity {
        return bookRepository.save(book)
    }

    fun deleteBook(book: BookEntity) {
        bookRepository.delete(book)
    }

    fun getAllBooks(): List<BookEntity> {
        return bookRepository.findAll().toList()
    }

    fun getBooksForStatus(status: BookStatus): List<BookEntity> {
        return bookRepository.findByStatus(status)
    }

    fun getBooksForOwnerId(ownerId: UUID): List<BookEntity> {
        return bookRepository.findByOwnerId(ownerId)
    }
}