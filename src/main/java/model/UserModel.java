package model;

import java.io.Serializable;
import java.util.List;

public class UserModel implements Serializable{

    private String username;

    private String password;

    private String realname;

    private WorkInfoModel workInfo;

    private SchoolInfoModel schoolInfo;

    private List<SchoolInfoModel> schoolInfoList;

    private List<WorkInfoModel> workList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public WorkInfoModel getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(WorkInfoModel workInfo) {
        this.workInfo = workInfo;
    }

    public SchoolInfoModel getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(SchoolInfoModel schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public List<WorkInfoModel> getWorkList() {
        return workList;
    }

    public void setWorkList(List<WorkInfoModel> workList) {
        this.workList = workList;
    }

    @Override
    public String toString() {
        return "UserModel [username=" + username + ", password=" + password +"schoolInfoList="+schoolInfoList.toString()+"workList="+workList.toString()+ "]";

    }

    public List<SchoolInfoModel> getSchoolInfoList() {
        return schoolInfoList;
    }

    public void setSchoolInfoList(List<SchoolInfoModel> schoolInfoList) {
        this.schoolInfoList = schoolInfoList;
    }
}