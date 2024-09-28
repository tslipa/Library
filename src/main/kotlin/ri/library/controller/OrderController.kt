package ri.library.controller;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ri.library.dto.OrderDTO
import ri.library.service.OrderService

@RestController
@RequestMapping("/orders")
class OrderController(
    val orderService: OrderService
) {
    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): OrderDTO {
        return orderService.getById(id)
    }
}
