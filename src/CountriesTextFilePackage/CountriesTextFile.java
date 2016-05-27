package CountriesTextFilePackage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.*;

public class CountriesTextFile {
	String fileString= "countries.txt";
	Path filePath= Paths.get(fileString);{
	if (Files.notExists(filePath)) {
	try {
		Files.createFile(filePath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}