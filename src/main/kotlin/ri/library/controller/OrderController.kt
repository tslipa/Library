package ri.library.controller;

import org.springframework.web.bind.annotation.*
import ri.library.dto.OrderDTO
import ri.library.service.OrderService

@RestController
@RequestMapping("/orders")
class OrderController(
    val orderService: OrderService
) {
    @PostMapping
    fun save(@RequestBody order: OrderDTO): OrderDTO {
        return orderService.save(order)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody order: OrderDTO): OrderDTO {
        return orderService.save(order)
    }


    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        orderService.delete(id)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): OrderDTO {
        return orderService.getById(id)
    }

    @GetMapping
    fun getAll(): List<OrderDTO> {
        return orderService.getAll()
    }
}
