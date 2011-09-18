package util;

import java.io.File;

import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;

public class TemplateUtil {

	public static String classFileName(Entity e) {
		com.idobjects.dsl.idObjectsDsl.Package pkg = (com.idobjects.dsl.idObjectsDsl.Package) e.eContainer();
		String packagePath = pkg.getName().replace(".", File.separator);
		return packagePath + "/" + e.getName() + ".java"; 
	}
	
	public static String propertyName(EntityProperty entityProperty){
		return entityProperty.getPropertyName();
	}
	
	public static String propertyType(EntityProperty entityProperty){
		return entityProperty.getPropertyType();
	}
	
	public static String packageName(Entity e) {
		com.idobjects.dsl.idObjectsDsl.Package pkg = (com.idobjects.dsl.idObjectsDsl.Package) e.eContainer();
		return pkg.getName();
	}
	

}
