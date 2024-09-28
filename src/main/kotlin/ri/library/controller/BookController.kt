package ri.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;
import ri.library.dto.BookDTO
import ri.library.service.BookService

@RestController
@RequestMapping("/books")
class BookController(
    val bookService: BookService
) {
    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: String): BookDTO {
        return bookService.getBookById(id)
    }
}
