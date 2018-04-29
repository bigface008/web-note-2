package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer problemID;

    private String userName;

    private String Name;

    private String Description;

    private String Reason;

    private String subject;

    private String semester;

    private String addDate;

    private String latestEditDate;

    private Integer redoTimes;

    private String answer;

    private String tags;

    public Integer getID() {
        return problemID;
    }

    public void setID(Integer id) {
        this.problemID = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getProblemName() {
        return Name;
    }

    public void setProblemName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        this.Reason = reason;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String adddate) {
        this.addDate = adddate;
    }

    public String getLatestEditDate() {
        return latestEditDate;
    }

    public void setLatestEditDate(String date) {
        this.latestEditDate = date;
    }

    public Integer getRedoTimes() {
        return redoTimes;
    }

    public void setRedoTimes(Integer times) {
        this.redoTimes = times;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

}