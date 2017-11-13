package DateDemo;

/**
 * Created by Stelawliet on 17/9/10.
 */
public class InterDemo {
    public static void main(String[] args) {
        Cumputer.Scan(new UsbC());
        Usb_ios ios = new Usb_ios();
        Cumputer.Scan(ios);
        ios.roll();
        USB i = new Usb_ios();
        i.start();
        Usb_ios ii=(Usb_ios)(i);
        ii.roll();
    }

}
