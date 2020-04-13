package student;

public class Student {
    
    private String ID;
    private int hours;
    private int points;
    private double average;  
    
    public Student(){
        
        this.ID = "18-1111-111";
        this.hours = 4;
        this.points = 12;
        this.average = points/hours;
        
    }
    public String getIdno(){
        return ID;
    }
    
    public int getHours(){
        return hours;
    }
    
    public int getPoints(){
        return points; 
    }
    
    public double getAverage(){       
        return average;
    }
    
    public void showIdno(){
        System.out.println("ID NUMBER: " + ID + "\n");
    } 
    
    public void showHours (){
        System.out.println("HOURS: " + hours + "\n");
    } 
    
    public void showPoints (){
        System.out.println("POINTS: " + points + "\n");
    }
    
    public void showAverage (){
        System.out.println("AVERAGE: " + average + "\n");
    }
    
}
