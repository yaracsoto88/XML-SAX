import java.io.File;
import java.util.Scanner;
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
            // for (Booking booking : bookingList) {
            //     System.out.println(booking);
            // }

            boolean exit = false;
            Scanner sc = new Scanner(System.in);

            while (!exit) {
                System.out.println("Introduzca un identificador para ver la información correspondiente. \n Si introduce -1, se sale del programa");
                int valor = sc.nextInt();
                if (valor != -1) {
                    Booking selectedBooking = bookingList.get(valor);
                    System.out.println("Información de la reserva seleccionada:");
                    System.out.println(selectedBooking);

                } else {
                    System.err.println("Saliendo del programa");
                    exit = true;
                }
            }
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
