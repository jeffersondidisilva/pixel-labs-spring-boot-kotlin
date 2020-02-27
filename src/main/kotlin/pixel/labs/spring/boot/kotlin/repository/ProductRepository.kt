package pixel.labs.spring.boot.kotlin.repository

import org.springframework.data.repository.CrudRepository
import pixel.labs.spring.boot.kotlin.models.Product

interface ProductRepository : CrudRepository<Product, Long>