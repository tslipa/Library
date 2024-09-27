package ri.library.repository

import org.springframework.data.repository.CrudRepository
import ri.library.entity.OrderEntity
import java.util.*

interface OrderRepository : CrudRepository<OrderEntity, String>