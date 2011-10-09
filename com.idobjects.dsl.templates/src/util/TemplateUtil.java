package util;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import com.idobjects.api.AbstractIdObject;
import com.idobjects.api.md.ReferenceType;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.Model;
import com.idobjects.dsl.idObjectsDsl.Package;

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

    public String classFileName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        String packagePath = pkg.getName().replace( ".", File.separator );
        return packagePath + "/" + e.getName() + ".java";
    }

    public String mdClassFileName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        String packagePath = pkg.getName().replace( ".", File.separator );
        return packagePath + "/" + e.getName() + "MD.java";
    }

    public String modelMDFileName( Model model ){
        String modelName = model.getName();
        String modelMDFileName = modelName.replace( ".", File.separator );
        return modelMDFileName + "MD.java";
    }

    public String modelMDClassName( Model model ){
        String modelName = model.getName();
        int ix = modelName.lastIndexOf( "." );
        if( ix == -1 ) return modelName;
        return modelName.substring( ix + 1 ) + "MD";
    }

    public String modelMDPackageName( Model model ){
        String modelName = model.getName();
        int ix = modelName.lastIndexOf( "." );
        if( ix == -1 ) return modelName;
        return modelName.substring( 0, ix );
    }

    public String propertyName( EntityProperty entityProperty ){
        return entityProperty.getName();
    }

    public String propertyType( EntityProperty entityProperty ){
        return entityProperty.getPropertyType();
    }

    public String propertyCastType( EntityProperty entityProperty ){
        if( primitveToWrapper.containsKey( entityProperty.getPropertyType() ) ) return primitveToWrapper.get( entityProperty.getPropertyType() );
        return entityProperty.getPropertyType();
    }

    public String packageName( Entity e ){
        com.idobjects.dsl.idObjectsDsl.Package pkg = ( com.idobjects.dsl.idObjectsDsl.Package )e.eContainer();
        return pkg.getName();
    }

    public String setterName( EntityProperty p ){
        return "set" + firstLetterUp( p.getName() );
    }

    public String setterName( EntityReference r ){
        return "set" + firstLetterUp( r.getName() );
    }

    public String getterName( EntityProperty p ){
        return "get" + firstLetterUp( p.getName() );
    }

    public String getterName( EntityReference r ){
        return "get" + firstLetterUp( r.getName() );
    }

    public String removeName( EntityProperty p ){
        return "remove" + firstLetterUp( p.getName() );
    }

    private String firstLetterUp( String string ){
        return string.substring( 0, 1 ).toUpperCase() + string.substring( 1 );
    }

    public String propertyTypeClass( EntityProperty property ){
        String propertyType = property.getPropertyType();
        return propertyType + ".class";
    }

    public String staticName( EntityProperty property ){
        StringBuilder result = allUpperCase( property.getName() );
        return result.toString();
    }

    public String staticName( EntityReference reference ){
        StringBuilder result = allUpperCase( reference.getName() );
        return result.toString();
    }

    public StringBuilder allUpperCase( String string ){
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

    public String entityName( EntityProperty property ){
        Entity entity = ( Entity )property.eContainer();
        return entity.getName();
    }

    public String entityName( EntityReference entityReference ){
        Entity entity = ( Entity )entityReference.eContainer();
        return entity.getName();
    }

    public String destinationName( EntityReference reference ){
        if( reference.getListDestination() != null ){
            return reference.getListDestination().getName();
        }
        else{
            return reference.getSingleDestination().getName();
        }
    }

    public String inverseName( EntityReference reference ){
        String result = getInverseNameImpl( reference );
        if( result == null ) return "null";
        return result;
    }

    public boolean hasInverse( EntityReference reference ){
        return getInverseNameImpl( reference ) != null;
    }

    private String getInverseNameImpl( EntityReference reference ){
        if( reference.getInverseName() != null ) return reference.getInverseName();
        String destinationName = destinationName( reference );

        Entity entity = ( Entity )reference.eContainer();
        Model model = ( Model )entity.eContainer().eContainer();
        Entity destinationEntity = searchEntity( model, destinationName );

        for( EntityReference destinationEntityReference : destinationEntity.getReferences() ){
            Entity destEntity;

            if( destinationEntityReference.getListDestination() != null ) destEntity = destinationEntityReference.getListDestination();
            else destEntity = destinationEntityReference.getSingleDestination();

            if( !destEntity.equals( entity ) ) continue;
            if( destinationEntityReference.getInverseName() == null ) continue;

            if( destinationEntityReference.getInverseName().equals( reference.getName() ) ) return destinationEntityReference.getName();

        }
        return null;
    }

    private Entity searchEntity( Model model, String enitityName ){
        for( Package pkg : model.getPackages() ){
            for( Entity entity : pkg.getEntities() ){
                if( entity.getName().equals( enitityName ) ) return entity;
            }
        }
        throw new RuntimeException( "No entity found with name " + enitityName );
    }

    private Entity getEntity( String entityName, Model model ){
        EList<Package> packages = model.getPackages();
        for( Package pkg : packages ){
            for( Entity entity : pkg.getEntities() ){
            }
        }
        return null;

    }

    public String referenceType( EntityReference reference ){
        if( reference.getListDestination() != null ) return ReferenceType.LIST.name();
        return ReferenceType.SINGLE.name();
    }

    public boolean isListReference( EntityReference reference ){
        return reference.getListDestination() != null;
    }

    public String addName( EntityReference reference ){
        String suffix = firstLetterUp( reference.getName() );
        if( suffix.endsWith( "s" ) ) suffix = suffix.substring( 0, suffix.length() - 1 );
        return "add" + suffix;
    }

    public String addNameCollection( EntityReference reference ){
        String suffix = firstLetterUp( reference.getName() );
        return "add" + suffix;
    }

    public String removeName( EntityReference reference ){
        String suffix = firstLetterUp( reference.getName() );
        if( suffix.endsWith( "s" ) ) suffix = suffix.substring( 0, suffix.length() - 1 );
        return "remove" + suffix;
    }

    public String removeNameCollection( EntityReference reference ){
        String suffix = firstLetterUp( reference.getName() );
        return "remove" + suffix;
    }

    public List<String> imports( Entity e ){
        List<String> result = new ArrayList<String>();
        result.add( "java.util.Collection" );
        result.add( "java.util.List" );

        result.add( "com.idobjects.api.AbstractIdObject" );
        result.add( "com.idobjects.api.ModelScope" );
        result.add( "com.idobjects.api.ObjectIdentifier" );

        result.add( "org.joda.time.Instant" );
        result.add( "org.joda.time.DateTime" );
        return result;
    }

    public List<String> importsMD( Entity e ){
        List<String> result = new ArrayList<String>();
        result.add( "java.util.Collections" );
        result.add( "java.util.List" );
        result.add( "java.util.ArrayList" );

        result.add( "com.idobjects.api.md.IdObjectMD" );
        result.add( "com.idobjects.api.md.IdObjectPropertyMD" );
        result.add( "com.idobjects.api.md.IdObjectReferenceMD" );
        result.add( "com.idobjects.api.md.ReferenceType" );

        result.add( "org.joda.time.Instant" );
        result.add( "org.joda.time.DateTime" );
        return result;
    }

    public String superClass( Entity e ){
        return AbstractIdObject.class.getSimpleName();
    }

}
