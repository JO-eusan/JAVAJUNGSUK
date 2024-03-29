/* 카드 선택 */

class DeckTest 
{
    public static void main(String[] args)
    {
        Deck d = new Deck(); // 카드 한 벌을 만든다.
        Card2 c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑음
        System.out.println(c); // System.out.println(c.toString())과 같다.

        d.shuffle(); // 카드를 섞음
        c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑음
        System.out.println(c);
    }    
}

class Deck
{
    final int CARD_NUM = 52; // 카드의 개수
    Card2 cardArr[] = new Card2[CARD_NUM]; // Card객체 배열

    // 생성자
    Deck() // Deck의 카드를 초기화
    {
        int i=0; 

        for(int k=Card2.KIND_MAX; k>0; k--)
            for(int n=0; n<Card2.NUM_MAX; n++)
                cardArr[i++] = new Card2(k, n+1);
    }

    Card2 pick(int index) // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
    {
         return cardArr[index];
    }

    Card2 pick() // Deck에서 카드 하나를 선택
    {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() // 카드의 순서를 섞는다.
    {
        for(int i=0; i<cardArr.length; i++)
        {
            int r = (int)(Math.random() * CARD_NUM);

            Card2 temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }

    }
    
}

class Card2
{
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3; 
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    // 생성자
    Card2()
    {
        this(SPADE, 1); // 기본값
    }
    Card2(int kind, int number)
    {
        this.kind = kind;
        this.number = number;
    }

    public String toString() //  문자열 출력 메서드
    {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}