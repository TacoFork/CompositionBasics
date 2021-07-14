import java.util.ArrayList;

public class CompositionBasics {
    public static void main(String[] args) {
        ArrayList<String> schoolList = new ArrayList<>();
        schoolList.add("GMU");
        schoolList.add("Robinson");
        schoolList.add("Terra Centre");
        schoolList.add("MCC");
        schoolList.add("NOVA");
        schoolList.add("ODU");
        schoolList.add("UVA");
        schoolList.add("VT");
        schoolList.add("Trinity");
        schoolList.add("NYU");

        Person bobby = new Person();

        Education bobbyEducation = bobby.getEducation();
        bobbyEducation.setSchools(schoolList);

        Job bobbyJob = bobby.getJob();
        bobbyJob.setId(12345);
        bobbyJob.setRole("Java Developer");

        System.out.print(bobby.toString());
    }
}