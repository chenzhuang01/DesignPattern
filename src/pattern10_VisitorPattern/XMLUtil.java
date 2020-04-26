package pattern10_VisitorPattern;

import java.lang.reflect.Field;

public class XMLUtil {
	public static Object getBean() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = Class.forName("config");
		Field className = c.getField("className");
		return className;
	}
}
