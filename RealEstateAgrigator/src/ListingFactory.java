import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ListingFactory {
    static ListingEngineer eng;

    public static ArrayList<Listing> get(Site site){
        ArrayList<Listing> listings = null;
        ArrayList<String> html = null;

        switch(site){
            case Remax:
                html = new ArrayList<String>();
                listings = new ArrayList<Listing>();

                break;
            case Centris:
                html = new ArrayList<String>();
                listings = new ArrayList<Listing>();

                try {
                    Document document = Jsoup.connect("https://www.centris.ca/en/properties~for-sale").get();
                    Elements listingCards = document.select("div.description");

                    for (Element card : listingCards) {
                        html.add(card.outerHtml());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (String s : html) {
                    eng = new ListingEngineer(new RemaxBuilder(s));
                    eng.build();
                    listings.add(eng.getListing());
                }

                break;

            case Realtor:
                html = new ArrayList<String>();
                listings = new ArrayList<Listing>();

                try {
                    Document document = Jsoup.connect("https://www.houseful.ca/for-sale/").get();
                    Elements cardWrapperDivs = document.select("div.card-base-info");

                    for (Element cardWrapper : cardWrapperDivs) {
                        html.add(cardWrapper.outerHtml());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (String s : html) {
                    System.out.println(s);
//                    eng = new ListingEngineer(new RemaxBuilder(s));
//                    eng.build();
//                    listings.add(eng.getListing());
                }
                break;
        }
        return listings;
    }
}
