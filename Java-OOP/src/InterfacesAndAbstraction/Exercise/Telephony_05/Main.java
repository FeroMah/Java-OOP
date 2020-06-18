package InterfacesAndAbstraction.Exercise.Telephony_05;





import InterfacesAndAbstraction.Exercise.Telephony_05.Telephony.Smartphone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> phoneNumbers = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        Smartphone smartPhone = new Smartphone(phoneNumbers, urls);

        System.out.println(smartPhone.call());
        System.out.println(smartPhone.browse());
    }
}
