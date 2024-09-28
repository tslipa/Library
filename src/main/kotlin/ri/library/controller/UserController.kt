package ri.library.controller;

import org.springframework.web.bind.annotation.*
import ri.library.dto.UserDTO
import ri.library.service.UserService

@RestController
@RequestMapping("/users")
class UserController(
    val userService: UserService,
) {
    @PostMapping
    fun save(@RequestBody user: UserDTO): UserDTO {
        return userService.save(user)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody user: UserDTO): UserDTO {
        return userService.save(user)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        userService.delete(id)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): UserDTO {
        return userService.getById(id)
    }

    @GetMapping
    fun getAll(): List<UserDTO> {
        return userService.getAll()
    }
}
