package pixel.labs.spring.boot.kotlin.models

import javax.persistence.*

@Entity
data class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val value: Double,

    @Column(nullable = false)
    val quantity: Int
)