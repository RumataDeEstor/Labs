/**
 * Created by User on 29.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        int count = 1;
         Book mybook = new Book("Зелёная ромашка", "Алина", "Сад и огород",
                "Мягкий", 2015, 111, 20, count++);

//        System.out.println("name "+mybook.getName()+
//        " author "+mybook.getAuthor()+
//        " pages "+mybook.getPages()+" id "+mybook.getId());

        Book mybook2 = new Book("Мгла", "Стивен Кинг", "Москва-Экшен","Твёрдый",
                2015, 500, 50, count++);

//        System.out.println("name "+mybook2.getName()+
//                " author "+mybook2.getAuthor()+
//                " pages "+mybook2.getPages()+" id "+mybook2.getId());

        Book mybook3 = new Book ("Зелёная миля", "Стивен Кинг", "Москва-Экшен",
                "Мягкий", 1998, 503, 20, count++);

        Book library1 [] = {mybook, mybook2, mybook3};
        searchByAuthor(library1,"Стивен Кинг");
        searchByPOffice(library1, "Сад и огороды");
        searchByPYear(library1, 2000);
        searchByPOffice(library1, "Просвещение");

    }
    static void searchByAuthor(Book library [], String author){  // shorter?
        boolean match = false;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getAuthor() == author) {
                match = true;
                System.out.println(library[i].getId() +
                        ". " + library[i].getName());
            } else if ((i == library.length-1)&& (match == false)) {
                System.out.println("Ничеге не найдено.");
            }
        }
    }
    static void searchByPOffice (Book library [], String pOffice) {
        boolean match = false;

        for (int i = 0; i < library.length; i++) {
            if (library[i].getPOffice() == pOffice) {
                match = true;
                System.out.println(library[i].getId()+
                        ". "+library[i].getName());
            } else if ((i == library.length-1)&& (match == false)) {
                System.out.println("Ничеге не найдено.");
            }
        }
    }
    static void searchByPYear (Book library [], int pYear) {
        boolean match = false;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getPYear() >= pYear) {
                match = true;
                System.out.println(library[i].getId() +
                        ". " + library[i].getName());
            } else if ((i == library.length-1)&& (match == false)) {
            System.out.println("Ничеге не найдено.");
            }
        }
    }
}
