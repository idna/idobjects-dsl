package util;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;

public class TemplateUtil{

    private static final Map<String, String> primitveToWrapper = new LinkedHashMap<String, String>();

    static{
        primitveToWrapper.put( "byte", "Byte" );
        primitveToWrapper.put( "short", "Short" );
        primitveToWrapper.put( "int", "Integer" );
        primitveToWrapper.put( "long", "Long" );
        primitveToWrapper.put( "float", "Float" );
        primitveToWrapper.put( "double", "Double" );
        primitveToWrapper.put( "boolean", "Float" );
        primitveToWrapper.put( "char", "Character" );
    }

    public static String classFileName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        String packagePath = pkg.getName().replace( ".", File.separator );
        return packagePath + "/" + e.getName() + ".java";
    }

    public static String mdClassFileName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        String packagePath = pkg.getName().replace( ".", File.separator );
        return packagePath + "/" + e.getName() + "MD.java";
    }

    public static String propertyName( EntityProperty entityProperty ){
        return entityProperty.getPropertyName();
    }

    public static String propertyType( EntityProperty entityProperty ){
        return entityProperty.getPropertyType();
    }

    public static String propertyCastType( EntityProperty entityProperty ){
        if( primitveToWrapper.containsKey( entityProperty.getPropertyType() ) ) return primitveToWrapper.get( entityProperty.getPropertyType() );
        return entityProperty.getPropertyType();
    }

    public static String packageName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        return pkg.getName();
    }

    public static String setterName( EntityProperty p ){
        return "set" + firstLetterUp( p.getPropertyName() );
    }

    public static String getterName( EntityProperty p ){
        return "get" + firstLetterUp( p.getPropertyName() );
    }

    private static String firstLetterUp( String string ){
        return string.substring( 0, 1 ).toUpperCase() + string.substring( 1 );
    }

    public static String propertyTypeClass( EntityProperty property ){
        String propertyType = property.getPropertyType();
        return propertyType + ".class";
    }

    public static String staticName( EntityProperty property ){
        String name = property.getPropertyName();
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < name.length(); i++ ){
            char c = name.charAt( i );
            if( Character.isUpperCase( c ) ){
                result.append( "_" );
            }
            result.append( Character.toUpperCase( c ) );
        }
        return result.toString();
    }

    public static String entityName( EntityProperty property ){
        Entity entity = ( Entity )property.eContainer();
        return entity.getName();
    }

}
