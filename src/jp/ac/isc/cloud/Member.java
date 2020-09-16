package jp.ac.isc.cloud;

public class Member {
	private String id; //user_tableのidを格納
	private String name; //user_tableのnameを格納
	private String picture; //user_tableのpictureを格納

	//user_tableのid、nameが渡される
	public Member(String id, String name, String picture) {
		this.id = id;
		this.name = name;
		this.picture = picture;
	}

	//idを返す
	public String getId() {
		return id;
	}

	//idをセット
	public void setId(String id) {
		this.id = id;
	}

	//nameを返す
	public String getName() {
		return name;
	}

	//nameをセット
	public void setName(String name) {
		this.name = name;
	}

	//pictureを返す
	public String getPicture() {
		return picture;
	}

	//pictureをセット
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
