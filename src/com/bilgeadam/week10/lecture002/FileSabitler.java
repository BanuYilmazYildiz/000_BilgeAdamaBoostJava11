package com.bilgeadam.week10.lecture002;

import java.io.File;
import java.nio.file.Path;

public class FileSabitler {

//	public static String path = "C:/Users/pc/Desktop/Java-11/Eclipse Workspace/000__BilgeAdamBoostJava11/fileislemler.txt";
//	public static File file = new File(path);
	public static Path path = Path
			.of("C:/Users/pc/Desktop/Java-11/Eclipse Workspace/000__BilgeAdamBoostJava11/fileislemler.txt");
	public static File file = new File(path.toString()); // path türünü stringe cevirip veriyor

}
