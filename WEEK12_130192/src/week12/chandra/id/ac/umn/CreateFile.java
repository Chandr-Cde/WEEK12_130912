package week12.chandra.id.ac.umn;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "+ Obj.getName());
			}
			else {
				System.out.println("File already exist");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}
	}
}
