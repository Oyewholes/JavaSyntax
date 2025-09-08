public class switcht {
    public static void main(String[] args) { 
        System.out.println(getDayName(0));
        
    }

    public static String getDayName(int dayNum){
        String dayName = "";
        switch(dayNum){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number. Please enter a number between 1 and 7.";
        }    
        return dayName;
    } 
}
