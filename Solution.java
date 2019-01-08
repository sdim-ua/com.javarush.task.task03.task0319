/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        System.out.println(name  + " получает " + num_1 + " через " + num_2 +" лет.");
        
    }
}

