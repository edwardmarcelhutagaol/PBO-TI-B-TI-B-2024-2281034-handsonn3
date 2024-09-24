package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanbuah = { "Apel", "Pisang","Mangga", "Jeruk", "Durian", "Anggur" };
        int counter = 0;
        do{
            String[] buah = { "Apel", "Pisang","Mangga", "Jeruk", "Durian", "Anggur" };
            counter++;
        }while (counter < kumpulanbuah.length);
    }
}
