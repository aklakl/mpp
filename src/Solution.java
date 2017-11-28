
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "iuo";

		int len = s.length();

		int maxCol = (int) Math.ceil(Math.sqrt((double) len));
		int maxRow = (int) Math.floor(Math.sqrt((double) len));
		
		char[][] array = new char[maxCol][maxCol];
		int counter  = 0;

		int i = 0;
		while(counter < len){
			for (int j = 0; j < maxCol; j++) {
				if(counter < len){
					array[i][j] = s.charAt(counter);
//					System.out.println("--->"+s.charAt(counter));
				}else{
					array[i][j] = '*';
				}
				counter++;
			}
			i++;
		}
		
		if(maxRow * maxCol < len){
			maxRow = maxCol;
		}

		counter = 0;
		List<String> list = new ArrayList<>();
		for (int m = 0; m < maxCol; m++) {
			StringBuilder sb = new StringBuilder();
			for (int n = 0; n < maxRow ; n++) {
				if (counter <= len) {
					if(array[n][m] != '*'){
						sb.append(array[n][m]);
					}
					counter++;
				} 
				
			}
//			System.out.println("X"+sb.toString().trim()+"X");
			list.add(sb.toString().trim());
		}
		String ss = list.stream().collect(Collectors.joining(" "));
        System.out.println("X"+ss+"X");
	}
}