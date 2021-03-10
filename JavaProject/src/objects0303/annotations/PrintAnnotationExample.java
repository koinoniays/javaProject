package objects0303.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Constructor[] constructos = Service.class.getDeclaredConstructors();
		Field[] fields = Service.class.getDeclaredFields();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println("[" + method.getName() + "]");
				
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();

			}
		}
	}

}
