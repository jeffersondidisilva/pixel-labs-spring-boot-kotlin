package pixel.labs.spring.boot.kotlin.controllers

import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import pixel.labs.spring.boot.kotlin.models.Product
import pixel.labs.spring.boot.kotlin.repository.ProductRepository

@Api(tags = ["Products"])
@RestController
class ProductController @Autowired constructor(val repository: ProductRepository) {

    @GetMapping("/products/{id}")
    fun get(@PathVariable id: Long) = repository.findById(id).get()

    @GetMapping("/products")
    fun get() : List<Product> = repository.findAll().toList()

    @PostMapping("/products")
    fun post(@RequestBody product: Product) = repository.save(product)

    @PutMapping("/products")
    fun put(@RequestBody product: Product) = repository.save(product)

    @DeleteMapping("/products/{id}")
    fun delete(@PathVariable id: Long) = repository.deleteById(id)

}