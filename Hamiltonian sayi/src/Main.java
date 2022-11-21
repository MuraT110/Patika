import java.util.*;

public class Main {
    public static String main(String[] args) {

        String[] strArr = new String[0];
        String [] kenar = strArr[1].substring(1,strArr[1].length()-1).split(",");
        String [] yol = strArr[2].substring(1,strArr[2].length()-1).split(",");

        Map<String,List<String>>graph = new HashMap<>();

        for (String k :kenar){
            String[] nodes = k.split("-");

            graph.putIfAbsent(nodes[0], new ArrayList<>());
            graph.putIfAbsent(nodes[1], new ArrayList<>());

            graph.get(nodes[0]).add(nodes[1]);
            graph.get(nodes[1]).add(nodes[0]);

        }
        for (int i=0; i<yol.length-1; i++ ){
            if (!graph.get(yol[i]).contains(yol[i+1])){

                return yol[i];
            }

        }


        return "yes";
    }
}