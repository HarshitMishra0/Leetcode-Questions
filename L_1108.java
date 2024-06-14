public class L_1108 {

    public String defangIPaddr(String address) {

        address = address.replace(".", "[.]");

        return address;
    }

}
