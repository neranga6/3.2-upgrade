package com.nationwide.edm.authoring

import java.beans.PropertyEditorSupport

class LongEditor extends PropertyEditorSupport {
	void setAsText(String s) {
		if (s) value = s as Long
	}

	public String getAsText() {
		value
	}
}
