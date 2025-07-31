
import java.util.ArrayList;
import java.util.List;



public class reverseInteger {
    public static void main(String[] args) {

        int num = 5467;

        String numstr = Integer.toString(num);

        System.out.println(numstr);

        List<String> numstrlist = new ArrayList<>();

        for(int i=0;i<numstr.length();i++){
            numstrlist.add(String.valueOf(numstr.charAt(i)));
        }

        System.out.println(numstrlist);

        // List<String> numstrlistreverse = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i=numstrlist.size()-1;i>=0;i--){
            sb.append(numstrlist.get(i));
            // System.out.println(numstrlist.get(i));
        }

        System.out.println(sb);


        int rev = Integer.parseInt(sb.toString());

        System.out.println(rev);

        




       



       


        
    }
}
