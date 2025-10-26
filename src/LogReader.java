import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 

public class LogReader {
    private String logpath;

    public LogReader(String logpath){
        this.logpath = logpath;
    }

    public ArrayList<String> ReadLogs(){

        ArrayList<String> logLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(logpath))){
            String line;
            while ((line = br.readLine()) != null){
                logLines.add(line);
            }
        }
        catch (IOException e){
            System.err.println("Error reading log file: " + logpath);
            e.printStackTrace();

            return new ArrayList<>(); // Prevents program crash
        }

        return logLines;
    }

    public String getLogpath() {
        return logpath;
    }

    public void setLogpath(String newLogpath){
        this.logpath = newLogpath;
    }


}
