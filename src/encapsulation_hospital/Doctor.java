package encapsulation_hospital;

public class Doctor {
    private String name;
    private String specialty;
    private boolean available = true;

    public Doctor(String name, String specialty){
        this.name = name;
        this.specialty = specialty;
    }

    public String getName(){
        return name;
    }

    public String getSpecialty(){
        return specialty;
    }

    public boolean getAvailable(){
        return available;
    }

    public void startTreatment(){
        this.available = false;
        System.out.println("Dr."+name+": 진료 시작");
    }

    public void endTreatment(){
        this.available = true;
        System.out.println("Dr."+name+": 진료 종료");
    }

}
