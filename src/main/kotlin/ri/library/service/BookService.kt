package ri.library.service

import org.springframework.beans.BeanUtils
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import ri.library.dto.BookDTO
import ri.library.entity.BookEntity
import ri.library.enum.BookStatus
import ri.library.repository.BookRepository

@Service
class BookService(
    private val bookRepository: BookRepository
) {
    fun save(book: BookDTO): BookDTO {
        val savedEntity = bookRepository.save(mapDtoToEntity(book))
        return mapEntityToDto(savedEntity)
    }

    fun delete(id: String) {
        bookRepository.deleteById(id)
    }

    fun getById(id: String): BookDTO {
        val foundEntity = bookRepository.findById(id).orElseThrow { NotFoundException() }
        return mapEntityToDto(foundEntity)
    }

    fun getAll(): List<BookDTO> {
        val foundEntityList = bookRepository.findAll().toList()
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getBooksForStatus(status: BookStatus): List<BookDTO> {
        val foundEntityList = bookRepository.findByStatus(status)
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getBooksForOwnerId(ownerId: String): List<BookDTO> {
        val foundEntityList = bookRepository.findByOwnerId(ownerId)
        return foundEntityList.map { mapEntityToDto(it) }
    }

    private fun mapDtoToEntity(dto: BookDTO): BookEntity {
        val entity = BookEntity()
        BeanUtils.copyProperties(dto, entity)
        return entity
    }

    private fun mapEntityToDto(entity: BookEntity): BookDTO {
        val dto = BookDTO()
        BeanUtils.copyProperties(entity, dto)
        return dto
    }
}