package ri.library.entity

import jakarta.persistence.*
import ri.library.enums.OrderStatus
import java.util.*

@Entity
@Table(name = "orders")
data class OrderEntity(
    @Id
    @Column(name = "id")
    var id: String? = UUID.randomUUID().toString(),

    @Column(name = "user_id")
    var userId: String,

    @Column(name = "book_id")
    var bookId: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: OrderStatus,

    @Column(name = "order_date")
    var orderDate: Long,

    @Column(name = "start_date")
    var startDate: Long?,

    @Column(name = "end_date")
    var endDate: Long?,

    @Column(name = "remarks")
    var remarks: String?
) {
    constructor() : this(UUID.randomUUID().toString(), "", "", OrderStatus.NEW, Date().time, null, null, null)
}