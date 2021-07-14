import java.util.ArrayList;

public class Education {
    private ArrayList<String> schools = new ArrayList<>();

    public Education(){
    }

    public void setSchools(ArrayList schools){
        this.schools = schools;
    }

    public ArrayList getSchools(){
        return this.schools;
    }

    @Override
    public String toString(){
        String schoolList = "";
        for (int index = 0; index < this.schools.size(); index++){
            schoolList += "School "  + (index + 1) + ": " + this.schools.get(index) + "\n";
        }
        return schoolList;
    }
}
