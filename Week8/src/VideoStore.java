import java.util.ArrayList;
public class VideoStore {
	private ArrayList<Video> videos = new ArrayList<>();
	
	public boolean addVideo(String title) {
		for (Video video : videos) {
			// if (video.getTitle() ==  title) {
			if (video.getTitle().equals(title)) { 
				System.out.println(title + " is already in stock.");
				return false;
			}
		}
		videos.add(new Video(title));
		return true;
	}
	public Video getVideo(String title) {
		for (Video video : videos) {
			if(video.getTitle().equals(title)) {
				return video;
			}
		}
		System.out.println("Sorry, cannot find the requested video in the catalogue");
		return null;
	}
	public boolean checkOutVideo(String title) {
		Video video = getVideo(title);
		if (video != null) {
			return video.checkOut();
		}
		else {
			return false;
		}
	}
	public boolean returnVideo(Video video) {
		if (!videos.contains(video)) {
			System.out.println("Sorry, this video did not come from this store");
			return false;
		}
		return video.returnToStore();
	}
	public void rateVideo(Video video, int rating) {
		video.addRating(rating);
	}
	public double getAverageRatingForVideo(Video video) {
		return video.getAverageRating();
	}
	/*public Video[] getCheckedOut() {
		ArrayList<Video> checkedOuts = new ArrayList<>();
		for (Video video : videos) {
			if (video.isCheckedOut()) {
				checkedOuts.add(video);
			}
		}
		return checkedOuts.toArray(new Video[checkedOuts.size()]);
	}*/
	public Video[] getCheckedOut() {
		int count = 0;
		int i = 0;
		for (Video video : videos) {
			if (video.isCheckedOut()) {
				count++;
			}
		}
		Video[] checkedOut = new Video[count];
		for (Video video: videos) {
			if (video.isCheckedOut()) {
				checkedOut[i] = video;
				i++;
			}
		}
		return checkedOut;
	}
	/*public Video mostPopular() {
		double maxRating = 0;
		Video bestVideo = null;
		for (Video video : videos) {
			double rating = video.getAverageRating();
			if(rating > maxRating) {
				bestVideo = video;
				maxRating = rating;
			}
		}
		return bestVideo;
	}*/
	public Video mostPopular() {
		int n = videos.size();
		if (n == 0) {
			return null;
		}
		Video max = videos.get(n-1);
		for(int i = n -2; i > 0; i--) {
			if(videos.get(i).getAverageRating() > max.getAverageRating()) {
				max = videos.get(i);
			}
		}
		return max;
	}
}
