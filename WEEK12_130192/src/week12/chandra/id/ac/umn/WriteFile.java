package week12.chandra.id.ac.umn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		try {
			File Obj = new File("myfile.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}
	}
}
