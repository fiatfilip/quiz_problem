package ro.siit.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        // Double.parseDouble(args[12]);
        try {
            Double.parseDouble(args[0]);
            System.out.println("Tot OK");
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Nu ati dat o valoare");
        }catch(NumberFormatException nfex) {
            System.out.println("Nu ati dat valoare corecta");
        }catch(Exception ex) {
            System.out.println("tratam orice");
        }finally {
            System.out.println("ceva finally");
        }
        System.out.println("Gata");
    }
}
