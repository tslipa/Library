package ri.library.repository

import org.springframework.data.repository.CrudRepository
import ri.library.entity.OrderEntity
import ri.library.enum.OrderStatus
import java.util.*

interface OrderRepository : CrudRepository<OrderEntity, String> {
    fun updateOrderStatus(orderId: String, status: OrderStatus)

    fun findByUserId(userId: UUID): List<OrderEntity>

    fun findByUserIdAndStatusIn(userId: UUID, status: List<OrderStatus>): List<OrderEntity>
}