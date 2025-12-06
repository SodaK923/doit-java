package encapsulation_hospital;

public class Hospital {
    private Doctor doctor;
    private String hospitalName;

    public Hospital(String hospitalName, Doctor doctor){
        this.hospitalName = hospitalName;
        this.doctor = doctor;
    }

//    public Doctor reserveDoctor(String specialty, boolean available){
//        if(specialty.equals(doctor.getSpecialty()) && doctor.getAvailable()){
//
//            if(hasInsurance){
//
//            }
//        }
//    }
}
