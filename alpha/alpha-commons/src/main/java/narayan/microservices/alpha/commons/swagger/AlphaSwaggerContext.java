package narayan.microservices.alpha.commons.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

/**
 *
 * @author narayana
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "narayan.microservices.alpha.commons.swagger" })
public class AlphaSwaggerContext {

    private AlphaSwaggerProperties alphaSwaggerProperties;

    public AlphaSwaggerContext(AlphaSwaggerProperties alphaSwaggerProperties) {
        this.alphaSwaggerProperties = alphaSwaggerProperties;
    }

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(basePackage(alphaSwaggerProperties.getApiBasePackages()))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(alphaSwaggerProperties.getApiTitle())
                .description(alphaSwaggerProperties.getApiDescription())
                .version(alphaSwaggerProperties.getApiVersion())
                .contact(contact()).build();
    }

    private Contact contact() {
        return new Contact(alphaSwaggerProperties.getContactName(),
                alphaSwaggerProperties.getContactUrl(), alphaSwaggerProperties.getContactEmail());
    }

}
