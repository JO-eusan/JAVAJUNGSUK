/* 도형 그리기 */

class DrawShape 
{
    public static void main(String[] args)
    {
        Point[] p = {
                        new Point(100,100),
                        new Point(140, 50),
                        new Point(200, 100)
                    };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150), 50);

        t.draw(); // 삼각형을 그린다.
        c.draw(); // 원을 그린다.
    }
}

class Shape
{
    String color = "black";
    void draw()
    {
        System.out.printf("[color=%s]\n", color);
    }
}

class Point
{
    int x;
    int y;

    Point(int x, int y) // 생성자
    {
        this.x = x;
        this.y = y;
    }
    Point()
    {
        this(0,0); // 입력 없으면 (0,0)으로 초기화
    }

    String getXY()
    {
        return "(" + x + "," + y +")"; // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape
{
    Point center; // 원의 원점 좌표
    int r; // 반지름

    Circle(Point center, int r) // 생성자
    {
        this.center = center;
        this.r = r;
    }
    Circle()
    {
        this(new Point(0,0), 100); // 기본값
    }

    void draw() // 원을 그리는 대신의 원의 정보를 출력
    {
        System.out.printf("[center=(%d,%d), r=%d, color=%s]\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape
{
    Point[] p = new Point[3]; // 삼각형의 3개의 점

    Triangle(Point[] p) // 생성자
    {
        this.p = p;
    }

    void draw()
    {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
