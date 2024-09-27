package ri.library.service

import org.springframework.stereotype.Service
import ri.library.entity.OrderEntity
import ri.library.enum.OrderStatus
import ri.library.repository.OrderRepository
import java.util.UUID

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {
    fun addOrder(order: OrderEntity) : OrderEntity {
        return orderRepository.save(order)
    }

    fun editOrder(order: OrderEntity) : OrderEntity {
        return orderRepository.save(order)
    }

    fun deleteOrder(order: OrderEntity) {
        return orderRepository.delete(order)
    }

    fun getAllOrders(): List<OrderEntity> {
        return orderRepository.findAll().toList()
    }

    fun changeOrderStatus(orderId: String, newStatus: OrderStatus) {
        return orderRepository.updateOrderStatus(orderId, newStatus)
    }

    fun getOrdersForUser(userId: UUID): List<OrderEntity> {
        return orderRepository.findByUserId(userId)
    }

    fun getCurrentOrdersForUser(userId: UUID): List<OrderEntity> {
        return orderRepository.findByUserIdAndStatusIn(userId, arrayListOf()) // TODO
    }

}