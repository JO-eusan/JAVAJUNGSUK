/* 기계 유닛 수리 */

class RepairableTest 
{
    public static void main(String[] args)
    {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        SCV scv = new SCV();
        
        scv.repair(tank); // Tank 수리
        scv.repair(dropship); // dropship 수리
        
        /* marine은 수리 가능한 유닛이 아니기 때문에 수리 불가능 */
    }    
}

interface Repairable { } // 수리 가능한 기계 유닛을 위한 인터페이스

class Unit
{
    int hitPoint;
    final int MAX_HP;

    Unit(int hp) // 생성자
    {
        MAX_HP = hp;
    }
    // ...
}

class GroundUnit extends Unit
{
    GroundUnit(int hp) // 생성자
    {
        super(hp); // 조상클래스의 생성자로
    }
}

class AirUnit extends Unit
{
    AirUnit(int hp) // 생성자
    {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable // 수리 가능한 기계 유닛 중 하나 
{
    Tank() // 생성자
    {
        super(150); // Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }

    public String toString()
    {
        return "Tank";
    }
    // ...
}

class Dropship extends AirUnit implements Repairable // 수리 가능한 기계 유닛 중 하나
{
    Dropship() // 생성자
    {
        super(125); // Dropship의 HP는 125이다.
        hitPoint = MAX_HP;
    }

    public String toString()
    {
        return "Dropship";
    }
    // ...
}

class Marine extends GroundUnit // 수리 가능한 기계 유닛이 아님
{
    Marine() // 생성자
    {
        super(40); // Marine의 HP는 40이다.
        hitPoint = MAX_HP;
    }

    public String toStinrg()
    {
        return "Marine";
    }
    // ...
}

class SCV extends GroundUnit implements Repairable // 수리 가능한 기계 유닛 중 하나 (수리의 주체)
{
    SCV() // 생성자
    {
        super(60); // SCV의 HP는 60이다.
        hitPoint = MAX_HP;
    }

    void repair(Repairable r)
    {
        if(r instanceof Unit)
        {
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP)
            {
                /* Unit을 수리한다. */
                u.hitPoint++;
            }
            System.out.printf("%s의 수리가 끝났습니다.\n", u.toString());
        }
    }

}
