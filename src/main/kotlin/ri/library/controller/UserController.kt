package ri.library.controller;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ri.library.dto.UserDTO
import ri.library.service.UserService

@RestController
@RequestMapping("/users")
class UserController(
    val userService: UserService,
) {
    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): UserDTO {
        return userService.getById(id)
    }
}
