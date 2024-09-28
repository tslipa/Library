package ri.library.entity

import jakarta.persistence.*
import ri.library.enum.OrderStatus
import java.util.*

@Entity
@Table(name = "orders")
data class OrderEntity(
    @Id
    @Column(name = "id")
    val id: String = UUID.randomUUID().toString(),

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "book_id")
    val bookId: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    val status: OrderStatus,

    @Column(name = "order_date")
    val orderDate: Long,

    @Column(name = "start_date")
    val startDate: Long?,

    @Column(name = "end_date")
    val endDate: Long?,

    @Column(name = "remarks")
    val remarks: String?
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", OrderStatus.NEW, Date().time, null, null, null)
}