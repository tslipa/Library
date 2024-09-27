package ri.library.service

import org.springframework.stereotype.Service
import ri.library.repository.OrderRepository

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {

}