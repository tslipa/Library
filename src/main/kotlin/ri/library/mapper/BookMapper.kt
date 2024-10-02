package ri.library.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import ri.library.dto.BookDTO
import ri.library.entity.BookEntity

@Mapper
interface BookMapper {
    fun mapToDto(entity: BookEntity): BookDTO

    @Mapping(target = "id", ignore = true)
    fun mapToEntity(dto: BookDTO): BookEntity
}