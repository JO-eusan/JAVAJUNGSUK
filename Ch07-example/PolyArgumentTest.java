/* Product 구입 */

class PolyArgumentTest 
{
    public static void main(String[] args)
    {
        Buyer b = new Buyer();

        b.buy(new Notebook());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}

class Product
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product(int price) // 생성자
    {
        this.price = price;
        this.bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
    }
}
class Notebook extends Product
{
    Notebook() // 생성자
    {
        super(100); // Tv의 가격은 100만원
    }
    public String toString() { return "Notebook"; }
}
class Computer extends Product
{
    Computer() // 생성자
    {
        super(200); // Computer의 가격은 200만원
    }
    public String toString() { return "Computer"; }
}

class Buyer
{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p)
    {
        if(money < p.price)
        {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}
