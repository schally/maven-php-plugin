package org.phpmaven.plugin.build.php;

import java.io.File;

final public class Statics {
	
	public static final String testRootFolder = "/src/test/php";
	public static final String targetClassesFolder = "/target/classes";
	public static final String targetTestClassesFolder = "/target/test-classes";
	
	public static final String phpinc = "/target/phpinc";
	private final File baseDir;
	public Statics(File baseDir) {
		this.baseDir = baseDir;
		
	}
	public String getTargetClassesFolder() {
		return baseDir.getAbsoluteFile()+targetClassesFolder;
	}
	public String getTargetTestClassesFolder() {
		return baseDir.getAbsoluteFile()+targetTestClassesFolder;
	}
	public String getPhpInc() { 
		return baseDir.getAbsoluteFile()+phpinc;
	}
	
}