import java.util.Vector;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLSAXHandler extends DefaultHandler {
    private Booking currentBooking;
    private StringBuilder currentData;
    Vector<Booking> bookings = new Vector<>();

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Inicio del Documento");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Fin del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentData = new StringBuilder();

        if ("booking".equals(qName)) {
            currentBooking = new Booking();

            String locationNumber = attributes.getValue("location_number");
            currentBooking.setBooking(locationNumber);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentData.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("client".equals(qName)) {
            currentBooking.setClient(currentData.toString());
        } else if ("agency".equals(qName)) {
            currentBooking.setAgency(currentData.toString());
        } else if ("price".equals(qName)) {
            currentBooking.setPrice(Double.parseDouble(currentData.toString().replace(",", ".")));
        } else if ("room".equals(qName)) {
            currentBooking.setRoom(currentData.toString());
        } else if ("hotel".equals(qName)) {
            currentBooking.setHotel(currentData.toString());
        } else if ("check_in".equals(qName)) {
            currentBooking.setCheck_in(currentData.toString());
        } else if ("room_nights".equals(qName)) {
            currentBooking.setRoom_nights(Integer.parseInt(currentData.toString()));
        } else if ("booking".equals(qName)) {
            bookings.add(currentBooking);
        }

    }

    public Vector<Booking> getBookings() {
        return bookings;
    }
}
