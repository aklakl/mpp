package com.mpp.extra.methodreference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyExceptionTest {

	public void test() {
		String filePath = "C:\\Users\\985462\\Desktop\\words.txt";
		String newFilePath = "C:\\Users\\985462\\Desktop\\words_copy.txt";

		try (FileReader f = new FileReader(filePath);
				
			BufferedReader br = new BufferedReader(f)) {
			String line = "";
			
			try (FileWriter fw = new FileWriter(newFilePath);
					BufferedWriter bw = new BufferedWriter(fw)) {
				while ((line = br.readLine()) != null) {

//					System.out.println(line);
					fw.write("---------> "+line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyExceptionTest().test();
	}

}
