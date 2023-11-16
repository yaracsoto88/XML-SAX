public class Booking {
    private String booking;
    private String client;
    private String agency;
    private Double price;
    private String room;
    private String hotel;
    private String check_in;
    private int room_nights;



    public Booking(String booking, String client, String agency, Double price, String room, String hotel, String check_in, int room_nights) {
        this.booking = booking;
        this.client = client;
        this.agency = agency;
        this.price = price;
        this.room = room;
        this.hotel = hotel;
        this.check_in = check_in;
        this.room_nights = room_nights;
    }

    public Booking() {
    }

    public String getBooking() {
        return this.booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHotel() {
        return this.hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCheck_in() {
        return this.check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public int getRoom_nights() {
        return this.room_nights;
    }

    public void setRoom_nights(int room_nights) {
        this.room_nights = room_nights;
    }



    @Override
    public String toString() {
        return "{" +
            " booking='" + getBooking() + "'" +
            ", client='" + getClient() + "'" +
            ", agency='" + getAgency() + "'" +
            ", price='" + getPrice() + "'" +
            ", room='" + getRoom() + "'" +
            ", hotel='" + getHotel() + "'" +
            ", check_in='" + getCheck_in() + "'" +
            ", room_nights='" + getRoom_nights() + "'" +
            "}";
    }

    
    
}
