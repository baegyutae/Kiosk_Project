import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Burger extends MenuItem {
    public Burger(String name, double price) {
        super(name, price);
    }
}

class FrozenCustard extends MenuItem {
    public FrozenCustard(String name, double price) {
        super(name, price);
    }
}

class Drink extends MenuItem {
    public Drink(String name, double price) {
        super(name, price);
    }
}

class Beer extends MenuItem {
    public Beer(String name, double price) {
        super(name, price);
    }
}

class OrderSystem {
    private ArrayList<MenuItem> cart = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println();
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        System.out.println();
        System.out.print("메뉴를 선택해주세요: ");
    }
    public void displayBurgerMenu() {
        System.out.println("[ Burgers MENU ]");
        System.out.println();
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println();
        System.out.print("메뉴를 선택해주세요: ");
    }
    public void displayFrozenCustardMenu() {
        System.out.println("[ Frozen Custard Menu ]");
        System.out.println();
        System.out.println("1. Anthracite Coffee shake   | W 6.5 | 로컬 로스팅 브랜드 앤트러사이트와 협업한 기간 한정 콜라보레이션 커피 쉐이크");
        System.out.println("2. Classic Hand-Spun Shakes  | W 6.5 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크");
        System.out.println("3. Floats                    | W 6.5 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료");
        System.out.println("4. Cup & Cones               | W 5.4 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림");
        System.out.println();
        System.out.print("메뉴를 선택해주세요: ");
    }
    public void displayDrinksMenu() {
        System.out.println("[ Drinks Menu ]");
        System.out.println();
        System.out.println("1. Raspberry Lemonade    | W 4.8 | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드");
        System.out.println("2. Lemonade              | W 4.3 | 매장에서 직접 만드는 상큼한 레몬에이드");
        System.out.println("3. Fresh Brewed Iced Tea | W 3.5 | 직접 유기농 홍차를 우려낸 아이스 티");
        System.out.println("4. Fountain Soda         | W 2.9 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플");
        System.out.println();
        System.out.print("메뉴를 선택해주세요: ");
    }

    public void displayBeerMenu() {
        System.out.println("[ BeerMenu ]");
        System.out.println();
        System.out.println("1. Abita Root Beer | 4.8 | 청량감 있는 독특한 미국식 무알콜 탄산음료");
        System.out.println();
        System.out.print("메뉴를 선택해주세요: ");
    }

    public void orderBurgers() {
        displayBurgerMenu();
        int burgerChoice = scanner.nextInt();

        if (burgerChoice >= 1 && burgerChoice <= 5) {
            Burger[] burgers = {
                    new Burger("ShackBurger", 6.9),
                    new Burger("SmokeShack", 8.9),
                    new Burger("Shroom Burger", 9.4),
                    new Burger("Cheeseburger", 6.9),
                    new Burger("Hamburger", 5.4)
            };

            System.out.println(burgers[burgerChoice - 1].getName() + "를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인           2. 취소");
            int confirmChoice = scanner.nextInt();

            if (confirmChoice == 1) {
                cart.add(burgers[burgerChoice - 1]);
                System.out.println(burgers[burgerChoice - 1].getName() + "를 장바구니에 추가했습니다.");
            } else {
                System.out.println(burgers[burgerChoice - 1].getName() + "를 장바구니에 추가하지 않았습니다.");
            }
        } else {
            System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
        }
    }

    public void orderFrozenCustard() {
        displayFrozenCustardMenu();
        int frozenCustardChoice = scanner.nextInt();

        if (frozenCustardChoice >= 1 && frozenCustardChoice <= 4) {
            FrozenCustard[] frozenCustards = {
                    new FrozenCustard("Anthracite Coffee shake", 6.5),
                    new FrozenCustard("Classic Hand-Spun Shakes", 6.5),
                    new FrozenCustard("Floats", 6.5),
                    new FrozenCustard("Cup & Cones", 5.4)
            };

            System.out.println(frozenCustards[frozenCustardChoice - 1].getName() + "를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            int confirmChoice = scanner.nextInt();

            if (confirmChoice == 1) {
                cart.add(frozenCustards[frozenCustardChoice - 1]);
                System.out.println(frozenCustards[frozenCustardChoice - 1].getName() + "를 장바구니에 추가했습니다.");
            } else {
                System.out.println(frozenCustards[frozenCustardChoice - 1].getName() + "를 장바구니에 추가하지 않았습니다.");
            }
        } else {
            System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
        }
    }

    public void orderDrinks() {
        displayDrinksMenu();
        int drinksChoice = scanner.nextInt();

        if (drinksChoice >= 1 && drinksChoice <= 4) {
            Drink[] drinks = {
                    new Drink("Raspberry Lemonade", 4.8),
                    new Drink("Lemonade", 4.3),
                    new Drink("Fresh Brewed Iced Tea", 3.5),
                    new Drink("Fountain Soda", 2.9)
            };

            System.out.println(drinks[drinksChoice - 1].getName() + "를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            int confirmChoice = scanner.nextInt();

            if (confirmChoice == 1) {
                cart.add(drinks[drinksChoice - 1]);
                System.out.println(drinks[drinksChoice - 1].getName() + "를 장바구니에 추가했습니다.");
            } else {
                System.out.println(drinks[drinksChoice - 1].getName() + "를 장바구니에 추가하지 않았습니다.");
            }
        } else {
            System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
        }
    }

    public void orderBeer() {
        displayBeerMenu();
        int beerChoice = scanner.nextInt();

        if (beerChoice == 1) {
            Beer[] beers = {
                    new Beer("Abita Root Beer", 4.8)
            };

            System.out.println(beers[beerChoice - 1].getName() + "를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            int confirmChoice = scanner.nextInt();

            if (confirmChoice == 1) {
                cart.add(beers[beerChoice - 1]);
                System.out.println(beers[beerChoice - 1].getName() + "를 장바구니에 추가했습니다.");
            } else {
                System.out.println(beers[beerChoice - 1].getName() + "를 장바구니에 추가하지 않았습니다.");
            }
        } else {
            System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
        }
    }

    public void placeOrder(int orderNumber) {
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다. 주문할 메뉴를 추가해주세요.");
        } else {
            double total = 0;
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");
            for (MenuItem item : cart) {
                System.out.println(item.getName() + " | W " + item.getPrice());
                total += item.getPrice();
            }
            System.out.println();
            System.out.println("[ Total ]");
            System.out.println("W " + total);
            System.out.println();
            System.out.println("1. 주문        2. 메뉴판");
            int orderConfirm = scanner.nextInt();

            if (orderConfirm == 1) {
                System.out.println("주문이 완료되었습니다!");
                System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
                System.out.println("(3초후 메뉴판으로 돌아갑니다.)");

                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cart.clear();
            } else if (orderConfirm == 2) {
                return;
            }
        }
    }

    public void cancelOrder() {
        if (!cart.isEmpty()) {
            System.out.println("진행하던 주문을 취소하시겠습니까?");
            System.out.println();
            System.out.println("1. 확인        2. 취소");
            int cancelChoice = scanner.nextInt();
            if (cancelChoice == 1) {
                cart.clear();
                System.out.println("주문이 취소되었습니다.");
            } else {
                System.out.println("주문이 취소되지 않았습니다.");
            }
        } else {
            System.out.println("취소할 주문이 없습니다.");
        }
    }
}

public class Kiosk {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        Scanner scanner = new Scanner(System.in);

        int orderNumber = 0;

        while (true) {
            orderSystem.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderSystem.orderBurgers();
                    break;
                case 2:
                    orderSystem.orderFrozenCustard();
                    break;
                case 3:
                    orderSystem.orderDrinks();
                    break;
                case 4:
                    orderSystem.orderBeer();
                    break;
                case 5:
                    orderSystem.placeOrder(orderNumber);
                    orderNumber++;
                    break;
                case 6:
                    orderSystem.cancelOrder();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}