package ri.library.dto

import ri.library.enums.OrderStatus

class OrderDTO {
    var id: String? = null
    lateinit var userId: String
    lateinit var bookId: String
    lateinit var status: OrderStatus
    var orderDate: Long = 0
    var startDate: Long? = null
    var endDate: Long? = null
    var remarks: String? = null
}