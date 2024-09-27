package ri.library.service

import org.springframework.stereotype.Service
import ri.library.repository.UserRepository

@Service
class UserService(
    private val userRepository: UserRepository
) {

}