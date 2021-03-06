package music;
public class Favourites {
	MusicTrack[] favourites = new MusicTrack[5];
	public void addTrack(String artist, String title) {
		if (this.favourites[4] != null) {
			System.out.println("Sorry, can't add: " + new MusicTrack(artist, title));
			return;
		}
		for (int i = 0; i < 5; i++) {
			if (this.favourites[i] == null) {
				this.favourites[i] = new MusicTrack(artist, title);
				break;
			}
		}
	}
	public void showFavourites() {
		System.out.println();
		for (int i = 0; i < 5; i++) {
			MusicTrack mt = favourites[i];
			if (mt != null) {
				System.out.println(mt);
			}
		}
	}
	public static void main(String[] args){
		Favourites favourites = new Favourites();
		favourites.addTrack("Fun", "Some Nights");
		favourites.addTrack("Oliver Tank", "Help You Breathe");
		favourites.addTrack("Horse Feathers", "Fit Against the Country");
		favourites.addTrack("Emile Sande", "Country House");
		favourites.addTrack("Fun", "Walking the Dog");
		favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
		favourites.showFavourites();
	}
}
