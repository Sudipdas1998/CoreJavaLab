/*
* JavaBean Class: StudentInformation
* @author: Sudip Das
* @Date: 26.10.22
*/
package com.FeesHashMap;

//  declearing a class
public class StudentInformation {

	// instance variables
	private String studentid;

	private String studentName;

	private String courseName;

	private String totalfess;

	private String feessubmited;

	// default constructor
	public StudentInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramitarised constructor
	public StudentInformation(String studentid, String studentName, String courseName, String totalfess,
			String feessubmited) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.courseName = courseName;
		this.totalfess = totalfess;
		this.feessubmited = feessubmited;
	}

	// getters and setters
	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTotalfess() {
		return totalfess;
	}

	public void setTotalfess(String totalfess) {
		this.totalfess = totalfess;
	}

	public String getFeessubmited() {
		return feessubmited;
	}

	public void setFeessubmited(String feessubmited) {
		this.feessubmited = feessubmited;
	}

	// toString Method
	@Override
	public String toString() {
		return "StudentInformation [studentid=" + studentid + ", studentName=" + studentName + ", courseName="
				+ courseName + ", totalfess=" + totalfess + ", feessubmited=" + feessubmited + "]";
	}

}