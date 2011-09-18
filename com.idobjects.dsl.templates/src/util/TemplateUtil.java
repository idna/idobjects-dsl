package util;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.idobjects.api.md.ReferenceType;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;

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

    public TemplateUtil(){
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
        return entityProperty.getName();
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
        return "set" + firstLetterUp( p.getName() );
    }

    public static String getterName( EntityProperty p ){
        return "get" + firstLetterUp( p.getName() );
    }

    private static String firstLetterUp( String string ){
        return string.substring( 0, 1 ).toUpperCase() + string.substring( 1 );
    }

    public static String propertyTypeClass( EntityProperty property ){
        String propertyType = property.getPropertyType();
        return propertyType + ".class";
    }

    public static String staticName( EntityProperty property ){
        StringBuilder result = allUpperCase( property.getName() );
        return result.toString();
    }

    public static String staticName( EntityReference reference ){
        StringBuilder result = allUpperCase( reference.getName() );
        return result.toString();
    }

    public static StringBuilder allUpperCase( String string ){
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < string.length(); i++ ){
            char c = string.charAt( i );
            if( Character.isUpperCase( c ) ){
                result.append( "_" );
            }
            result.append( Character.toUpperCase( c ) );
        }
        return result;
    }

    public static String entityName( EntityProperty property ){
        Entity entity = ( Entity )property.eContainer();
        return entity.getName();
    }

    public static String entityName( EntityReference entityReference ){
        Entity entity = ( Entity )entityReference.eContainer();
        return entity.getName();
    }

    public static String destinationName( EntityReference reference ){
        if( reference.getListDestination() != null ){
            return reference.getListDestination().getName();
        }
        else{
            return reference.getSingleDestination().getName();
        }
    }

    public static String inverseName( EntityReference reference ){
        if( reference.getInverseName() == null ) return "null";
        return reference.getInverseName();
    }

    public static boolean hasInverse( EntityReference reference ){
        if(reference.getInverseName() != null) return true;
//        String destinationName= destinationName( reference );
        return false;
        
    }

    public String referenceType( EntityReference reference ){
        if( reference.getListDestination() != null ) return ReferenceType.LIST.name();

        return ReferenceType.SINGLE.name();
    }

}
