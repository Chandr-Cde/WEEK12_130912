package week12.chandra.id.ac.umn;

import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Nama saya Chandra\n");
			Writer.write("Saya dari Universitas");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}

	}

}
