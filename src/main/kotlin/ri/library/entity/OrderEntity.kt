package ri.library.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import ri.library.enum.BookStatus
import ri.library.enum.OrderStatus
import java.util.*

@Table("Orders")
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