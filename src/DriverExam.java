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
			if (studentAnswers[i] == correctAnswers[i])
			
				totalCorrect++;
				
		}
		return totalCorrect;
	}
	
	public int totalIncorrect(char[] studentAnswers)
	{
		int totalIncorrect=0;
		for (int i = 0; i < studentAnswers.length; i++)
		{
			if (studentAnswers[i] != correctAnswers[i])
			
				totalIncorrect++;
				
		}
		return totalIncorrect;
	}
	
	public int[] questionsMissed(char[] studentAnswers)
	{
		int[] out = new int[totalIncorrect(studentAnswers)];
		int currentQuestion = 0;
		for (int i=0; i < studentAnswers.length; i++)
		{
			if (studentAnswers[i] != correctAnswers[i])
				out[currentQuestion] = i+1;
				currentQuestion++;
		}
		return out;
	}
	
	public boolean passed(char[] studentAnswers)
	{
		if ((double)totalCorrect(studentAnswers)/studentAnswers.length >= .75)
		{
			return true;
		}
		return false;
	}
	
}