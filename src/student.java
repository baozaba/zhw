public class student {  
    private String id;      
    private String name;     
    private String[] activities; 
  
      
    public student(String id, String name, int numActivities) {  
        this.id = id;  
        this.name = name;  
        this.activities = new String[numActivities];  
    }  
  
     
    public void addActivity(int index, String activity) {  
        if (index >= 0 && index < activities.length) {  
            activities[index] = activity;  
        }
        else {  
            System.out.println(" ");

        }  
}
  
     
    
    public String toString() {  
        StringBuilder sb = new StringBuilder();  
        sb.append("studentID: ").append(id).append("\n");  
        sb.append("studentName: ").append(name).append("\n");  
        sb.append("extraActivities: ");  
        for (String act : activities) {  
            if (act != null) {  
                sb.append(act).append(", ");  
            }  
        }  
        if (sb.length() > 0) {  
            sb.delete(sb.length() - 2, sb.length());  
        }  
        return sb.toString();  
    }  
}