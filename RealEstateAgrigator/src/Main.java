import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // get RoyalLePage Listings
        ArrayList<Listing> RoyalLePageListings = ListingFactory.get(Site.RoyalLePage);

        for (Listing listing: RoyalLePageListings) {
            System.out.println(listing + "\n");
        }

        //get DuProprio Listings
        // DONE
//        ArrayList<Listing> duproprioListings = ListingFactory.get(Site.DuProprio);
//        System.out.println(duproprioListings.size());
//        for (Listing l : duproprioListings) {
//            System.out.println(l + "\n");
//        }

        //get Centris Listings
//        ArrayList<Listing> centrisListings = ListingFactory.get(Site.Centris);
//        System.out.println(centrisListings.get(0));
//        System.out.println(centrisListings.size());
    }
}