package ro.siit.exceptions;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TryCatchThrow {
    public static void methodWithExeption() throws MyException{
            throw new MyException("Illegal message");
    }

    public static void main(String[] args) throws ExecutionException {
        try {
            methodWithExeption();
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
