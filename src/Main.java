import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(sc.readLine()),i=0;
        System.out.println(n);
        String[] s=new String[n];
        while (sc.ready()) {
            System.out.println("该次循环开始 i= "+i);
            try{
                s[i]=sc.readLine();
            }
            catch (IOException e){
                System.out.println("readline 失败");
                e.printStackTrace();
            }
            System.out.println(sc.ready());
            System.out.println(s[i]);
            i++;

        }
        System.out.println("bufferedReader准备关闭了");
        sc.close();
        for (int j=0;j<n;++j){
            System.out.println(s[j]);
        }

        Solution so=new Solution();
        so.wifiPassword(n,s);
    }
}