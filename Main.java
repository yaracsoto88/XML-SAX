import java.io.File;
import java.util.Vector;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    
    public static void main(String[] args) {
        new Main().inicio();
        
    }
    public void inicio() {
        try {
            File inputFile = new File("bookings.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLSAXHandler userHandler = new XMLSAXHandler();
            saxParser.parse(inputFile, userHandler);

            Vector<Booking> bookingList = userHandler.getBookings();
            for (Booking booking : bookingList) {
                System.out.println(booking);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  

    }
    

