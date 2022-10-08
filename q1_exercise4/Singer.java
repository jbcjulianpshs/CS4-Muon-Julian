package q1_exercise4;

/**
 *
 * @author johnb
 */
public class Singer {
    private String name;
    private int noOfPerformances = 5;
    private double earnings = 500;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public void setName(String n){
        name = n;
    }
    
    public void setNamePerformances(String n, int p){
        name = n;
        noOfPerformances = p;
        totalPerformances += p;
    }
    
    public void setNameEarnings(String n, double e){
        name = n;
        earnings = e;
    }
    
    public void setNamePerformancesEarnings(String n, int p, double e){
        name = n;
        noOfPerformances = p;
        totalPerformances += p;
        earnings = e;
    }
    
    public void setNameSong(String n, Song s){
        name = n;
        favoriteSong = s;
    }
    
    public void setNamePerformancesSong(String n, int p, Song s){
        name = n;
        noOfPerformances = p;
        totalPerformances += p;
        favoriteSong = s;
    }
    
    public void setNameEarningsSong(String n, double e, Song s){
        name = n;
        earnings = e;
        favoriteSong = s;
    }
    
    public void setNamePerformancesEarningsSong(String n, int p, double e, Song s){
        name = n;
        noOfPerformances = p;
        totalPerformances += p;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int n){
        totalPerformances++;
        noOfPerformances++;
        earnings = earnings + (100*n);
    }
    
    public void performForAudience(int n, Singer s){
        totalPerformances++;
        totalPerformances++;
        noOfPerformances++;
        s.noOfPerformances++;
        earnings += ((100*n)/2);
        s.earnings += ((100*n)/2);
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
    }
    
    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Number of performances: " + noOfPerformances);
        System.out.println("Earnings: " + earnings);
        System.out.println("Favorite song: " + favoriteSong.getName());
    }
    
    public static void getTotalPerformances(){        
        System.out.println("Total Performances: " + totalPerformances);
    }
}
