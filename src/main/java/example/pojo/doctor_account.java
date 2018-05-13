package example.pojo;
import java.util.List;
public class doctor_account {
    private String doctor_account_id;
    private String doctor_name;
    private String department;
    private List<medical_case> medical_caselist;
    public doctor_account(){
        super();
    }
    public doctor_account(String doctor_account_id,String doctor_name,String department){
        this.doctor_account_id=doctor_account_id;
        this.doctor_name=doctor_name;
        this.department=department;

    }
    public void setDoctor_account_id(String doctor_account_id) {
        this.doctor_account_id = doctor_account_id;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMedical_caselist(List<medical_case> medical_caselist) {
        this.medical_caselist = medical_caselist;
    }

    public String getDoctor_account_id() {
        return doctor_account_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getDepartment() {
        return department;
    }

    public List<medical_case> getMedical_caselist() {
        return medical_caselist;
    }
}