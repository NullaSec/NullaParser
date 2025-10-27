import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        String logpath = "/home/nullasec/repos/NullaParser/logs/example_auth.log";
        
        LogReader reader = new LogReader(logpath);
        ArrayList<String> logs = reader.ReadLogs();
        
        LogAnalyzer analyzer = new LogAnalyzer();
        analyzer.analizeLogs(logs);
    }
}
