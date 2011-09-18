package com.idobjects.test.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.idobjects.api.md.IdObjectMD;
import com.idobjects.api.md.IdObjectPropertyMD;
import com.idobjects.api.md.IdObjectReferenceMD;
import com.idobjects.api.md.ReferenceType;

public final class DepartmentMD extends IdObjectMD{

    public static final IdObjectPropertyMD NAME = new IdObjectPropertyMD( "name", String.class );

    public static final IdObjectReferenceMD MEMBERS = new IdObjectReferenceMD( DepartmentMD.class, EmployeeMD.class, "members", "department", true, ReferenceType.LIST, null );

    public static final List<IdObjectPropertyMD> PROPERTIES;
    public static final List<IdObjectReferenceMD> REFERENCES;

    static{
        List<IdObjectPropertyMD> properties = new ArrayList<IdObjectPropertyMD>();

        properties.add( NAME );

        PROPERTIES = Collections.unmodifiableList( properties );

        List<IdObjectReferenceMD> references = new ArrayList<IdObjectReferenceMD>();

        references.add( MEMBERS );

        REFERENCES = Collections.unmodifiableList( references );
    }

    private static final DepartmentMD instance = new DepartmentMD();

    public static final DepartmentMD instance(){
        return instance;
    }

    private DepartmentMD(){
        super( Department.class.getName(), PROPERTIES, REFERENCES );
    }

}
