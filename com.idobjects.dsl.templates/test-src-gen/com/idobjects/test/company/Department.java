package com.idobjects.test.company;

import java.util.Collection;
import java.util.List;

import com.idobjects.api.AbstractIdObject;
import com.idobjects.api.ModelScope;
import com.idobjects.api.ObjectIdentifier;

public class Department extends AbstractIdObject{

    public Department( ModelScope modelScope, ObjectIdentifier objectId ){
        super( modelScope, objectId );
    }

    public void setName( String name ){
        setPropertyValue( DepartmentMD.NAME, name );
    }

    public String getName(){
        return ( String )getPropertyValue( DepartmentMD.NAME );
    }

    public void removeName(){
        removePropertyValue( DepartmentMD.NAME );
    }

    public void addMember( Employee toAdd ){
        addReference( DepartmentMD.MEMBERS, toAdd );
    }

    public void addMembers( Collection< ? extends Employee> toAdd ){
        addReferences( DepartmentMD.MEMBERS, toAdd );
    }

    public void removeMember( Employee toRemove ){
        removeReference( DepartmentMD.MEMBERS, toRemove );
    }

    public void removeMembers( Collection< ? extends Employee> toRemove ){
        removeReferences( DepartmentMD.MEMBERS, toRemove );
    }

    public List<Employee> getMembers(){
        return getCastedReferences( DepartmentMD.MEMBERS, Employee.class );
    }

}
