import java.net.InetAddress;
import java.net.NetworkInterface;

public class GetMacAddress {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        NetworkInterface nic = NetworkInterface.getByInetAddress(addr);
        byte[] mac = nic.getHardwareAddress();

        String macAddress = formatMacAddress(mac);
        System.out.println(macAddress);
    }

    private static String formatMacAddress(byte[] mac) {
        StringBuilder sb = new StringBuilder();
        for (byte b : mac) {
            sb.append(String.format("%02X-", b));
            // %: Indicates the start of a format specifier.
            // 02: This is a width specifier. It means the formatted value should be at
            // least 2 characters wide. If the value is less than 2 characters, it will be
            // padded with leading zeros (0).
            // X: This is the conversion character. It means the argument should be
            // formatted as an uppercase hexadecimal number.
            // -: This is a literal character that will be appended after the formatted
            // value. It's not part of the format specifier but will be included in the
            // resulting string.
        }
        sb.setLength(sb.length() - 1); // Remove the trailing hyphen
        return sb.toString();
    }
}
