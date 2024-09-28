package ri.library.controller;

import org.springframework.web.bind.annotation.*
import ri.library.dto.BookDTO
import ri.library.service.BookService

@RestController
@RequestMapping("/books")
class BookController(
    val bookService: BookService
) {
    @PostMapping
    fun save(@RequestBody book: BookDTO): BookDTO {
        return bookService.save(book)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody book: BookDTO): BookDTO {
        return bookService.save(book)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        bookService.delete(id)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): BookDTO {
        return bookService.getById(id)
    }

    @GetMapping
    fun getAll(): List<BookDTO> {
        return bookService.getAll()
    }
}
