/* 카드 클래스 */

class CardTest 
{
    public static void main(String[] args)
    {
        System.out.println("카드의 폭은 " + Card.width);
        System.out.println("카드의 높이는 " + Card.height);

        Card c1 = new Card(); // 인스턴스 생성
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("Card c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
        System.out.println("Card c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");

        System.out.println("c1의 폭과 높이를 각각 50, 80으로 변경합니다.");
        Card.width = 50;
        Card.height = 80;
        // c1의 값을 변경했지만 클래스 변수이므로 c2도 변경
        System.out.println("Card c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
        System.out.println("Card c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
    }
}

class Card
{
    // 인스턴스는 객체를 생성할 때 생성
    String kind;
    int number;
    // 클래스 변수는 클래스가 메모리에 올라갈 때 바로 생성
    static int width = 100;
    static int height = 250;
}
