package cd;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cd {
	public static void main(String[] args) {
            try {
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		JefeEmpleados jefebean = (JefeEmpleados) context.getBean("Jefe", JefeEmpleados.class);
		SecretariaEmpleados secrbean = (SecretariaEmpleados) context.getBean("Secretaria", SecretariaEmpleados.class);
		IntendenteEmpleados intbean = (IntendenteEmpleados) context.getBean("Intendente", IntendenteEmpleados.class);
		DirectorEmpleados dirbean = (DirectorEmpleados) context.getBean("Director", DirectorEmpleados.class);
		ProfesorEmpleados profbean = (ProfesorEmpleados) context.getBean("Profesor", ProfesorEmpleados.class);
                jefebean.setNombre("Pedro ");
                secrbean.setNombre("Pancho ");
                intbean.setNombre("Alicia ");
                dirbean.setNombre("Samir ");
                profbean.setNombre("Alonso ");
		System.out.println(jefebean.getNombre()+jefebean.getTarea());
		System.out.println(secrbean.getNombre()+secrbean.getTarea());
		System.out.println(intbean.getNombre()+intbean.getTarea());
		System.out.println(dirbean.getNombre()+dirbean.getTarea());
		System.out.println(profbean.getNombre()+profbean.getTarea());
                
            } catch (Exception e) {
            }

	}
}