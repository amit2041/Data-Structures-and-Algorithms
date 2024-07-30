package String;
import java.util.Scanner;
public class CountAndSay {
	public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        if(n == 1)
            return "1";
        else{
            String current = writeAsYouSpeak(n - 1);
            StringBuilder sb = new StringBuilder();
            int index = 0;
            char pre = current.charAt(index);
            int count = 0;
            while(index < current.length()){
                char c = current.charAt(index);
                if(c == pre){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(pre);
                    pre = c;
                    count = 1;
                }
                if(index == current.length() - 1){
                    sb.append(count);
                    sb.append(c);
                }
                index++;
            }
            return sb.toString();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        StringBuffer sb = new StringBuffer();

        while (t-- > 0) {
            int n = s.nextInt();
            String ans = CountAndSay.writeAsYouSpeak(n);
            sb.append(ans + "\n");
        }
        System.out.print(sb);

	}

}
