package ri.library.service

import org.springframework.stereotype.Service
import ri.library.entity.UserEntity
import ri.library.repository.UserRepository
import java.util.*

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun createUser(user: UserEntity): UserEntity {
        return userRepository.save(user)
    }

    fun deleteUser(user: UserEntity) {
        userRepository.delete(user)
    }

    fun getUserById(id: String): Optional<UserEntity> {
        return userRepository.findById(id)
    }

    fun getAllUsers(): List<UserEntity> {
        return userRepository.findAll().toList()
    }
}