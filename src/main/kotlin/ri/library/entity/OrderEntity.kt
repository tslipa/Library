package ri.library.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import ri.library.enum.OrderStatus
import java.util.*

@Entity
@Table(name = "orders")
data class OrderEntity(
    @Id val id: String = UUID.randomUUID().toString(),
    val userId: UUID,
    val bookId: UUID,
    val status: OrderStatus,
    val orderDate: Long,
    val startDate: Long?,
    val endDate: Long?,
    val remarks: String?
) {
    constructor() : this(UUID.randomUUID().toString(), UUID.randomUUID(), UUID.randomUUID(), OrderStatus.NEW, Date().time, null, null, null)
}