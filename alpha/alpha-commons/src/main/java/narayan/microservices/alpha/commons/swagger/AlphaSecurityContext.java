package narayan.microservices.alpha.commons.swagger;

/*
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*/

/**
 * Configuration to bypass spring-security for Swagger UI resources.
 *
 * @author narayana
 */
//@Configuration
//public class AlphaSecurityContext extends WebSecurityConfigurerAdapter {
//
//    private static final String[] AUTH_WHITELIST = {
//            // -- swagger ui
//            "/swagger-resources/**",
//            "/swagger-ui.html",
//            "/v2/api-docs",
//            "/webjars/**",
//            "/aps/**"
//    };
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(AUTH_WHITELIST).permitAll()
//                .antMatchers("/**/*").permitAll();
//    }
//}
