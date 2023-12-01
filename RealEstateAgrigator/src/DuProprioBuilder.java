import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DuProprioBuilder implements IListingBuilder {

    private Listing listing;
    public DuProprioBuilder(String rawListing) {
        this.listing = new Listing();
        this.setRawListing(rawListing);
    }

    @Override
    public void setId() {
        this.listing.setId(IdGenerator.generateID());
    }

    @Override
    public void setType() {
        this.listing.setType("N/A");
    }

    @Override
    public void setSite() {
        this.listing.setSite(Site.DuProprio);
    }

    @Override
    public void setSqft() {
        Document document = Jsoup.parse(this.listing.getRawListing());
        Element sqFootageElement = document.select(".search-results-listings-list__item-description__characteristics-popover:contains(Living space area)").first();

        if (sqFootageElement != null) {
            String sqFootageText = sqFootageElement.nextElementSibling().text();
            try {
                this.listing.setSqft(Double.parseDouble(sqFootageText.replace(",", "").replace(" ft²", "")));
            } catch (NumberFormatException e) {
                // Handle parsing error if needed
            }
        } else {
            this.listing.setSqft(0.0);
        }
    }

    @Override
    public void setAddress() {
        Document document = Jsoup.parse(this.listing.getRawListing());
        Element addressElement = document.select(".search-results-listings-list__item-description__address").first();
        this.listing.setAddress(addressElement.text().trim());
    }

    @Override
    public void setUrl() {
        this.listing.setUrl("");
    }

    @Override
    public void setNumBedrooms() {
        this.listing.setNumBedrooms(0);
    }

    @Override
    public void setNumBathrooms() {
        this.listing.setNumBathrooms(0);
    }

    @Override
    public void setPrice() {
        Document doc = Jsoup.parse(this.listing.getRawListing());
        Element priceElement = doc.select(".search-results-listings-list__item-description__price h2").first();
        String priceString = priceElement.text().replace("$", "").replace(",", "");
        this.listing.setPrice(Double.parseDouble(priceString));
    }

    @Override
    public void setRawListing(String rawListing) {
        this.listing.setRawListing(rawListing);
    }

    @Override
    public Listing getListing() {
        return this.listing;
    }
}
