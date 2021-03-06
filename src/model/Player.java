package model;

public class Player implements Comparable<Player>{
	
	 private String name;
	 private String userName;
	 private int recolectedSeeds;
	 
	public Player(String name, int recolectedSeeds,String userName) {
		this.name = name;
		this.recolectedSeeds = recolectedSeeds;
		this.userName=userName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRecolectedSeeds() {
		return recolectedSeeds;
	}
	public void setRecolectedSeeds(int recolectedSeeds) {
		this.recolectedSeeds = recolectedSeeds;
	}

	@Override
	public int compareTo(Player o) {
		if(this.recolectedSeeds == o.recolectedSeeds) {
			return 0;
		} else if(this.recolectedSeeds < o.recolectedSeeds) {
			return 1;
		} else {
			return -1;
		}
	}
	 
	 
}
