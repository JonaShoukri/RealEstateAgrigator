public class ListingEngineer {
    public IListingBuilder builder;
    ListingEngineer(IListingBuilder builder) {
        this.builder = builder;
    }
    public void build() {
        builder.setId();
        builder.setAddress();
        builder.setSite();
        builder.setPrice();
        builder.setSqft();
        builder.setNumBathrooms();
        builder.setNumBedrooms();
        builder.setUrl();
        builder.setType();
        builder.setSite();
    }
    public Listing getListing() {
        return builder.getListing();
    }
}
