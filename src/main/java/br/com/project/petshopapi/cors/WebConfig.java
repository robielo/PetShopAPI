package br.com.project.petshopapi.cors;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @version 1.0
 * @author Lucas da Silva Novais
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {


	/**
     * Utilizado para dar as permissões para acessar todas as APIs dentro da URL http://localhost:8080/ 
     * @param  registry dados de permissão da aplicação
     * @since 11.0
     */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}