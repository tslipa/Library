package ri.library.service

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import ri.library.dto.BookDTO
import ri.library.entity.BookEntity
import ri.library.enum.BookStatus
import ri.library.repository.BookRepository
import java.util.*

@Service
class BookService(
    private val bookRepository: BookRepository
) {
    fun addBook(book: BookEntity) : BookDTO {
        val savedEntity = bookRepository.save(book)
        return mapEntityToDto(savedEntity)
    }

    fun deleteBook(book: BookEntity) {
        bookRepository.delete(book)
    }

    fun getBookById(id: String) : BookDTO {
        val foundEntity = bookRepository.findById(id).orElseThrow { NotFoundException() }
        return mapEntityToDto(foundEntity)
    }

    fun getAllBooks(): List<BookDTO> {
        val foundEntityList = bookRepository.findAll().toList()
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getBooksForStatus(status: BookStatus): List<BookDTO> {
        val foundEntityList = bookRepository.findByStatus(status)
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getBooksForOwnerId(ownerId: UUID): List<BookDTO> {
        val foundEntityList = bookRepository.findByOwnerId(ownerId)
        return foundEntityList.map { mapEntityToDto(it) }
    }

    private fun mapDtoToEntity(dto: BookDTO): BookEntity {
        // TODO
        return BookEntity()
    }

    private fun mapEntityToDto(entity: BookEntity): BookDTO {
        // TODO
        return BookDTO()
    }
}