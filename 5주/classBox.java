class classBox {
	private int 가로;
	private int 세로;
	private int 높이;
	private int volume;
	
	public int get가로(){
		return 가로;
	}
	public void set가로(int 가) {
		가로=가;
	}
	public int get세로() {
		return 세로;
	}
	public void set세로(int 세) {
		세로=세;
	}
	public int get높이() {
		return 높이;
	}
	public void set높이(int 높) {
		높이=높;
	}
	public int getVolume() {
		int volume;
		volume = 가로*세로*높이;
		return volume;
	}
	public void setVolume(int v) {
		volume=v;
	}
}
