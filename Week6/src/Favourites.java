public class Favourites {
	MusicTrack[] favouritetracks = new MusicTrack[5];
	
	public void addTrack(String artist, String title) {
		if (this.favouritetracks[4] != null) {
			System.out.println("Sorry, can't add: " + new MusicTrack(artist, title)+"\n");
			return;
		}
		for (int i =0; i < 5; i++) {
			if(this.favouritetracks[i] == null) {
				this.favouritetracks[i] = new MusicTrack(artist, title);
				break;
			}
		}
	}
	public void showFavourites() {
		for (int i = 0; i < 5; i++) {
			MusicTrack music = favouritetracks[i];
			if (music != null) {
				System.out.println(music);
			}
		}
	}
	/*public void showFavourites() {
		for (int i = 0; i < 5; i++) {
			if (this.favouritetracks[i] != null) {
				System.out.println(this.favouritetracks[i]);
			}
			else {
				break;
			}
		}
	}*/
	public static void main(String[] args) {
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
