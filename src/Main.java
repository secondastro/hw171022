public class Main {
    public static void main(String[] args) {
        Human maks = new Human("Максим", "Минск",35, "бренд-менеджер");
        Human ann = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");
        printData(maks);
        printData(ann);
        printData(kate);
        printData(artem);
    }

    public static void printData(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ", я из города " + human.getTown() + ", я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.getJob() +  ". Будем знакомы!");
    }
}