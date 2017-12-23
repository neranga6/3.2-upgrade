package com.nationwide.edm.authoring

class Model {
	
	String templateStyle
	
	Date lastUpdated
	Date dateCreated

    static constraints = {
		templateStyle blank:false
	}
	
	String toString() {
		templateStyle
   }
}
