public class Student {
    private String id;
    private String grade;
    private int jersey ;
    private String position;
    private String cheer;
    private String subject;
    private boolean IsJerseyColor;
    private boolean pitchCatch;


    public Student(String id, String grade, int jersey, String position, String cheer, String subject, boolean jerseyColor, boolean pitchCatch) {
        this.id = id;
        this.grade = grade;
        this.jersey = jersey;
        this.position = position;
        this.cheer = cheer;
        this.subject = subject;
        this.IsJerseyColor= jerseyColor;
        this.pitchCatch = pitchCatch;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) { this.grade = grade; }

    public int getJersey() {
        return jersey;
    }
    public void setJersey(int jersey) { this.jersey = jersey; }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) { this.position = position; }

    public String getCheer() {
        return cheer;
    }
    public void setCheer(String cheer) { this.cheer = cheer; }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) { this.subject= subject}

    public boolean isJerseyColor() {
        return IsJerseyColor;
    }
    public void setJerseyColor(boolean jerseyColor) { this.IsJerseyColor= IsJerseyColor}

    public boolean isPitchCatch() {
        return pitchCatch;
    }
    public void setPitchCatch(boolean pitchCatch) { this.pitchCatch = pitchCatch; }



    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", jersey=" + jersey +
                ", position='" + position + '\'' +
                ", cheer='" + cheer + '\'' +
                ", subject='" + subject + '\'' +
                ", jerseyColor=" + IsJerseyColor +
                ", pitchCatch=" + pitchCatch +
                '}';
    }
}