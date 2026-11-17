package mylab.student.exception;

public class InvalidGradeException extends Exception {
	
	private int CurrentGrade;
	
    public InvalidGradeException(String message, int CurrentGrade) {
        super(message);
        this.CurrentGrade = CurrentGrade;
    }
}
