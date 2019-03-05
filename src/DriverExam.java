/**
 *                   
 * @author Tyler Muldoon
 *Driver Exam
 */
public class DriverExam 
{
	private char[] correctAnswers;
	
	public DriverExam(char[] c)
	{
		correctAnswers = c;
		
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int totalCorrect=0;
		for (int i = 0; i < studentAnswers.length; i++)
		{
			if (studentAnswers[i] != correctAnswers[i])
				totalCorrect++;
		}
		return totalCorrect;
	}
	
	public int[] questionsMissed(studentAnswers)
	{
		
	}
	
}
