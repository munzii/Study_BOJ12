import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0]= Integer.parseInt(st.nextToken());
			arr[i][1]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[]x, int[]y) {
				if(x[1]==y[1]) {
					return Integer.compare(x[0], y[0]);
				}
				return Integer.compare(x[1], y[1]);
			}
		});
		
		for(int i=0; i<n; i++) {
			bw.write(String.valueOf(arr[i][0]+" "+ arr[i][1]+"\n"));
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}