package narayan.microservices.alpha.priceservice;

import narayan.microservices.alpha.commons.swagger.AlphaSwaggerContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import( {AlphaSwaggerContext.class})
public class AlphaPriceServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(AlphaPriceServiceApp.class, args);
	}
}
