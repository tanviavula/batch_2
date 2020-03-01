package com.nubes.cj.basics.day38;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class MyReader{
	
		public String readDataFromFile(String filePath) throws IOException {
			List<String> list = Files.readAllLines(Paths.get(filePath));
			String data = "";
			for(String l:list) {
				data += l +"--";
			}
			return data;
		}
}

public class ThrowAndThrows {

		public static void main(String[] args) {
			MyReader obj = new MyReader();
			String data = "";
			try {
				data = obj.readDataFromFile("employee.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(data);
			System.out.println("End of the main method");
		}
}
