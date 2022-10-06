package javaPackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "Testing file handling in java";
        FileWriter fw = new FileWriter("C:\\Vihita\\InfoTek\\automation\\FileExample.txt");
        
    for(int i=0;i<str.length();i++)
    {
        
        fw.write(str.charAt(i));
    }
    fw.close();
	}

}