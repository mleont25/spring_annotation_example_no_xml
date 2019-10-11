package cd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean(name="Jefe")
	public JefeEmpleados getTareaJefe(){
		return new JefeEmpleados();
	}
        @Bean(name="Secretaria")
	public SecretariaEmpleados getTareaSecre(){
		return new SecretariaEmpleados();
	}
        @Bean(name="Intendente")
	public IntendenteEmpleados getTareaInten(){
		return new IntendenteEmpleados();
	}
        @Bean(name="Director")
	public DirectorEmpleados getTareaDire(){
		return new DirectorEmpleados();
	}
        @Bean(name="Profesor")
	public ProfesorEmpleados getTareaProfe(){
		return new ProfesorEmpleados();
	}
}