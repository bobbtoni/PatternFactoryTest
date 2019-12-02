import base.Factory;
import base.Transport;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try {
            IntStream intStream = Arrays.asList(args).stream().mapToInt(s -> Integer.parseInt(s));

            Factory factory = new Factory();
            PrintWriter printWriter = new PrintWriter(System.out);

            intStream.forEachOrdered(type -> {
                Transport transport = factory.getTransport(type);
                if (transport == null) {
                    printWriter.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
                    printWriter.flush();
                } else {
                    transport.printInfo(printWriter);
                }
            });
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
