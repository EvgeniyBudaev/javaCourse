package programaniya.Files.DataInputOutputStream;

import java.io.*;

public class Main {
    /* DataInputStream и DataOutputStream позволяют записывать в файл и читать из него примитивные типы данных. */

    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\DataInputOutputStream\\my_test.bin"));
            DataInputStream inputStream = new DataInputStream(
                    new FileInputStream("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\DataInputOutputStream\\my_test.bin"));
                ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(7.8);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

