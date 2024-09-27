package ri.library.entity

import jakarta.persistence.Id
import jakarta.persistence.Table
import ri.library.enum.OrderStatus
import java.util.*

@Table(name = "Orders")
data class OrderEntity(
    @Id val id: UUID?,
    val userId: UUID,
    val bookId: UUID,
    val status: OrderStatus,
    val orderDate: Long,
    val startDate: Long?,
    val endDate: Long?,
    val remarks: String?
)