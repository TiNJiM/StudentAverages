import java.io.*;
import java.util.*;
public class StudentAverages_out {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("U:\\Workshop\\StudentAverages\\StudentAverages.out");
		PrintWriter output = new PrintWriter(fw);
		Scanner sf = new Scanner(new File("U:\\Workshop\\StudentAverages\\StudentScores.in"));
		String text[] = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		String name = "";

		for(int j = 0; j <=maxIndx; j++){
			Scanner sc = new Scanner(text[j]);
			int count = 0;
			int avg = 0;
			name = sc.next();
			while(sc.hasNext()) {
				avg = avg + sc.nextInt();
				count++;
			}
			avg = (int) Math.round((double)avg/count);
			output.println(name + ", average = " + avg);
		}
		output.close();
		fw.close();
	}
}
