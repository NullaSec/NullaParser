import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogAnalyzer {
    private Map<String, Integer> failedIPdata = new HashMap();
    private int totalFailedAttempts = 0;
    private ArrayList<String> users = new ArrayList<>();
    
    public LogAnalyzer(){
        // timestamp
        // user
        // rhost (ip)
        // event type

    }

    public void analizeLogs(ArrayList<String> logLines){

        System.out.println("Analyzing Logs...");

        for (String line : logLines){
            if (line.contains("authentication failure")){
                totalFailedAttempts += 1;

                String[] parts = line.split(" ");
                
                // Sort through parts of the log to find relevant data
                for (String part : parts){
                    if (part.startsWith("rhost=")){  // remote host (ip)
                        String ip = part.substring(6);
                        failedIPdata.put(ip, failedIPdata.getOrDefault(ip, 0) + 1);        
                    }

                    if (part.startsWith("user=")){  // username
                        String user = part.substring(5);
                        if (users.contains(user) == false){
                            users.add(user);
                        }
                    }

                    if (part.startsWith())


                }

            }
        }
    }
}
