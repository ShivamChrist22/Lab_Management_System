package LabSys;

public interface Lesson {
    public long getLessonId();
    public String getLessonTitle();
    public String getLessonType();
    public String getLessonContent();
    //public Duration getLessonDuration();
    public void showLessonDetails();
}
