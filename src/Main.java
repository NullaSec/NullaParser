import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        String logpath = "/logs/example_auth.log";
        
        LogReader test = new LogReader(logpath);

        ArrayList<String> list = test.ReadLogs();

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + ": " + list.get(i));
        }


        

    }
}
