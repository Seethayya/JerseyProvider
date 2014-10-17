package dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student {

	// Fields

	private Integer studentNo;
	private String studentName;
	private String studentAddress;
	private Date studentDateOfBirth;
    //private College college;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student(Integer studentNo, String studentName, String studentAddress,
			Date studentDateOfBirth) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentDateOfBirth = studentDateOfBirth;
	}

	// Property accessors

	public Integer getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Date getStudentDateOfBirth() {
		return this.studentDateOfBirth;
	}

	public void setStudentDateOfBirth(Date studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

    //@Override
    public boolean equals(Object o) {
        System.out.println("@@@@@@@@@@@@@@@@@@");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentAddress != null ? !studentAddress.equals(student.studentAddress) : student.studentAddress != null)
            return false;
        if (studentDateOfBirth != null ? !studentDateOfBirth.equals(student.studentDateOfBirth) : student.studentDateOfBirth != null)
            return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (studentNo != null ? !studentNo.equals(student.studentNo) : student.studentNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentNo != null ? studentNo.hashCode() : 0;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentAddress != null ? studentAddress.hashCode() : 0);
        result = 31 * result + (studentDateOfBirth != null ? studentDateOfBirth.hashCode() : 0);
        return result;
    }
}