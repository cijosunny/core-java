package com.corejava.access.modifiers.anotherpack;

import com.corejava.access.modifiers.PublicClass;

public strictfp class AccessCheck extends PublicClass{
	PublicClass pc = new PublicClass();
	
//	DefaultClass dc = new DefaultClass();	// Cannot be accessed here - Only in same package
}
