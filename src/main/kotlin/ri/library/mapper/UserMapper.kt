package ri.library.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import ri.library.dto.UserDTO
import ri.library.entity.UserEntity

@Mapper
interface UserMapper {
    fun mapToDto(entity: UserEntity): UserDTO

    @Mapping(target = "id", ignore = true)
    fun mapToEntity(dto: UserDTO): UserEntity
}