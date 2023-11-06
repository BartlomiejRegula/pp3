public class Clock {
    int hours;
    int minutes;
    int alarmHour;
    int alarmMinute;
    
    public Clock(){
        this.hours = 0;
        this.minutes = 0;
    }

    public Clock(int hour,int minute){
        this.hours=hour;
        this.minutes=minute;
    }

    public void setClock(int hour,int minute){
        this.hours = hour;
        this.minutes = minute;
        
    }

    public void setClock(){
        this.hours = 0;
        this.minutes = 0;
    }

    public void displayTime(){
        System.out.printf("%02d:%02d\n", hours, minutes);
    }

    public void setAlarm(int hour,int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }


    public void addOneMinute(){
        if (minutes == 59 && hours == 23) {
            minutes=0;
            hours=0;
        } else if (minutes == 59) {
            minutes = 0;
            hours++;
        }else {
            minutes++;
        }
        if (hours == alarmHour && minutes == alarmMinute){
            runAlarm();
        }
    }

    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !! ");
    }





}
