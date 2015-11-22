package ee433.creational.singleton;

public class Score {
	private static Score uniqueInstance = new Score();
	private static Integer _score = 0;
	
	// Private constructor
	private Score(){ }
	
	public static Score getInstance(){
		return uniqueInstance;
	}
	
	public Integer addPoints(Integer points){
		_score += points;
		return _score ;
	}
	
	public Integer getScore(){
		return _score;
	}

}
