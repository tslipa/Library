package ri.library.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import ri.library.dto.OrderDTO
import ri.library.entity.OrderEntity

@Mapper
interface OrderMapper {
    fun mapToDto(entity: OrderEntity): OrderDTO

    @Mapping(target = "id", ignore = true)
    fun mapToEntity(dto: OrderDTO): OrderEntity
}