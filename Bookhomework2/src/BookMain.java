public class BookMain {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary(1500,"新华词典","版本2");
        Book book = new Book(1500,"新华词典" );
        System.out.println(book.getName());
        System.out.println(book.getPages());
        System.out.println(dictionary.getEdition());
    }
}
