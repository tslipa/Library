package ri.library.repository

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import ri.library.entity.OrderEntity
import ri.library.enum.OrderStatus
import java.util.*

interface OrderRepository : CrudRepository<OrderEntity, String> {
    @Query("UPDATE OrderEntity e SET e.status = :status WHERE e.id = :orderId")
    @Modifying
    fun updateOrderStatus(orderId: String, status: OrderStatus)

    fun findByUserId(userId: UUID): List<OrderEntity>

    fun findByUserIdAndStatusIn(userId: UUID, status: List<OrderStatus>): List<OrderEntity>
}