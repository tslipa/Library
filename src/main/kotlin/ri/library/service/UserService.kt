package ri.library.service

import org.springframework.stereotype.Service
import ri.library.entity.UserEntity
import ri.library.repository.UserRepository

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
}