/* 생산일련번호 */

class Product
{
    static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo; // 인스턴스 고유의 번호

    {
        ++count;
        serialNo = count; // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장
    }

    public Product() { } // (기본)생성자 -> 생략 가능
}

class ProductTest 
{
    public static void main(String[] args)
    {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 serial no은 " + p1.serialNo + "입니다.");
        System.out.println("p2의 serial no은 " + p2.serialNo + "입니다.");
        System.out.println("p3의 serial no은 " + p3.serialNo + "입니다.");
        
        System.out.println("-> 생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
