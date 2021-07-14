public class Person {
    private Job job;
    private Education education;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);

        this.education = new Education();
    }

    public long getSalary() {
        return job.getSalary();
    }

    public void setJob(Job job){
        this.job =  job;
    }

    public Job getJob(){
        return this.job;
    }

    public void setEducation(Education education){
        this.education =  education;
    }

    public Education getEducation(){
        return this.education;
    }

    @Override
    public String toString(){
        return this.job.toString() + this.education.toString();
    }
}
