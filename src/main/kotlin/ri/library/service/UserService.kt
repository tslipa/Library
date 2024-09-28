package ri.library.service

import org.springframework.beans.BeanUtils
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import ri.library.dto.UserDTO
import ri.library.entity.UserEntity
import ri.library.repository.UserRepository

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun save(user: UserDTO): UserDTO {
        val savedEntity = userRepository.save(mapDtoToEntity(user))
        return mapEntityToDto(savedEntity)
    }

    fun delete(id: String) {
        userRepository.deleteById(id)
    }

    fun getById(id: String): UserDTO {
        val foundEntity = userRepository.findById(id).orElseThrow { NotFoundException() }
        return mapEntityToDto(foundEntity)
    }

    fun getAll(): List<UserDTO> {
        val foundEntityList = userRepository.findAll().toList()
        return foundEntityList.map { mapEntityToDto(it) }
    }

    private fun mapDtoToEntity(dto: UserDTO): UserEntity {
        val entity = UserEntity()
        BeanUtils.copyProperties(dto, entity)
        return entity
    }

    private fun mapEntityToDto(entity: UserEntity): UserDTO {
        val dto = UserDTO()
        BeanUtils.copyProperties(entity, dto)
        return dto
    }

}