public class Student {
    private String name;
    private String batch;
    private String timings[];
    private String subjects[];

    public void setName(String name){
        this.name=name;
    }
    public void setBatch(String batch){
        this.batch=batch;
    }
    public void setSubjects(String subjects[]){
        this.subjects=subjects;
    }
    public void setTimings(String timings[]){
        this.timings=timings;
    }
    public String getName(){
        return name;
    }
    public String getBatch(){
        return batch;
    }
    public String[] getTimings(){
        return timings;
    }
    public String[] getSubjects(){
        return subjects;
    }
    Student(String name,String batch,String subjects[],String timings[])
    {
        this.name=name;
        this.batch=batch;
        this.subjects=subjects;
        this.timings=timings;
    }
}

