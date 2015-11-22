/**
 *  File: Score.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Singleton
 */

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
