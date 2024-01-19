package aejluis.spring.com.springudemy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
		@PropertySource(value="classpath:configuration.properties", encoding = "UTF-8")
})
public class AppConfiguration {

}
