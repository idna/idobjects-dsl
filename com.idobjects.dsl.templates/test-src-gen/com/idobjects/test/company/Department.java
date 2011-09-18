
			
		package com.idobjects.test.company;
		
		import com.idobjects.api.AbstractIdObject;
		import com.idobjects.api.ModelScope;
		import com.idobjects.api.ObjectIdentifier;
		
		
		public class Department extends AbstractIdObject {
	
		public Department(ModelScope modelScope, ObjectIdentifier objectId) {
			super(modelScope, objectId);
		}
		
		
		
	
	public void setName(String name) {
		 setPropertyValue( DepartmentMD.NAME, name );
	}
	
	public String getName() {
		return (String) getPropertyValue( DepartmentMD.NAME );	
	}


		}  
	
	