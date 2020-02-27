package pixel.labs.spring.boot.kotlin.swagger

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis( RequestHandlerSelectors.basePackage( "pixel.labs.spring.boot.kotlin.controllers" ) )
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())

    fun apiInfo(): ApiInfo? {
        return ApiInfoBuilder()
                .title("Product Catalog")
                .description("Basic API implemented using Spring Boot and Kotlin")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build()
    }
}