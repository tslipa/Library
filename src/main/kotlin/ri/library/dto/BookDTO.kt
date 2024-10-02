package ri.library.dto

import ri.library.enums.BookStatus

class BookDTO {
    var id: String? = null
    lateinit var title: String
    lateinit var author: String
    lateinit var year: String
    lateinit var publisher: String
    lateinit var ownerId: String
    var description: String? = null
    lateinit var status: BookStatus
    var url: String? = null
}