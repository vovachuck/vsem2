package com.company.builder;
/**
  @author   Volodymyr Lakusta
  @project   vsem2
  @class  Student
  @version  1.0.0 
  @since 30.03.2021 - 16.34
**/

import java.time.LocalDate;

public class Student extends Person{

    private int yearOfStudy;
    private String groupName;
    private String chairName;
    private String majorName;
    private String universityName;
    private long studentCardNumber;
    private boolean isLivingInDorm;
    private boolean isStipendiat;
    private String modeOfStudy; // like full-Time Or part-Time
    private double schoolCertificateScore;
    private String curatorName;
    private boolean isBeneficiary;

    public Student() {

    }

    public Student(String firstName, String lastName, String patronymic,
                   LocalDate dateOfBirth, String gender, double height,
                   double weight, boolean hasDriverLicence, String nationality,
                   String maritalStatus, boolean hasChild, boolean hasJob,
                   String speakingLanguages, int yearOfStudy, String groupName,
                   String chairName, String majorName, String universityName,
                   long studentCardNumber, boolean isLivingInDorm, boolean isStipendiat,
                   String modeOfStudy, double schoolCertificateScore, String curatorName, boolean isBeneficiary)
    {
        super(firstName, lastName, patronymic, dateOfBirth, gender, height, weight,
                hasDriverLicence, nationality, maritalStatus, hasChild, hasJob, speakingLanguages);
        this.yearOfStudy = yearOfStudy;
        this.groupName = groupName;
        this.chairName = chairName;
        this.majorName = majorName;
        this.universityName = universityName;
        this.studentCardNumber = studentCardNumber;
        this.isLivingInDorm = isLivingInDorm;
        this.isStipendiat = isStipendiat;
        this.modeOfStudy = modeOfStudy;
        this.schoolCertificateScore = schoolCertificateScore;
        this.curatorName = curatorName;
        this.isBeneficiary = isBeneficiary;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public long getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(long studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public boolean isLivingInDorm() {
        return isLivingInDorm;
    }

    public void setLivingInDorm(boolean livingInDorm) {
        isLivingInDorm = livingInDorm;
    }

    public boolean isStipendiat() {
        return isStipendiat;
    }

    public void setStipendiat(boolean stipendiat) {
        isStipendiat = stipendiat;
    }

    public String getModeOfStudy() {
        return modeOfStudy;
    }

    public void setModeOfStudy(String modeOfStudy) {
        this.modeOfStudy = modeOfStudy;
    }

    public double getSchoolCertificateScore() {
        return schoolCertificateScore;
    }

    public void setSchoolCertificateScore(double schoolCertificateScore) {
        this.schoolCertificateScore = schoolCertificateScore;
    }

    public String getCuratorName() {
        return curatorName;
    }

    public void setCuratorName(String curatorName) {
        this.curatorName = curatorName;
    }

    public boolean isBeneficiary() {
        return isBeneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        isBeneficiary = beneficiary;
    }


    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", groupName='" + groupName + '\'' +
                ", chairName='" + chairName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", universityName='" + universityName + '\'' +
                ", studentCardNumber=" + studentCardNumber +
                ", isLivingInDorm=" + isLivingInDorm +
                ", isStipendiat=" + isStipendiat +
                ", modeOfStudy='" + modeOfStudy + '\'' +
                ", schoolCertificateScore=" + schoolCertificateScore +
                ", curatorName='" + curatorName + '\'' +
                ", isBeneficiary=" + isBeneficiary +
                '}';
    }

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){

            this.studentToBuild.setFirstName(student.getFirstName());
            this.studentToBuild.setLastName(student.getLastName());
            this.studentToBuild.setPatronymic(student.getPatronymic());
            this.studentToBuild.setDateOfBirth(student.getDateOfBirth());
            this.studentToBuild.setGender(student.getGender());
            this.studentToBuild.setHeight(student.getHeight());
            this.studentToBuild.setWeight(student.getWeight());
            this.studentToBuild.setHasDriverLicence(student.isHasDriverLicence());
            this.studentToBuild.setNationality(student.getNationality());
            this.studentToBuild.setMaritalStatus(student.getMaritalStatus());
            this.studentToBuild.setHasChild(student.isHasChild());
            this.studentToBuild.setHasJob(student.isHasJob());
            this.studentToBuild.setSpeakingLanguages(student.getSpeakingLanguages());
            this.studentToBuild.yearOfStudy = student.yearOfStudy;
            this.studentToBuild.groupName = student.groupName;
            this.studentToBuild.chairName = student.chairName;
            this.studentToBuild.majorName = student.majorName;
            this.studentToBuild.universityName = student.universityName;
            this.studentToBuild.studentCardNumber = student.studentCardNumber;
            this.studentToBuild.isLivingInDorm = student.isLivingInDorm;
            this.studentToBuild.isStipendiat = student.isStipendiat;
            this.studentToBuild.modeOfStudy = student.modeOfStudy;
            this.studentToBuild.schoolCertificateScore = student.schoolCertificateScore;
            this.studentToBuild.curatorName = student.curatorName;
            this.studentToBuild.isBeneficiary = student.isBeneficiary;

            return this;
        }


        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        public Builder setLastName(String name){
            studentToBuild.setLastName(name);
            return this;
        }

        public Builder setPatronymic(String name){
            studentToBuild.setPatronymic(name);
            return this;
        }

        public Builder setBirth(LocalDate date){
            studentToBuild.setDateOfBirth(date);
            return this;
        }

        public Builder setGender(String gender){
            studentToBuild.setGender(gender);
            return this;
        }
        public Builder setHeight(double height){
            studentToBuild.setHeight(height);
            return this;
        }
        public Builder setWeight(double weight){
            studentToBuild.setHeight(weight);
            return this;
        }
        public Builder setHasDriverLicence(boolean hasDriverLicence){
            studentToBuild.setHasDriverLicence(hasDriverLicence);
            return this;
        }
        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }
        public Builder setMaritalStatus(String maritalStatus){
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }
        public Builder setHasChild(boolean hasChild){
            studentToBuild.setHasChild(hasChild);
            return this;
        }
        public Builder setHasJob(boolean hasJob){
            studentToBuild.setHasJob(hasJob);
            return this;
        }
        public Builder setSpeakingLanguages(String speakingLanguages){
            studentToBuild.setSpeakingLanguages(speakingLanguages);
            return this;
        }
        public Builder setYearOfStudy(int yearOfStudy){
            studentToBuild.setYearOfStudy(yearOfStudy);
            return this;
        }
        public Builder setGroupName(String groupName){
            studentToBuild.setGroupName(groupName);
            return this;
        }
        public Builder setChairName(String chairName){
            studentToBuild.setChairName(chairName);
            return this;
        }
        public Builder setMajorName(String majorName){
            studentToBuild.setChairName(majorName);
            return this;
        }
        public Builder setUniversityName(String universityName){
            studentToBuild.setUniversityName(universityName);
            return this;
        }
        public Builder setStudentCardNumber(long studentCardNumber){
            studentToBuild.setStudentCardNumber(studentCardNumber);
            return this;
        }
        public Builder setIsLivingInDorm(boolean isLivingInDorm){
            studentToBuild.setLivingInDorm(isLivingInDorm);
            return this;
        }
        public Builder setIsStipendiat(boolean isStipendiat){
            studentToBuild.setStipendiat(isStipendiat);
            return this;
        }
        public Builder setModeOfStudy(String modeOfStudy){
            studentToBuild.setModeOfStudy(modeOfStudy);
            return this;
        }
        public Builder setSchoolCertificateScore(double schoolCertificateScore){
            studentToBuild.setSchoolCertificateScore(schoolCertificateScore);
            return this;
        }
        public Builder setCuratorName(String curatorName){
            studentToBuild.setCuratorName(curatorName);
            return this;
        }
        public Builder setIsBeneficiary(boolean isBeneficiary){
            studentToBuild.setBeneficiary(isBeneficiary);
            return this;
        }
        public Student build(){
            return studentToBuild;
        }
    }
}
