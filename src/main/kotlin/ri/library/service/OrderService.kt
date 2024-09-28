package ri.library.service

import org.springframework.beans.BeanUtils
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import ri.library.dto.OrderDTO
import ri.library.entity.OrderEntity
import ri.library.enum.OrderStatus
import ri.library.repository.OrderRepository

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {
    fun save(order: OrderDTO): OrderDTO {
        val savedEntity = orderRepository.save(mapDtoToEntity(order))
        return mapEntityToDto(savedEntity)
    }

    fun delete(id: String) {
        orderRepository.deleteById(id)
    }

    fun getById(id: String): OrderDTO {
        val foundEntity = orderRepository.findById(id).orElseThrow { NotFoundException() }
        return mapEntityToDto(foundEntity)
    }

    fun getAll(): List<OrderDTO> {
        val foundEntityList = orderRepository.findAll().toList()
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getOrdersForUser(userId: String): List<OrderDTO> {
        val foundEntityList = orderRepository.findByUserId(userId)
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun getCurrentOrdersForUser(userId: String): List<OrderDTO> {
        val foundEntityList = orderRepository.findByUserIdAndStatusIn(userId, arrayListOf()) // TODO
        return foundEntityList.map { mapEntityToDto(it) }
    }

    fun changeOrderStatus(orderId: String, newStatus: OrderStatus) {
        return orderRepository.updateOrderStatus(orderId, newStatus)
    }

    private fun mapDtoToEntity(dto: OrderDTO): OrderEntity {
        val entity = OrderEntity()
        BeanUtils.copyProperties(dto, entity)
        return entity
    }

    private fun mapEntityToDto(entity: OrderEntity): OrderDTO {
        val dto = OrderDTO()
        BeanUtils.copyProperties(entity, dto)
        return dto
    }

}