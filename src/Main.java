public class Main {
    public static void main(String[] args) {
        Human maks = new Human("Максим", "Минск",35 /*6000 */, "бренд-менеджер");
        Human ann = new Human("Аня", null, 29, "методист образовательных программ");
        Human kate = new Human(null, "Калининград", 28, null);
        Human artem = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, null);
        printData(maks);
        printData(ann);
        printData(kate);
        printData(artem);
        printData(vladimir);

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59,0);
        Flower chrysanthemum = new Flower("Хризантема", null, 15.00, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower hypsofila = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(hypsofila);
        Bouquet bouquet = new Bouquet(rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, hypsofila);
        System.out.println("Состав букета: " + bouquet);
        System.out.println("Стоимость: " + String.format("%.2f",bouquet.getCost()));
        System.out.println("Срок жизни: " + bouquet.getLifeSpan());
    }
    public static void printData(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ", я из города " + human.getTown() + ", я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.getJob() +  ". Будем знакомы!");
    }



}