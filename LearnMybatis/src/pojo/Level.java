package pojo;

public class Level {
   
	private int levelID;
	private String levelName;
	public int getLevelID() {
		return levelID;
	}
	public String getLevelName() {
		return levelName;
	}
	
	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	@Override
	public String toString() {
		return "Level [levelID=" + levelID + ", levelName=" + levelName + "]";
	}
	
}
