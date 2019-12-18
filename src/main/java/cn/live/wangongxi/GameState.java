package cn.live.wangongxi;

import lombok.Getter;
import lombok.Setter;

import org.deeplearning4j.rl4j.space.Encodable;


@Getter
@Setter
public class GameState implements Encodable{
	
	private double x;
	private double y;
	
	public GameState(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double[] toArray() {
		double[] ret = new double[2];
		ret[0] = x;
		ret[1] = y;
		return ret;
	}

}
