package model;

import java.io.Serializable;

public class SchoolInfoModel implements Serializable {


    private String schoolType;

    private String schoolName;

    private String specialty;

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "SchoolInfoModel{" +
                "schoolType='" + schoolType + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
