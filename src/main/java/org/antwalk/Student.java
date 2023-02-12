package org.antwalk;

public class Student {
	String name;
	int engMarks,hindiMarks,mathsMarks;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public void avgMark() {
		float total,average;
		total=this.engMarks+this.hindiMarks+this.mathsMarks;
		average=total/3;
		System.out.println("The average of marks obtained is : "+average);
		
	}
	public void showResult() {
		// TODO Auto-generated method stub
		float total,average;
		total=this.engMarks+this.hindiMarks+this.mathsMarks;
		average=total/3;
		System.out.println("Marks in English :"+this.engMarks);
		System.out.println("Marks in Hindi :"+this.hindiMarks);
		System.out.println("Marks in maths :"+this.mathsMarks);
		System.out.println("Average marks :"+average);
		System.out.println("Percentage :"+(average*100)/100);

	}
}
