package com.nationwide.edm.authoring

class Category{

	String name
	User lastModBy

	Date lastUpdated
	Date dateCreated
	
    static constraints = {
		name blank:false, maxSize:50
    }
	
	String toString() {
		 name
	}
	
	static mapping = {
		sort name: "asc"
	}
}
