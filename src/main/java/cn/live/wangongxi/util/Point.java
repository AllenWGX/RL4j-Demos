package cn.live.wangongxi.util;

import lombok.Getter;
import lombok.Setter;

import com.google.common.base.Objects;

@Setter
@Getter
public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(){}
	
	@Override
	public boolean equals(Object that){
		if(!(that instanceof Point))return false;
		Point pThat = (Point)that;
		if( this.x == pThat.getX() &&
			this.y == pThat.getY()	)return true;
		return false;
	}
	
	@Override
	public int hashCode(){
		return Objects.hashCode(x,y);
	}
	
	@Override
	public String toString(){
		return String.format("(%s,%s)", x,y);
	}
}
