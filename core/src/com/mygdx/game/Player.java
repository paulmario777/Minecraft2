package com.mygdx.game;

public class Player {
	
	private float x, y;
	
	private float gravity = 9.8f;
	private float fallTime = 0f;
	
	Player(float x, float y){
		this.x=x;
		this.y=y;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}

}
