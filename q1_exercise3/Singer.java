package q1_exercise3;

/**
 *
 * @author johnb
 */
public class Singer {
    String name;
    int noOfPerformances = 5;
    double earnings = 500;
    Song favoriteSong;
    
    public Singer(String n){
        name = n;
    }
    
    public Singer(String n, int p){
        name = n;
        noOfPerformances = p;
    }
    
    public Singer(String n, double e){
        name = n;
        earnings = e;
    }
    
    public Singer(String n, int p, double e){
        name = n;
        noOfPerformances = p;
        earnings = e;
    }
    
    public Singer(String n, Song s){
        name = n;
        favoriteSong = s;
    }
    
    public Singer(String n, int p, Song s){
        name = n;
        noOfPerformances = p;
        favoriteSong = s;
    }
    
    public Singer(String n, double e, Song s){
        name = n;
        earnings = e;
        favoriteSong = s;
    }
    
    public Singer(String n, int p, double e, Song s){
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int n){
        noOfPerformances = noOfPerformances + n;
        earnings = earnings + (100*n);
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
    }
    
    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Number of performances: " + noOfPerformances);
        System.out.println("Earnings: " + earnings);
        System.out.println("Favorite song: " + favoriteSong.name);
    }
}
