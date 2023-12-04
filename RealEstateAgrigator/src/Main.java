import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // get RoyalLePage Listings
        //DONE
        ArrayList<Listing> RoyalLePageListings = ListingFactory.get(Site.RoyalLePage);
        for (Listing listing: RoyalLePageListings) {
            System.out.println(listing + "\n");
        }

        //get DuProprio Listings
        // DONE
        ArrayList<Listing> duproprioListings = ListingFactory.get(Site.DuProprio);
        for (Listing l : duproprioListings) {
            System.out.println(l + "\n");
        }

        //get Centris Listings
        //DONE
        ArrayList<Listing> centrisListings = ListingFactory.get(Site.Centris);
        for (Listing l : centrisListings) {
            System.out.println(l + "\n");
        }
    }
}