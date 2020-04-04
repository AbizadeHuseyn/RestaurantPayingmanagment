public class Restaurant {
    private String name;
    private String location;
    private String contact;
    private String shortHistory;

    public Restaurant(String name, String location, String contact, String shortHistory) {
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.shortHistory = shortHistory;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public String getShortHistory() {
        return shortHistory;
    }
}
